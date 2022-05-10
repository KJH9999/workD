package com.spring.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.ex.dao.BDao;

@Service
public class BWriteCommand implements BCommand {
	@Autowired
	BDao dao;
	@Override
	public void execute(Model model) {


		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();

		String bName = (String) session.getAttribute("id");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");

		dao.write(bName,bTitle,bContent);

	}

}
