package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Registrations")
public class UserDetails {
	@Id
	private long phoneNumber;
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public String getServiceTime() {
		return serviceTime;
	}
	public void setServiceTime(String serviceTime) {
		this.serviceTime = serviceTime;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public UserDetails(long phoneNumber, String category, String vehicleName, String vehicleModel, String vehicleBrand,
			String vehicleNumber, String serviceDate, String serviceTime, String deliveryType) {
		super();
		this.phoneNumber = phoneNumber;
		this.category = category;
		this.vehicleName = vehicleName;
		this.vehicleModel = vehicleModel;
		this.vehicleBrand = vehicleBrand;
		this.vehicleNumber = vehicleNumber;
		this.serviceDate = serviceDate;
		this.serviceTime = serviceTime;
		this.deliveryType = deliveryType;
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String category;
	private String vehicleName;
	private  String vehicleModel;
	private String vehicleBrand;
	private String vehicleNumber;
	private String serviceDate;
	private String serviceTime;
	private String deliveryType;
	

}