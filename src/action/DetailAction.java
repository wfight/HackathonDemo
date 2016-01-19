package action;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import model.Dishes;
import model.Loginuser;
import tools.JDBCBaseDAO;

public class DetailAction extends ActionSupport{
	
	private JDBCBaseDAO jdbcDao = new JDBCBaseDAO();
	String Username = "123";
	String orderid;
	List<Dishes> detailDishes = new ArrayList();
	String status;
	
	public String getStatus() {
		return status;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public JDBCBaseDAO getJdbcDao() {
		return jdbcDao;
	}

	public void setJdbcDao(JDBCBaseDAO jdbcDao) {
		this.jdbcDao = jdbcDao;
	}

	public List<Dishes> getDetailDishes() {
		return detailDishes;
	}

	public void setDetailDishes(List<Dishes> detailDishes) {
		this.detailDishes = detailDishes;
	}

	public String execute(){
	      
			
		 if(orderid == null || orderid.equals("")){
			  orderid = generateOrderid();
		  }
	      String sqlsec = "select * from orderform where Username = ? and orderid = ?";
		  List list = new ArrayList();
		  list.add(Username);
		  list.add(orderid);
		  List tempList = jdbcDao.find(sqlsec, list.toArray());
		  if(tempList!=null && !tempList.isEmpty()){
			  Map tempmap = (Map) tempList.get(0);
			  String dishes = (String) tempmap.get("dishes");
			  status = (String) tempmap.get("status");
			  String[] spitDished = dishes.split(",");
			  for(int i = 0 ;i < spitDished.length;i++){
				  String tempdishid = spitDished[i];
				  sqlsec = "select * from dishes where dishid = ?";
				  list = new ArrayList();
				  list.add(tempdishid);
				  List tempdish = jdbcDao.find(sqlsec, list.toArray());
				  if(tempdish != null){
					  Map temp0 = (Map) tempdish.get(0);
					  String name = (String) temp0.get("name");
					  int price = (int) temp0.get("price");
					  Dishes temp1 = new Dishes(tempdishid,name,price,"0","");
					  detailDishes.add(temp1);
				  }
			  }
		  }
			 
		  
	      return "success";
	      
	   }
	
	private String generateOrderid() {
		Format format = new SimpleDateFormat("yyyyMMdd");
		String orderid = format.format(new Date());
		return orderid;
	}
		

}
