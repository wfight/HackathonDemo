package tools;

import java.sql.SQLException;

import configs.ServiceConfig;
import tools.ConnectionPool.PooledConnection;




public class DBManager {

	private static PooledConnection conn;
	private static ConnectionPool connectionPool;
	private static DBManager inst;
	
	public  String JDBC_DRIVER = ServiceConfig.getJdbcDriver().toString();
    public  String JDBC_URL = ServiceConfig.getJdbcUrl().toString();
    public  String JDBC_USER = ServiceConfig.getJdbcUser().toString();
    public  String JDBC_PWD = ServiceConfig.getJdbcPwd().toString();
    public  String ININ_CONN = ServiceConfig.getInitConn().toString();
    public  String INCRE_CONN = ServiceConfig.getIncreConn().toString();
    public  String MAX_CONN = ServiceConfig.getMaxConn().toString();

	public void close() {
		try {
			connectionPool.closeConnectionPool();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public DBManager() {
		if (inst != null)
			return;

		// TODO Auto-generated constructor stub

//		String connStr = String.format("jdbc:mysql://%s:%d/%s", Config
//				.getInstance().mysqlHost, Config.getInstance().mysqlPort,
//				Config.getInstance().mysqlDB);
		connectionPool = new ConnectionPool(JDBC_DRIVER, JDBC_URL,
				JDBC_USER, JDBC_PWD, ININ_CONN, INCRE_CONN, MAX_CONN);
		try {
			connectionPool.createPool();
			inst = this;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static PooledConnection getConnection() {
		if (inst == null)
			new DBManager();

		try {

			conn = connectionPool.getConnection();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

	public static void main(String[] args) {

	}

}
