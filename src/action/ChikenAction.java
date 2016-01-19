package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Order;

import com.opensymphony.xwork2.ActionSupport;

import model.Dishes;
import tools.JDBCBaseDAO;

public class ChikenAction extends ActionSupport{

	private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
	List<Order> orderList = new ArrayList();
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	public String execute(){
		String sqlsec = "select * from orderform order by status";
		  List tempList = jdbcDao.find(sqlsec);
		  for(int i = 0 ;i < tempList.size();i++){
			  Map tempm = (Map) tempList.get(i);
			  String dishes = (String) tempm.get("dishes");
			  String[] spitdish = dishes.split(",");
			  String dishname = "";
			  for(int j =0 ;j < spitdish.length;j++){
				  String name = spitdish[j];
				  sqlsec = "select * from dishes where dishid = ?";
				  List list = new ArrayList();
				  list.add(name);
				  List tempdishname = jdbcDao.find(sqlsec,list.toArray());
				  Map map = (Map) tempdishname.get(0);
				  String temdishaname = (String) map.get("name");
				  dishname = dishname + " " + temdishaname;
			  }
			  Order orders = new Order((String)tempm.get("orderid"), (String)tempm.get("username"),(String)dishname,(int)tempm.get("number"),(String)tempm.get("status"));
			  orderList.add(orders);
		  }
		
		return "success";
		
	}
	
}
