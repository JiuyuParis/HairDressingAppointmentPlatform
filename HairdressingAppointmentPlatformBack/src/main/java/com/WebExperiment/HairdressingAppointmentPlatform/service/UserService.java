package com.WebExperiment.HairdressingAppointmentPlatform.service;

import java.util.List;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.User;

/**
 * 用户service
 * @author Jiuyu
 *
 */
public interface UserService {
	/**
	 * 根据电话号查找的用户
	 * @return
	 */
	List<User> selectUserByName(String phone);
	/**
	 * 用户添加
	 * @param user
	 * @return
	 */
	int insertUser(User user);
	/**
	 * 修改用户方法
	 * @param user
	 * @return
	 */
	int updateUser(User user);
}
