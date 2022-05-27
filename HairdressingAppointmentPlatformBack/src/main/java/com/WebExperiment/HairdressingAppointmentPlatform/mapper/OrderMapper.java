package com.WebExperiment.HairdressingAppointmentPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceOrder;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 订单mapper
 * @author Jiuyu
 *
 */
public interface OrderMapper extends BaseMapper<ServiceOrder> {
	List<ServiceOrder> findServiceOrders(int userId);
	ServiceOrder findServiceOrderById(@Param("serviceOrderId") String serviceOrderId);
}
