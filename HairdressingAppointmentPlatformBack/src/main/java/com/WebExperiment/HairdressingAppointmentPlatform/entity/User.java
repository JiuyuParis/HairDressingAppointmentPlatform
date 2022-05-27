package com.WebExperiment.HairdressingAppointmentPlatform.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 用户实体类
 * @author Jiuyu
 *
 */
public class User {
	@TableId(value = "id",type = IdType.AUTO)
	private Integer id;
	private String image;
	private String username;
	private String password;
	private Double height;
	private Double weight;
	private Integer vip;
	private Double money;
	private String address1;
	private String address2;
	private String phone;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getVip() {
		return vip;
	}
	public void setVip(Integer vip) {
		this.vip = vip;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User() {
		super();
	}
	public User(Integer id, String image, String username, String password, Double height, Double weight, Integer vip,
			Double money, String address1, String address2, String phone) {
		super();
		this.id = id;
		this.image = image;
		this.username = username;
		this.password = password;
		this.height = height;
		this.weight = weight;
		this.vip = vip;
		this.money = money;
		this.address1 = address1;
		this.address2 = address2;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", image=" + image + ", username=" + username + ", password=" + password + ", height="
				+ height + ", weight=" + weight + ", vip=" + vip + ", money=" + money + ", address1=" + address1
				+ ", address2=" + address2 + ", phone=" + phone + "]";
	}
	
	
}
