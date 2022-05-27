package com.WebExperiment.HairdressingAppointmentPlatform.service;

import java.util.List;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.Service;

/**
 * 服务项目service
 * @author Jiuyu
 *
 */
public interface ServiceService {
	/**
	 * 根据服务类型查询服务项目
	 * @param serviceTypeId
	 * @return
	 */
	List<Service> queryService(int serviceTypeId);
	/**
	 * 根据id查询服务项目
	 * @param id
	 * @return
	 */
	Service queryServiceById(String id);
}
