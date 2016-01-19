package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.User;
import tools.JDBCBaseDAO;

public class classHelloAction  extends ActionSupport{
	
	   private String message;
	   private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
	   String username;
	   int id;
	   public List<User>  testList=  new ArrayList<User>();
	   
	   public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		  List tempList = jdbcDao.find(sqlsec, list.toArray());
		  for(int i = 0 ;i < tempList.size();i++){
			  Map tempm = (Map) tempList.get(0);
			  User tempuser = new User((int)tempm.get("id"), (String) tempm.get("name"));
			  testList.add(tempuser);
		  }
		  Map loginmap = (Map) tempList.get(0);
		  username = "王明";
		  id = (int) loginmap.get("id");
		  System.out.println(username + "....."  + id);
	      System.out.println(testList.get(0));
		  
	      return "success";
	      
	   }
	   
	   
	   public List<User> getTestList() {
		return testList;
	}

	public void setTestList(List<User> testList) {
		this.testList = testList;
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
			  //User loginmap = (User) result.get(0);
			  //String username = (String) loginmap.get("name");
			 //int id = (int) loginmap.get("id");
			  //System.out.println(username + "...." + id);
		      //System.out.println(loginmap);
	   }
}
