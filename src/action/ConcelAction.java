package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.Order;
import tools.JDBCBaseDAO;

public class ConcelAction extends ActionSupport{
	
	private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
	List<Order> orderList = new ArrayList();
	String orderid;

	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	public String execute(){
		String sqlsec = "update  orderform set status = ? where orderID = ?";
		List list = new ArrayList();
		list.add("2");
		list.add(orderid);
		jdbcDao.execute(sqlsec, list.toArray());

		sqlsec = "select * from orderform order by status desc";
		  List tempList = jdbcDao.find(sqlsec);
		  for(int i = 0 ;i < tempList.size();i++){
			  Map tempm = (Map) tempList.get(i);
			  Order orders = new Order((String)tempm.get("orderID"), (String)tempm.get("username"),(String)tempm.get("dishes"),(int) tempm.get("number"),(String)tempm.get("status"));
			  orderList.add(orders);
		  }
		  
		  return "success";
	}
		
		

}
