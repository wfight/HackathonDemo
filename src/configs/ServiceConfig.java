package configs;

import java.io.File;

public class ServiceConfig extends BaseConfig {

	//private static String PATH =  BaseConfig.class.getClassLoader().getResource("").getPath();
	private static String PATH = ServiceConfig.class.getResource("").getFile().toString();
	//private static String PATH = System.getProperty("user.dir");

	private static String CONFIG_FILE_PATH = PATH + File.separator +"config.properties";

	private static String DB_JDBC_DRIVER = "JDBC_DRIVER";

	private static String DB_JDBC_URL = "JDBC_URL";

	private static String DB_JDBC_USER = "JDBC_USER";

	private static String DB_JDBC_PWD = "JDBC_PWD";
	
	private static String TRIGGER = "TRIGGER";
	
	private static String DB_INIT_CONN = "INIT_CONN";
	
	private static String DB_INCRE_CONN = "INCRE_CONN";
	
	private static String DB_MAX_CONN = "MAX_CONN";
	
	private static String ZK_CONNECT = "CONNECT";
	
	private static String ZK_CONNECTIONTIMEOUT_MS = "CONNECTIONTIMEOUT_MS";
	
	private static String ZK_GROUP_ID = "GROUP_ID";
	
	private static String ZK_TOPIC = "TOPIC";
	
	private static String SMS_COUNT_CAPS = "CAPS";
	
	private static String SMS_CALLED = "CALLED";
	
	private static String REDIS_IP = "redis_ip";
	
	private static String REDIS_PORT = "redis_port";
	
	private static String REDIS_ROLE = "ridis_role";
	
	private static String REDIS_POOL_MAX_ACTIVE = "jedis_pool_maxActive";
	
	private static String REDIS_POOL_MAX_IDLE = "jedis_pool_maxIdle";
	
	private static String REDIS_POOL_MAX_WAIT = "jedis_pool_maxWait";
	
	private static String REDIS_POOL_TEST_ON_BORROW = "jedis_pool_testOnBorrow";
	
	private static String LOCAL_PATH = "localPath";
	
	private static  String Frenrange = "Frenrange";

	private static  String FreMiddlerange = "Fremiddlerange";

	private static  String FrehigHrange = "Frehighrange";
	
	private static  String Disrange = "Disrange";

	private static  String DisMiddlerange = "Dismiddlerange";

	private static  String DisHighrange = "Dishighrange";
	
	public static String getLocalPath() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.LOCAL_PATH);
	}
	
	public static String getJdbcDriver() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DB_JDBC_DRIVER);
	}
	
	public static String getTrigger() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.TRIGGER);
	}
	
	public static String getJdbcUrl() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DB_JDBC_URL);
	}
	
	public static String getJdbcUser() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DB_JDBC_USER);
	}

	public static String getJdbcPwd() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DB_JDBC_PWD);
	}
	
	public static String getInitConn() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DB_INIT_CONN);
	}
	
	public static String getIncreConn() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DB_INCRE_CONN);
	}
	
	public static String getMaxConn() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DB_MAX_CONN);
	}
	
	public static String getRedisIP() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.REDIS_IP);
	}
	
	public static String getRedisPort() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.REDIS_PORT);
	}
	
	public static String getRedisRole() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.REDIS_ROLE);
	}
	
	public static String getRedisMaxAction() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.REDIS_POOL_MAX_ACTIVE);
	}
	
	public static String getRedisMaxIdle() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.REDIS_POOL_MAX_IDLE);
	}
	
	public static String getRedisMaxWait() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.REDIS_POOL_MAX_WAIT);
	}
	
	public static String getRedisTestOnBorrow() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.REDIS_POOL_TEST_ON_BORROW);
	}
	
	public static String getZKConnect() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.ZK_CONNECT);
	}
	
	public static String getZKConnectionTimeOut() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.ZK_CONNECTIONTIMEOUT_MS);
	}
	
	public static String getZKGroupId() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.ZK_GROUP_ID);
	}
	
	public static String getZKTopic() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.ZK_TOPIC);
	}
	
	public static String getSMSCaps() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.SMS_COUNT_CAPS);
	}
	
	public static String getSMSCalled() {
	    return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.SMS_CALLED);
	}

	public static Object getFrerange() {
		 return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
					ServiceConfig.Frenrange);
	}

	public static Object getFreMiddlerange() {
		 return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
					ServiceConfig.FreMiddlerange);
	}

	public static Object getFrehigHrange() {
		 return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
					ServiceConfig.FrehigHrange);
	}

	public static Object getDisrange() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.Disrange);
	}

	public static Object getDismiddlerange() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DisMiddlerange);
	}

	public static Object getDishighrange() {
		return ServiceConfig.readValue(ServiceConfig.CONFIG_FILE_PATH,
				ServiceConfig.DisHighrange);
	}
}
