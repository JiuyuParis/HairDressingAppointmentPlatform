package com.WebExperiment.HairdressingAppointmentPlatform.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * 服务类型实体类
 * @author Jiuyu
 *
 */
public class ServiceType {
	@TableId(value = "id",type = IdType.AUTO)
	private Integer id;
	private String icon;
	private String title;
	private DataDict dataDict;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public DataDict getDataDict() {
		return dataDict;
	}
	public void setDataDict(DataDict dataDict) {
		this.dataDict = dataDict;
	}
	public ServiceType() {
		super();
	}
	
	public ServiceType(Integer id, String icon, String title, DataDict dataDict) {
		super();
		this.id = id;
		this.icon = icon;
		this.title = title;
		this.dataDict = dataDict;
	}
	@Override
	public String toString() {
		return "ServiceType [id=" + id + ", icon=" + icon + ", title=" + title + ", dataDict=" + dataDict + "]";
	}
	
	
	
	
}
