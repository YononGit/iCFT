package com.yonon.icft.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yonon.framework.util.TimeFormat;
import com.yonon.icft.model.User;
import com.yonon.icft.model.UserInfo;
import com.yonon.icft.service.UserInfoService;
import com.yonon.icft.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserInfoService userInfoService;
	private Logger log = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/login")
	public String login(@RequestParam("username") String username, @RequestParam("psw") String psw, Model model) {
		log.info("开始查询用户");
		User user = new User();
		user.setName(username);
		user.setPsw(psw);
		if (userService.getUser(user) != null){
			model.addAttribute("user", user);
			return "../views/showUser.jsp";
		}
		else
			return "../views/error.jsp";
	}

	@Transactional
	@RequestMapping(value = "/register")
	public String regist(@RequestParam("username") String username, @RequestParam("psw") String psw, Model model) {
		if (checkUsername(username)) {
			log.info("注册用户");
			int userInfoID = initUserInfo();
			addUser(username, psw, userInfoID);
			return "../views/index.jsp";
		} else
			return "../views/error.jsp";
	}

	/**
	 * 初始化用户信息
	 * 
	 * @return 返回新增用户信息的id
	 */
	private int initUserInfo() {
		UserInfo userInfo = new UserInfo();
		userInfo.setAge(0);
		userInfo.setBirthday("0000-00-00");
		userInfo.setCapital(0);
		userInfo.setCity("0000");
		userInfo.setCountry("0000");
		userInfo.setNiname("iCFT_用户");
		userInfo.setSex(0);
		userInfo.setCreateTime(TimeFormat.timeFormat());
		userInfo.setUpdateTime(TimeFormat.timeFormat());
		int cow = userInfoService.addUserInfo(userInfo);
		log.info("userInfo.id:" + userInfo.getId() + "  insert cow:" + cow);
		return userInfo.getId();
	}

	/**
	 * 获取用户注册信息 入库
	 */
	private boolean addUser(String username, String psw, int userInfoID) {
		User user = new User();
		user.setName(username);
		user.setPsw(psw);
		user.setUserInfoID(userInfoID);
		boolean result = userService.addUser(user);
		return result;
	}

	/**
	 * 验证用户名是否已经存在
	 */
	private boolean checkUsername(String username) {
		if (null != userService.getUserByUsername(username))
			return false;
		else
			return true;
	}

}
