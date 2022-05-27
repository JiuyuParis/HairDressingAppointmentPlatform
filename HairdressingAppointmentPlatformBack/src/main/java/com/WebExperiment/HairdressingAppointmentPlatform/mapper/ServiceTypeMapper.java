package com.WebExperiment.HairdressingAppointmentPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.ServiceType;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 服务类型mapper
 * @author Jiuyu
 *
 */
public interface ServiceTypeMapper extends BaseMapper<ServiceType> {
	/**
	 * 查询所有服务类型
	 * @return
	 */
	List<ServiceType> findServiceTypes();
}
