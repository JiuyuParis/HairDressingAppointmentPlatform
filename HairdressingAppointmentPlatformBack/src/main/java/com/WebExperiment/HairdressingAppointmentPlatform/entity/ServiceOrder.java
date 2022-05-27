package com.WebExperiment.HairdressingAppointmentPlatform.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * 订单实体类
 * @author Jiuyu
 *
 */
public class ServiceOrder {
	private String id;
	private String serviceId;
	private Integer userId;
	private String phone;
	private String address;
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm",timezone = "GMT+8")
	private Date date;
	private String message;
	private Service service;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}

	public ServiceOrder(String id, String serviceId, Integer userId, String phone, String address, Date date,
			String message, Service service) {
		super();
		this.id = id;
		this.serviceId = serviceId;
		this.userId = userId;
		this.phone = phone;
		this.address = address;
		this.date = date;
		this.message = message;
		this.service = service;
	}
	public ServiceOrder() {
		super();
	}
	@Override
	public String toString() {
		return "ServiceOrder [id=" + id + ", serviceId=" + serviceId + ", userId=" + userId + ", phone=" + phone
				+ ", address=" + address + ", date=" + date + ", message=" + message + ", service=" + service + "]";
	}

}
