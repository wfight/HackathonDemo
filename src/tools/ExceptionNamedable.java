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

/**
 * <p>Title:EAP企业应用开发平台</p>
 * <p/>
 * <p>Description: 命名异常，支持异常消息的参数化和国际化 </p>
 * <p/>
 * <p>Copyright: Copyright (c)  2006</p>
 * <p/>
 * <p></p>
 * <p/>
 * <p>Create Date: 2007-4-11  9:52:57<p>
 *
 * @author user
 * @version 1.0
 */


public interface ExceptionNamedable {

    public String getExecptionName();

    public Object[] getParams();

}
