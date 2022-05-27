package com.WebExperiment.HairdressingAppointmentPlatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.Service;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.ServiceMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.service.ServiceService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {
	@Autowired
	private ServiceMapper serviceMapper;
	@Override
	public List<Service> queryService(int serviceTypeId) {
		QueryWrapper<Service> queryWrapper=new QueryWrapper<Service>();
		queryWrapper.inSql("service_type", "SELECT title FROM service_type where id="+serviceTypeId);
		return serviceMapper.selectList(queryWrapper);
	}
	@Override
	public Service queryServiceById(String id) {
		
		return serviceMapper.selectById(id);
	}

}
