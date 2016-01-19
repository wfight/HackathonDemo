package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.Dishes;
import tools.JDBCBaseDAO;

public class JudgeAction extends ActionSupport{

	String number;
	String orderid;
	String status;
	private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String execute(){
	      
		  
		  String sqlsec = "update orderform set number = ? where orderid = ?";
		  List list = new ArrayList();
		  list.add(number);
		  list.add(orderid);
		  jdbcDao.execute(sqlsec,list.toArray());
	      sqlsec = "select * from orderform where orderid = ?";
		  list = new ArrayList();
		  list.add(orderid);
		  List tempList = jdbcDao.find(sqlsec, list.toArray());
		  Map order = (Map) tempList.get(0);
		  status = (String) order.get("status");
		  
	      return "success";
	      
	   }
	
	
	
}
