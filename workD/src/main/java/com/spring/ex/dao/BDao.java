package com.spring.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.ex.dto.BDto;

@Repository
public class BDao {
	ArrayList<BDto> dtos = new ArrayList<BDto>();
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://localhost:3306/mvc_board";
	private String uid = "root";
	private String upw = "1234";

	@Autowired
	private SqlSessionTemplate mybatis;

	public List<BDto> datas() {
		return mybatis.selectList("BoardMapper.getBoardList");
	}

	public void write(String bName, String bTitle, String bContent) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("bName", bName);
		map.put("bTitle", bTitle);
		map.put("bContent", bContent);
		
		mybatis.insert("BoardMapper.insertBoard", map);
	}

}
