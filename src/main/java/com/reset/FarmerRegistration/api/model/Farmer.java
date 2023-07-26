package com.reset.FarmerRegistration.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Farmer")
public class Farmer {
	
	@Id
	private int farmerid;
	private String name;
	private String password;
	private String email;
	private String phone;
	private String address;
	
	public int getFarmerid() {
		return farmerid;
	}
	public void setFarmerid(int farmerid) {
		this.farmerid = farmerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Farmer(int farmerid, String name, String password, String email, String phone, String address) {
		super();
		this.farmerid = farmerid;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	public Farmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Farmer [farmerid=" + farmerid + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + ", getFarmerid()=" + getFarmerid() + ", getName()="
				+ getName() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + ", getPhone()="
				+ getPhone() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
