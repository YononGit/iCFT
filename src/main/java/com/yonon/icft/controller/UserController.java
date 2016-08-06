package com.yonon.icft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yonon.icft.model.User;
import com.yonon.icft.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/login")
	public String checkUser(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String psw = request.getParameter("psw");
		User user = new User();
		user.setName(name);
		user.setPsw(psw);
		if (userService.getUser(user) != null)
			return "../showUser.jsp";
		else
			return "../error.jsp";
	}
}
