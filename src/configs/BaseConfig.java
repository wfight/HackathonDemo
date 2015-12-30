package configs;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;

public class BaseConfig {

	static Logger log = Logger
			.getLogger(configs.BaseConfig.class.getName());

	// ����key��ȡvalue
	public static String readValue(String filePath, String key) {
		Properties props = new Properties();
		filePath = filePath.replace("%20", " ");
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(
					filePath));
			props.load(in);
			String value = props.getProperty(key);
			in.close();
//			log.debug(key + ":" + value);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	// ��ȡproperties��ȫ����Ϣ
	public static void readProperties(String filePath) {
		Properties props = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(
					filePath));
			props.load(in);
			Enumeration en = props.propertyNames();
			while (en.hasMoreElements()) {
				String key = (String) en.nextElement();
				String Property = props.getProperty(key);
//				log.debug(key + ":" + Property);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// д��properties��Ϣ
	public static void writeProperties(String filePath, String parameterName,
			String parameterValue) {
		Properties prop = new Properties();
		try {
			InputStream fis = new FileInputStream(filePath);
			// ���������ж�ȡ�����б�����Ԫ�ضԣ�
			prop.load(fis);
			// ���� Hashtable �ķ��� put��ʹ�� getProperty �����ṩ�����ԡ�
			// ǿ��Ҫ��Ϊ���Եļ���ֵʹ���ַ���������ֵ�� Hashtable ���� put �Ľ����
			OutputStream fos = new FileOutputStream(filePath);
			prop.setProperty(parameterName, parameterValue);
			// ���ʺ�ʹ�� load �������ص� Properties ���еĸ�ʽ��
			// ���� Properties ���е������б�����Ԫ�ضԣ�д�������
			prop.store(fos, "Update '" + parameterName + "' value");
		} catch (IOException e) {
			System.err.println("Visit " + filePath + " for updating "
					+ parameterName + " value error");
		}
	}

	public static void main(String[] args) {
		String path =  BaseConfig.class.getClassLoader().getResource("").getPath();
		
		System.out.println(readValue(path + File.separator + "dbservice.properties",
				"JDBC_DRIVER"));
		System.out.println(readValue(path + File.separator + "dbservice.properties",
				"JDBC_URL"));
		
		System.out.println("OK");
		
		String relativelyPath=System.getProperty("user.dir"); 
		System.out.println(relativelyPath);
		
		System.out.println(new File(".").getAbsolutePath());
		
	}

}
