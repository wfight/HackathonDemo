package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import tools.JDBCBaseDAO;

public class classHelloAction  extends ActionSupport{
	
	   private String message;
	   private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
	  
	   public String getMessage() {
	      return message;
	   }
	  
	   public void setMessage(String message) {
	      this.message = message;
	   }
	   
	   public String execute(){
	      
	      this.message="我的第一个 struts程序";
	      System.out.println(message);
	      
	      String sqlsec = "select * from user where id = ?";
		  List list = new ArrayList();
		  list.add(1);
		  List result = jdbcDao.find(sqlsec, list.toArray());
	      System.out.println(result);
		  
	      return "success";
	      
	   }
	   
	   
	   public String other(){
	      this.message="第二个方法";
	      return "success";
	   }
	   
	   public static void main(String[] args){
		    JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
		    String sqlsec = "select * from user where id = ?";
			  List list = new ArrayList();
			  list.add(1);
			  List result = jdbcDao.find(sqlsec, list.toArray());
		      System.out.println(result);
	   }
}
