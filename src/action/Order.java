package action;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import model.User;
import tools.JDBCBaseDAO;

public class Order extends ActionSupport{

  String dishid;
  private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
  String orderid;
  String sum;

  public String getSum() {
	return sum;
}
public void setSum(String sum) {
	this.sum = sum;
}
public String getOrderid() {
	return orderid;
}
public void setOrderid(String orderid) {
	this.orderid = orderid;
}
public String getDishid() {
	return dishid;
  }
  public void setDishid(String dishid) {
	this.dishid = dishid;
  }
public String execute(){
	
//	ActionContext actionContext = ActionContext.getContext();
//    Map session = actionContext.getSession();
//    
//    if(session.get("orderid") == null){
//    	orderid = generateOrderid();
//    }
	     
	  if(orderid == null || orderid.equals("")){
		  orderid = generateOrderid();
	  }
	  String username = "123";
	  String sqlsec = "select * from orderform where Username = ? and orderid = ?";
	  List list = new ArrayList();
	  list.add(username);
	  list.add(orderid);
	  List tempList = jdbcDao.find(sqlsec, list.toArray());
	  if(tempList == null || tempList.isEmpty()){
		  sqlsec = "insert into orderform(orderID,username,dishes,number,status) values (?,?,?,?,?)";
		  	list = new ArrayList();
			list.add(orderid);
			list.add(username);
			list.add(dishid);
			list.add(0);
			list.add("0");
			jdbcDao.execute(sqlsec, list.toArray());
			sqlsec = "select * from dishes where dishid = ?";
			list = new ArrayList();
			  list.add(dishid);
			  List tempdishname = jdbcDao.find(sqlsec,list.toArray());
			  Map map = (Map) tempdishname.get(0);
			 Integer tmpprice = (int) map.get("price");
			 sum = tmpprice.toString();
	  }
	  else{
		  Map map = (Map) tempList.get(0);
		  String dishes = (String) map.get("dishes");
		  dishes = dishes +","+dishid;
		  sqlsec = "update orderform set dishes = ? where username = ? and orderID = ?";
		  list = new ArrayList();
		  list.add(dishes);
		  list.add(username);
		  list.add(orderid);
		  jdbcDao.execute(sqlsec, list.toArray());
		  int tmpsum =0;
		  String[] spitdish = dishes.split(",");
		  for(int j =0 ;j < spitdish.length;j++){
			  String name = spitdish[j];
			  sqlsec = "select * from dishes where dishid = ?";
			  list = new ArrayList();
			  list.add(name);
			  List tempdishname = jdbcDao.find(sqlsec,list.toArray());
			  map = (Map) tempdishname.get(0);
			  Integer temdishaname = (int) map.get("price");
			  tmpsum = tmpsum + temdishaname;
		  }
		  sum = String.valueOf(tmpsum);
		  
	  }
	  
	  return "success";	      
	   }
private String generateOrderid() {
	Format format = new SimpleDateFormat("yyyyMMdd");
	String orderid = format.format(new Date());
	return orderid;
}
	
	
}
