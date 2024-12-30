package com.Spring.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.hibernate.annotations.Entity;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int vId; 
	String vName;
	double price;
	int milage;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vId, String vName, double price, int milage) {
		super();
		this.vId = vId;
		this.vName = vName;
		this.price = price;
		this.milage = milage;
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vName=" + vName + ", price=" + price + ", milage=" + milage + "]";
	}
	
	
	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	
}
