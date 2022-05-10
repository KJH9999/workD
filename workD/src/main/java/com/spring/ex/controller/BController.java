package com.spring.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ex.command.BCommand;
import com.spring.ex.command.BJoinCommand;
import com.spring.ex.command.BListCommand;
import com.spring.ex.command.BLoginCommand;
import com.spring.ex.command.BWriteCommand;
import com.spring.ex.command.BWriteViewCommand;
import com.spring.ex.command.BmodifyViewCommand;

@Controller
public class BController {
	BCommand cmd;
	
	@Autowired
	private BListCommand bListCommand;
	@Autowired
	private BWriteCommand bWriteCommand;
	
	
	@RequestMapping("list")
	public String list(Model model) {
		System.out.println("=========list 접근중==========");
		System.out.println("list()");
		
		bListCommand.execute(model);
		return "list";
	}
	@RequestMapping("writeview")
	public String writeView(Model model) {
		System.out.println("====writeview 접근중=====");
		System.out.println("writeView()");
		
		cmd = new BWriteViewCommand();
		
		cmd.execute(model);
		return "writeview";
	}
	@RequestMapping("write")
	public String write(HttpServletRequest request,Model model) {
		System.out.println("=====write 접근중======");
		System.out.println("write()");
		model.addAttribute("request", request);
		bWriteCommand.execute(model);

		return "redirect:list";
	}



}
