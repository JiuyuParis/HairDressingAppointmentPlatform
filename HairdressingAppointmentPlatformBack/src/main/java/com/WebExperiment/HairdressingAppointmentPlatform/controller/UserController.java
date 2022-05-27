package com.WebExperiment.HairdressingAppointmentPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.WebExperiment.HairdressingAppointmentPlatform.entity.User;
import com.WebExperiment.HairdressingAppointmentPlatform.service.UserService;
import com.WebExperiment.HairdressingAppointmentPlatform.utils.ResultMap;

/**
 * 用户Controller
 * @author Jiuyu
 *
 */
@Controller
public class UserController {
	@Autowired
	private ResultMap<User> resultMap;
	@Autowired
	private UserService userService;
	/**
	 * 根据电话号查询用户
	 * @param username
	 * @return
	 */
	@RequestMapping("user/queryUserByName")
	@ResponseBody
	public ResultMap<User> queryUserByPhone(String phone){
		try {
			List<User> users=userService.selectUserByName(phone);
			resultMap.setSuccess(true);
			resultMap.setInfo("查询用户信息成功！");
			resultMap.setInfoList(users);
		} catch (Exception e) {
			e.printStackTrace();
			resultMap.setSuccess(false);
			resultMap.setInfo("查询用户信息失败");
		}
		return resultMap;
	}
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping("user/addUser")
	@ResponseBody
	public ResultMap<User> addUser(@RequestBody User user){
		int row=userService.insertUser(user);
		if(row==1) {
			resultMap.setSuccess(true);
			resultMap.setInfo("注册成功");
		}else {
			resultMap.setSuccess(false);
			resultMap.setInfo("注册失败");
		}
		return resultMap;
	}
	/**
	 * 登陆功能
	 * @param phone
	 * @param password
	 * @return
	 */
	@RequestMapping("user/login")
	@ResponseBody
	public ResultMap<User> login( String phone, String password){
		List<User> users=userService.selectUserByName(phone);
		if(users.size()==0) {
			resultMap.setSuccess(false);
			resultMap.setInfo("用户未注册");
		}else {
			if(users.get(0).getPassword().equals(password)) {
				resultMap.setSuccess(true);
				resultMap.setInfo("登陆成功");
				resultMap.setData(users.get(0));
			}else {
				resultMap.setSuccess(false);
				resultMap.setInfo("用户名或密码不正确");
			}
		}
		return resultMap;
	}
	@RequestMapping("user/modifyUser")
	@ResponseBody
	public ResultMap<User> modifyUser(@RequestBody User user){
		int row=userService.updateUser(user);
		if(row==1) {
			resultMap.setSuccess(true);
			resultMap.setInfo("修改成功");
		}else {
			resultMap.setSuccess(false);
			resultMap.setInfo("修改失败");
		}
		return resultMap;
	}
}
