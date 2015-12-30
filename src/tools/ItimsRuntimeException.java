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

import java.util.Arrays;

/**
 * <p>Title: </p>
 * <p/>
 * <p>wdf 2012</p>
 * <p/>
 * <p>Copyright: Copyright (c)  2006</p>
 * <p/>
 * <p></p>
 *
 * @author ���Ƿ�
 * @version 1.0
 */
public class ItimsRuntimeException extends RuntimeException implements ExceptionNamedable {

    protected String namedExecption;
    protected Object[] params;

    public ItimsRuntimeException() {
        super();
    }

    public ItimsRuntimeException(String message) {
        super(message);
    }

    public ItimsRuntimeException(Throwable cause) {
        super(cause);
    }

    public ItimsRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    //////////////////////////////////

    /**
     * ͨ����ҵ���Դ������Բ���Ҫ Throwable cause����
     * todo ����޲�������
     *
     * @param namedExecption �쳣��Ϣ����
     * @param params         �쳣��Ϣ����
     */
    public ItimsRuntimeException(String namedExecption, Object[] params) {
        super(namedExecption);
        this.namedExecption = namedExecption;
        this.params = params;
    }

    //////////////////////////////////////////////////////////////////////

    public String getExecptionName() {
        return namedExecption;
    }

    public Object[] getParams() {
        return params;
    }

    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(super.toString());
        if (namedExecption != null) {
            sb.append('\n');
            sb.append("params");
            sb.append("{params=").append(params == null ? "null" : Arrays.asList(params).toString());
            sb.append('}');
            sb.append('\n');
        }
        return sb.toString();
    }
}
