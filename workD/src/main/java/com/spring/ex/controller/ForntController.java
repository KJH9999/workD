package com.spring.ex.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ex.dto.UserDTO;
import com.spring.ex.service.UserService;

@Controller
public class ForntController {

	@Inject
	UserService userService;

	@RequestMapping("userlist")
	public String userlist(Model model) {
		System.out.println("UserService = " + userService);
		List<UserDTO> userlist = userService.userlist();
		model.addAttribute("userlist", userlist);
		return "user_list";
	}
	
	@RequestMapping("home")
	public String homew(Model model) {
		return "home";
	}

	@RequestMapping("login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping("join")
	public String join(Model model) {
		return "join";
	}
	
	@RequestMapping("joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		System.out.println("write()");
		model.addAttribute("request", request);
		userService.insertUser(model);
		return "home";
	}
	
	
	
	

}
