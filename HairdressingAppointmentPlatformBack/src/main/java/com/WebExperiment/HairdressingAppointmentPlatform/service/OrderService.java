package com.WebExperiment.HairdressingAppointmentPlatform.service;

import java.util.List;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceOrder;

/**
 * 订单service
 * @author Jiuyu
 *
 */
public interface OrderService {
	/**
	 * 添加订单
	 * @param order
	 * @return
	 */
	int addService(ServiceOrder serviceOrder);
	/**
	 * 订单查询
	 * @param userId
	 * @return
	 */
	List<ServiceOrder> findServiceOrders(int userId);
	/**
	 * 根据订单id查订单
	 * @param serviceOrderId
	 * @return
	 */
	ServiceOrder findServiceOrderById(String serviceOrderId);
	/**
	 * 根据订单id删除订单
	 * @param serviceOrderId
	 * @return
	 */
	int deleteServiceOrderById(String serviceOrderId);
}
