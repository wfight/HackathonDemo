package model;

public class Dishes {

	private String dishid;
	private String name;
	private int price;
	private String catelogy;
	String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDishid() {
		return dishid;
	}
	public void setDishid(String dishid) {
		this.dishid = dishid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCatelogy() {
		return catelogy;
	}
	public void setCatelogy(String catelogy) {
		this.catelogy = catelogy;
	}
	
	public Dishes(String dishid,String name,int price,String catelogy,String url){
		this.dishid = dishid;
		this.name = name;
		this.price = price;
		this.catelogy = catelogy;
		this.url=url;
	}
	
}
