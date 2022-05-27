package com.WebExperiment.HairdressingAppointmentPlatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceType;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.ServiceTypeMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.service.ServiceTypeService;
@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {
	@Autowired
	private ServiceTypeMapper serviceTypeMapper;
	@Override
	public List<ServiceType> findServiceTypes() {
		return serviceTypeMapper.findServiceTypes();
	}

}
