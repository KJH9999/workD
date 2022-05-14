package com.spring.ex.dao;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAO{


	  @Inject SqlSession sqlSession;

	
	/*
	 * @Autowired private SqlSessionTemplate mybatis;
	 */
	
	@Override
	public List<UserDTO> userlist() {
		return sqlSession.selectList("user.userList"); 
		//return mybatis.selectList("user.userList");
	}

	@Override
	public void insertUser(String email, String pw, String name, String number, String gender, String birth_date) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("email", email);
		map.put("pw", pw);
		map.put("name", name);
		map.put("number", number);
		map.put("gender", gender);
		map.put("birth_date", birth_date);
		
		System.out.println("DAO"+email+pw+name+number+gender+birth_date);

		sqlSession.insert("user.insertBoard", map);
		//mybatis.insert("user.insertBoard", map);
	}





}
