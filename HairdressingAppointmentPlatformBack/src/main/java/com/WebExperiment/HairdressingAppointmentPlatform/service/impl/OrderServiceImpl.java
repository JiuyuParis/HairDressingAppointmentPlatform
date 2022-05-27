package com.WebExperiment.HairdressingAppointmentPlatform.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceOrder;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.OrderMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;
	@Override
	public int addService(ServiceOrder serviceOrder) {
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddHHmm");
		String idPrefix=simpleDateFormat.format(serviceOrder.getDate());
		serviceOrder.setId(idPrefix+new Date().getSeconds()+serviceOrder.getUserId());
		return orderMapper.insert(serviceOrder);
	}
	@Override
	public List<ServiceOrder> findServiceOrders(int userId) {
		return orderMapper.findServiceOrders(userId);
	}
	@Override
	public ServiceOrder findServiceOrderById(String serviceOrderId) {
		
		return orderMapper.findServiceOrderById(serviceOrderId);
	}
	@Override
	public int deleteServiceOrderById(String serviceOrderId) {
		return orderMapper.deleteById(serviceOrderId);
	}

}
