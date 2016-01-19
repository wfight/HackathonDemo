package model;

public class Order {
	
	String orderID;
	String username;
	String dishes;
	int number;
	String status;
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDishes() {
		return dishes;
	}
	public void setDishes(String dishes) {
		this.dishes = dishes;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Order(String orderID,
	String username,
	String dishes,
	int number,
	String status){
		this.orderID = orderID;
		this.number = number;
		this.dishes = dishes;
		this.number = number;
		this.status = status;
	}

}
