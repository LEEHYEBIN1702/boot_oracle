package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.ReplyService;

@Controller
@RequestMapping("/reply") //모든 메서드에 공통 적용된다는 뜻
public class ReplyController {
	
	@Autowired ReplyService replyService;
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", replyService.selectAll());
		return "list";
	}

}
