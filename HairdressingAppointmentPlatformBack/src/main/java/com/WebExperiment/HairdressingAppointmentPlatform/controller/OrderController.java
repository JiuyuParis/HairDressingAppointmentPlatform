package com.WebExperiment.HairdressingAppointmentPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceOrder;
import com.WebExperiment.HairdressingAppointmentPlatform.service.OrderService;
import com.WebExperiment.HairdressingAppointmentPlatform.utils.ResultMap;

/**
 * 订单Controller
 * @author Jiuyu
 *
 */
@Controller
public class OrderController {
	@Autowired
	private ResultMap<ServiceOrder> resultMap;
	@Autowired
	private OrderService orderService;
	@RequestMapping("order/addOrder")
	@ResponseBody
	public ResultMap<ServiceOrder> addOrder(@RequestBody ServiceOrder serviceOrder){
		int rows=orderService.addService(serviceOrder);
		if(rows==1) {
			resultMap.setSuccess(true);
			resultMap.setInfo("预定成功");
		}else {
			resultMap.setSuccess(false);
			resultMap.setInfo("预定失败");
		}
		return resultMap;
	}
	@RequestMapping("order/findServiceOrders")
	@ResponseBody
	public ResultMap<ServiceOrder> findServiceOrders(int userId){
		try {
			List<ServiceOrder> serviceOrders = orderService.findServiceOrders(userId);
			resultMap.setSuccess(true);
			resultMap.setInfo("查询订单成功");
			resultMap.setInfoList(serviceOrders);
		} catch (Exception e) {
			resultMap.setSuccess(false);
			resultMap.setInfo("查询订单失败");
		}
		return resultMap;
	}
	@RequestMapping("order/findServiceOrderById")
	@ResponseBody
	public ResultMap<ServiceOrder> findServiceOrderById(String serviceOrderId){
		try {
			ServiceOrder serviceOrder = orderService.findServiceOrderById(serviceOrderId);
			resultMap.setSuccess(true);
			resultMap.setInfo("查询订单成功");
			resultMap.setData(serviceOrder);
		} catch (Exception e) {
			resultMap.setSuccess(false);
			resultMap.setInfo("查询订单失败");
		}
		return resultMap;
	}
	@RequestMapping("order/deleteServiceOrderById")
	@ResponseBody
	public ResultMap<ServiceOrder> deleteServiceOrderById(String serviceOrderId){
		int row=orderService.deleteServiceOrderById(serviceOrderId);
		if(row==1) {
			resultMap.setSuccess(true);
			resultMap.setInfo("退单成功");
		}else {
			resultMap.setSuccess(false);
			resultMap.setInfo("退单失败");
		}
		return resultMap;
	}
}
