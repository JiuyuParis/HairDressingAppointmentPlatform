package com.WebExperiment.HairdressingAppointmentPlatform.mapper;

import java.util.List;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.Service;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 服务项目Mapper
 * @author Jiuyu
 *
 */
public interface ServiceMapper extends BaseMapper<Service> {
	List<Service> findService(int serviceTypeId);
}
