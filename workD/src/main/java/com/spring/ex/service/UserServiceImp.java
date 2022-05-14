package com.spring.ex.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.ex.dao.UserDAO;
import com.spring.ex.dto.UserDTO;

@Service
public class UserServiceImp implements UserService{

	@Inject
	UserDAO userDAO;
	
	@Override
	public List<UserDTO> userlist() {
		return userDAO.userlist();
	}
	
	@Override
	public void insertUser(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		//HttpSession session = request.getSession();
		
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String gender = request.getParameter("gender");
		String birth_date = request.getParameter("birth_date");
		
		System.out.println("S"+email+pw+name+number+gender+birth_date);
		
		userDAO.insertUser(email,pw,name,number,gender,birth_date);
	}


	




}
