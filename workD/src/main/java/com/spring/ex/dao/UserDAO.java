package com.spring.ex.dao;

import java.util.List;

import com.spring.ex.dto.UserDTO;

public interface UserDAO {
	public List<UserDTO> userlist();
	public void insertUser(String email, String pw, String name, String number, String gender, String birth_date);

}
