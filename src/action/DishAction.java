package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.Dishes;
import model.User;
import tools.JDBCBaseDAO;

public class DishAction extends ActionSupport {

	private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
	List<Dishes> orderdished = new ArrayList();
	
	public String execute(){
	      
			
	      String sqlsec = "select * from dishes";
		  List list = new ArrayList();
		  list.add("");
		  List tempList = jdbcDao.find(sqlsec);
		  for(int i = 0 ;i < tempList.size();i++){
			  Map tempm = (Map) tempList.get(i);
			  Dishes tempDishes = new Dishes((String)tempm.get("dishid"), (String) tempm.get("name"),(int) tempm.get("price"),(String) tempm.get("catelogy"),(String)tempm.get("url"));
			  orderdished.add(tempDishes);
		  }
		  
	      return "success";
	      
	   }

	public List<Dishes> getOrderdished() {
		return orderdished;
	}

	public void setOrderdished(List<Dishes> orderdished) {
		this.orderdished = orderdished;
	}
	   
	   
}
