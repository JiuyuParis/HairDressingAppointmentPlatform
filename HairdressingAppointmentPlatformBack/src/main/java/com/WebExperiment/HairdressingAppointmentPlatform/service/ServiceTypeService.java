package com.WebExperiment.HairdressingAppointmentPlatform.service;

import java.util.List;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceType;
/**
 * 服务类型service
 * @author Jiuyu
 *
 */
public interface ServiceTypeService {
	/**
	 * 查询所有服务类型
	 * @return
	 */
	List<ServiceType> findServiceTypes();
}
