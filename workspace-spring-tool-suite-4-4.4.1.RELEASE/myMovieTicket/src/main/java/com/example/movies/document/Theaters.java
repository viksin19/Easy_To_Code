package com.example.movies.document;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Theaters {
	@org.springframework.data.annotation.Id
	private String Id;
	
	private String name;
	private String city;
	private String state;
	private String country;
	private String pincode;
    private String startDate;
    private String endDate;
    private String Timing;
    
	public Theaters() {
		super();
	}

	
	
	public Theaters(String name, String city, String state, String country, String pincode, String startDate,
			String endDate, String timing) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.startDate = startDate;
		this.endDate = endDate;
		this.Timing = timing;
	}



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	public String getTiming() {
		return Timing;
	}



	public void setTiming(String timing) {
		this.Timing = timing;
	}



	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}