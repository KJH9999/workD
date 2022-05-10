package com.spring.ex.command;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.ex.dao.BDao;
import com.spring.ex.dto.BDto;

@Service
public class BListCommand implements BCommand {
	@Autowired
	BDao dao;
	@Override
	public void execute(Model model) {
		List<BDto>dtos=dao.datas();
		model.addAttribute("dtos", dtos);
	}

}
