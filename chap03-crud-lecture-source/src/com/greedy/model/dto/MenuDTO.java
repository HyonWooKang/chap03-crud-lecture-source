package com.greedy.model.dto;

public class MenuDTO implements java.io.Serializable {

	private int code;
	private String name;
	private int price;
	private int categoryCode;
	private String orderableStatus;

	/*
	 * 필수요소
	 * 1. 기본생성자
	 * 2. 매개변수 생성자
	 * 3. getter/setter
	 * 4. toString
	 * 5. serializable
	 */
	
	
	public MenuDTO() {
		super();
	}

	public MenuDTO(int code, String name, int price, int categoryCode, String orderableStatus) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.categoryCode = categoryCode;
		this.orderableStatus = orderableStatus;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getOrderableStatus() {
		return orderableStatus;
	}

	public void setOrderableStatus(String orderableStatus) {
		this.orderableStatus = orderableStatus;
	}

	@Override
	public String toString() {
		return "MenuDTO [code=" + code + ", name=" + name + ", price=" + price + ", categoryCode=" + categoryCode
				+ ", orderableStatus=" + orderableStatus + "]";
	}
	

}
