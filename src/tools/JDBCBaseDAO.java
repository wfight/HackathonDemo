package tools;

/*
* <p>Title: EAP��ҵӦ�ÿ���ƽ̨</p>
*
* <p>Description: ּ��Ϊ��λͬ���ṩͳһ�Ļ�������ƽ̨����߿���Ч�ʣ��Ľ�����������</p>
*
* <p>Copyright: Copyright (C) 2012</p>
*
* <p></p>
*/

import java.io.BufferedReader;
import java.io.Reader;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.CaseInsensitiveMap;
import org.apache.log4j.Logger;

import tools.ConnectionPool.PooledConnection;

/**
 * <p> ����:JDBCʵ�ֵĸ���DAO����</p>
 * <p/>
 * ʵ���н����ֱ��JDBC��SpringJDBC,������SpringJDBC�Ĺ�������ԣ�ǿ��ʹ����ͳһ��һ�µı�����
 * <p/>
 * ������Զ����뵽�����ĵ����񻷾��У������Ժ�Hibernate���񻷾��Զ�MIX
 * <p/>
 * <p> Create Date: 2008-04-15 <p>
 *
 * @author: wdf
 * @version 1.0
 */
public class JDBCBaseDAO  {//implements DAOQuery,DAOPageQuery {  todo �ӿڸ���

	static Logger log = Logger
			.getLogger(configs.BaseConfig.class.getName());

    
    public List find(String sql) {
        return find(sql, null);
    }
    
    public List find(String sql, Object param) {
        return find(sql, new Object[]{param});
    }
    
    /**
     * ����sql�Ͳ�����ѯ
     *
     * @return notNull, List{��Сд�޹ص�MAP}
     */
    public List find(String sql, Object[] params) {

        List retList = new ArrayList();

//        Connection conn = getOpenedConnection();
        
        PooledConnection conn = null;

        ResultSet rs = null;
        PreparedStatement statement = null;
        try {
        	conn = DBManager.getConnection();
            statement = conn.getStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    Object param = params[i];
                    statement.setObject(i + 1, param);
                }
            }
            rs = statement.executeQuery();
            ResultSetMetaData resSet = null;
            Map map = null;
            while (rs.next()) {
            	map = new CaseInsensitiveMap();
                if (resSet == null) {
                    resSet = rs.getMetaData();
                }
                for (int i = 1; i <= resSet.getColumnCount(); i++) {
                    if (resSet.getColumnType(i) == Types.CLOB) {
                        map.put(resSet.getColumnName(i), convertClobToString(rs.getClob(i)));//todo
                    }
                    else {
                        map.put(resSet.getColumnName(i), rs.getObject(i));
                    }
                }
                retList.add(map);
            }

        }
        catch (Exception e) {
            log.error("��ҳ��ѯ�����쳣��", e);
            throw new ItimsRuntimeException("��ҳ��ѯ�����쳣����", e);
        }
        finally {
        	closeQuietly(rs);
        	closeQuietly(statement);
        	conn.close();
        }
        return retList;
    }
    
    
    /**
     * ��CLOBת�����ִ�
     *
     * @param clob
     *
     * @return todo clob�ı������⣿
     */
    public static String convertClobToString(Clob clob) {
        String reString = "";
        if (clob != null) {
            try {
                Reader is = clob.getCharacterStream();// �õ���
                BufferedReader br = new BufferedReader(is);
                String s = br.readLine();
                StringBuffer sb = new StringBuffer();
                while (s != null) {
                    sb.append(s);
                    sb.append("\n");
                    s = br.readLine();
                }
                reString = sb.toString().trim();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return reString;
    }
    
    public int execute(String sql) {
        return execute(sql, null);
    }

    public int execute(String sql, Object param) {
        return execute(sql, new Object[]{param});
    }

    /**
     * ����sql�Ͳ���ִ��
     *
     * @param sql    Ԥ�������
     * @param params ����ֵ
     *
     * @return notNull, int
     */
    public int execute(String sql, Object[] params) {
        return execute(sql, params, new Class[]{});
    }

    /**
     * ����sql�Ͳ���ִ��
     *
     * @param sql    Ԥ�������
     * @param params ����ֵ
     * @param types  ����ֵ����(��Nullֵ�ǲ���Ҫ)
     *
     * @return notNull, int
     */
    @SuppressWarnings("unchecked")
	public int execute(String sql, Object[] params, Class[] types) {
        int result = 0;
        PooledConnection conn = null;
        PreparedStatement statement = null;
        try {
        	conn = DBManager.getConnection();
            // ��ѯĳҳ����
            statement = conn.getStatement(sql);
            if (params != null) {
                for (int i = 0; i < params.length; i++) {
                    Object param = params[i];
                    if (param == null) {//null ֵ����
                        statement.setNull(i + 1, mapSqlType(types[i]));
                    }
                    else {
                        if (param instanceof java.util.Date) {//���ڰ�װ
                            statement.setDate(i + 1, new java.sql.Date(((java.util.Date) param).getTime()));
                        }
                        else {
                            statement.setObject(i + 1, param);
                        }
                    }
                }
            }
            result = statement.executeUpdate();

        }
        catch (Exception e) {
        	e.printStackTrace();
//            throw new RuntimeException("ִ�в����쳣����[" + sql + "]", e);
        	log.debug("ִ�в����쳣����[" + sql + "]", e);
        }
        finally {
        	closeQuietly(statement);
        	conn.close();
        	
            
        }
        return result;
    }
    /**
     * ת��java����Ϊsql����
     */
    @SuppressWarnings("unchecked")
	private int mapSqlType(Class clz) {
        if (java.sql.Timestamp.class.isAssignableFrom(clz)) {
            return Types.TIMESTAMP;
        }
        if (java.util.Date.class.isAssignableFrom(clz)) {
            return Types.DATE;
        }
        if (clz.equals(Long.class) || clz.equals(Integer.class)) {
            return Types.NUMERIC;
        }
        if (clz.equals(String.class)) {
            return Types.VARCHAR;
        }
        return Types.OTHER;//todo
    }
    
    /**
     * Close a <code>ResultSet</code>, avoid closing if null and hide any
     * SQLExceptions that occur.
     *
     * @param rs ResultSet to close.
     */
    public static void closeQuietly(ResultSet rs) {
        try {
            close(rs);
        }
        catch (Exception e) {
            // quiet
        }
    }
    
    public static void close(ResultSet rs) throws SQLException {
        if (rs != null) {
            rs.close();
        }
    }
    
    public static void closeQuietly(Statement stmt) {
        try {
            close(stmt);
        }
        catch (Exception e) {
            // quiet
        }
    }
    
    public static void close(Statement stmt) throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
    }

}