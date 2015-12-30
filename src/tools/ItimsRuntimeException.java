package tools;

/*
 * <p>Title: EAP企业应用开发平台</p>
 *
 * <p>Description: 旨在为各位同仁提供统一的基础开发平台，提高开发效率，改进工作质量！</p>
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
 * @author 王登峰
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
     * 通常是业务性错误，所以不需要 Throwable cause参数
     * todo 添加无参数构造
     *
     * @param namedExecption 异常信息名称
     * @param params         异常信息参数
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
