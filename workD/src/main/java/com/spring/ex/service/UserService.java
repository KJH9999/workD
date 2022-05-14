package com.spring.ex.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import com.spring.ex.dto.UserDTO;

@Repository 
public interface UserService {

	//list뽑기
	public List<UserDTO> userlist();
	// 회원 가입
	public void insertUser(Model model);	
	
}
