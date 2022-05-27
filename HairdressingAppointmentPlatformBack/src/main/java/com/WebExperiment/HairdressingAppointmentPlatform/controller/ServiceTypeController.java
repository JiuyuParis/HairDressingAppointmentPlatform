package com.WebExperiment.HairdressingAppointmentPlatform.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceType;
import com.WebExperiment.HairdressingAppointmentPlatform.service.ServiceTypeService;
import com.WebExperiment.HairdressingAppointmentPlatform.utils.ResultMap;

@Controller
public class ServiceTypeController {
	@Autowired
	private ResultMap<ServiceType> resultMap;
	@Autowired
	private ServiceTypeService serviceTypeService;
	/**
	 * 查询所有服务类型
	 * @return
	 */
	@RequestMapping("service/queryServiceTypes")
	@ResponseBody
	public ResultMap<ServiceType> queryServiceTypes(){
		try {
			List<ServiceType> serviceTypes = serviceTypeService.findServiceTypes();
			resultMap.setSuccess(true);
			resultMap.setInfo("查询服务类型成功");
			resultMap.setInfoList(serviceTypes);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.setSuccess(false);
			resultMap.setInfo("服务类型导航信息加载错误！");
		}
		return resultMap;
	}
}
