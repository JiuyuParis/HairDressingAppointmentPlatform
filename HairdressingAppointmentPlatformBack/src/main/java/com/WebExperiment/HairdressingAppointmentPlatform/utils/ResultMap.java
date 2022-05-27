package com.WebExperiment.HairdressingAppointmentPlatform.utils;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 * 封装返回结果
 * @author Jiuyu
 *
 */
@Component
public class ResultMap <T> {
	private boolean success;
	private String info;
	private List<T> infoList;
	private T data;
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public List<T> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<T> infoList) {
		this.infoList = infoList;
	}

	public ResultMap() {
		super();
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
