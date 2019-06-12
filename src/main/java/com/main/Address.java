package com.main;

public class Address {
	String steet;
	String city;
	String zip;
	public Address () {}
	public Address(String steet, String city, String zip) {
		super();
		this.steet = steet;
		this.city = city;
		this.zip = zip;
	}
	public String getSteet() {
		return steet;
	}
	public void setSteet(String steet) {
		this.steet = steet;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
