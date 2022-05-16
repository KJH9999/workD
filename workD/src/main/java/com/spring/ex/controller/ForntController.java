package com.spring.ex.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	@RequestMapping("board")
	public String board(Model model) {
		return "board";
	}

	
	// 로그인 세션기능 추가
	@RequestMapping("loginOk")
	public String loginOk(HttpServletRequest request, Model model) {
		
		HttpSession session = request.getSession();

		System.out.println("login()");
		model.addAttribute("request", request);

		int ck = userService.loginUser(model);
		System.out.println(ck);
		if (ck != 0) {
			System.out.println("ok");
			return "loginok";
		} else {
			System.out.println("no");
			return "home";
		}

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
