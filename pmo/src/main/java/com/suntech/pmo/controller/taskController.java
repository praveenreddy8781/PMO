package com.suntech.pmo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/task")
public class taskController {
	
	public String listTasks(Model theModel)
	
	{
		return "list-tasks";
	}

}
