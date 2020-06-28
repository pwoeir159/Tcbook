package com.pw.tc.store.pojo;

public class Commodity {
	String commodityclass ;
	String name;
	Integer price;
	Integer quantity;
	public String getCommodityclass() {
		return commodityclass;
	}
	public void setCommodityclass(String commodityclass) {
		this.commodityclass = commodityclass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Commodity [commodityclass=" + commodityclass + ", name=" + name + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	public Commodity(String commodityclass, String name, Integer price, Integer quantity) {
		this.commodityclass = commodityclass;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Commodity() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
