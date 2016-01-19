package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.Loginuser;
import model.User;
import tools.JDBCBaseDAO;

public class LoginAction extends ActionSupport{

	private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
	String Username;
	String password;
	Loginuser user;
	
	public String execute(){
	      
	   
	      String sqlsec = "select * from loginuser where Username = ?";
		  List list = new ArrayList();
		  list.add(Username);
		  List tempList = jdbcDao.find(sqlsec, list.toArray());
		  Map loginmap = (Map) tempList.get(0);
		  String name = (String) loginmap.get("username");
		  String password1 = (String) loginmap.get("password");
		  if(name.equals(Username) && password1.equals(password)){
			  return "success";
		  }
		  
	      return "error";
	      
	   }
	   
	public String getUsername() {
		return Username;
	}
	public void setUsername(String Username) {
		this.Username = Username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	   
}
