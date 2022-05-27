package com.WebExperiment.HairdressingAppointmentPlatform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.User;
import com.WebExperiment.HairdressingAppointmentPlatform.mapper.UserMapper;
import com.WebExperiment.HairdressingAppointmentPlatform.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> selectUserByName(String phone) {
		QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
		queryWrapper.eq("phone", phone);
		return userMapper.selectList(queryWrapper);
	}
	@Override
	public int insertUser(User user) {
		
		return userMapper.insert(user);
	}
	@Override
	public int updateUser(User user) {
		
		return userMapper.updateById(user);
	}
	

}
