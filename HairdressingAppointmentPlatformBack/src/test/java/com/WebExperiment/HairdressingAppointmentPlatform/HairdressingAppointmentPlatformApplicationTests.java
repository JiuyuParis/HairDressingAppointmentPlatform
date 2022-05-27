package com.WebExperiment.HairdressingAppointmentPlatform;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.Service;
import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceOrder;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.OrderMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.ServiceMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.ServiceTypeMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.UserMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.service.OrderService;

@SpringBootTest
class HairdressingAppointmentPlatformApplicationTests {
	@Autowired
	private ServiceTypeMapper serviceTypeMapper;
	@Autowired
	private ServiceMapper serviceMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private OrderMapper orderMapper;
    @Test
    void contextLoads() {
    	List<ServiceOrder> orderServices=orderMapper.findServiceOrders(10);
    	orderServices.forEach(orderService->{
    		System.out.println(orderService);
    	});
    }

}
