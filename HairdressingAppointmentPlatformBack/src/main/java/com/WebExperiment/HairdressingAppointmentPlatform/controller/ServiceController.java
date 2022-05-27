package com.WebExperiment.HairdressingAppointmentPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.Service;
import com.WebExperiment.HairdressingAppointmentPlatform.service.ServiceService;
import com.WebExperiment.HairdressingAppointmentPlatform.utils.ResultMap;

@Controller
public class ServiceController {
	@Autowired
	private ResultMap<Service> resultMap;
	@Autowired
	private ServiceService serviceService;
	/**
	 * 根据服务类型查询服务项目
	 * @param serviceTypeId
	 * @return
	 */
	@RequestMapping("service/queryService")
	@ResponseBody
	public ResultMap<Service> queryService(int serviceTypeId){
		try {
			List<Service> services=serviceService.queryService(serviceTypeId);
			resultMap.setSuccess(true);
			resultMap.setInfo("查询服务项目成功");
			resultMap.setInfoList(services);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.setSuccess(false);
			resultMap.setInfo("查询服务失败");
		}
		return resultMap;
	}
	/**
	 * 
	 * @param serviceId
	 * @return
	 */
	@RequestMapping("service/queryServiceById")
	@ResponseBody
	public ResultMap<Service> queryServiceById(String serviceId){
		try {
			Service service=serviceService.queryServiceById(serviceId);
			resultMap.setSuccess(true);
			resultMap.setInfo("查询服务详细信息成功");
			resultMap.setData(service);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.setSuccess(false);
			resultMap.setInfo("查询服务详细信息失败");
		}
		return resultMap;
	}
}
