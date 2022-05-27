package com.WebExperiment.HairdressingAppointmentPlatform.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 服务项目实体类
 * @author Jiuyu
 *
 */
public class Service {
	@TableId(value = "id",type = IdType.UUID)
	private String id;
	private String subject;
	private String coverpath;
	private Double price;
	private String message;
	private String serviceType;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCoverpath() {
		return coverpath;
	}
	public void setCoverpath(String coverpath) {
		this.coverpath = coverpath;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public Service() {
		super();
	}
	public Service(String id, String subject, String coverpath, Double price, String message, String serviceType) {
		super();
		this.id = id;
		this.subject = subject;
		this.coverpath = coverpath;
		this.price = price;
		this.message = message;
		this.serviceType = serviceType;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", subject=" + subject + ", coverpath=" + coverpath + ", price=" + price
				+ ", message=" + message + ", serviceType=" + serviceType + "]";
	}
	
	
}
