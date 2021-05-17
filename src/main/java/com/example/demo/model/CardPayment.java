package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Payment")
public class CardPayment {
	
	@Id
	private String cardNo;
	private String name;
	private String cvcNo;
	private double amount;
	public String payType = "CardPayment"; 
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCvcNo() {
		return cvcNo;
	}
	public void setCvcNo(String cvcNo) {
		this.cvcNo = cvcNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	

}
