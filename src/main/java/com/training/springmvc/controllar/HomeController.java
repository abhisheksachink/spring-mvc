package com.training.springmvc.controllar;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.training.springmvc.dao.UserDao;
import com.training.springmvc.dao.UserRegisterDaoImpl;
import com.training.springmvc.model.User;
import com.training.springmvc.service.LoginService;



@Controller
@RequestMapping("/")//controller
public class HomeController {
	@Autowired
	LoginService service;
	@Autowired
	UserDao dao;

	@Autowired
	UserRegisterDaoImpl register;
	
//	@RequestMapping(value="/home",method= RequestMethod.GET)
//	public String printGreet(ModelMap map,HttpServletRequest req) {
//		String user1=req.getParameter("user");
//		map.addAttribute("msg","this is from model map");
//		if(user1.equals("Abhi")) {
//			return "success";
//		}
//		else {
//			map.addAttribute("msg","Please enter correct username");
//			return "home";
//		}
//		
//		//return "home";//view name
//	}
	
	
	@RequestMapping(value="/home",method= RequestMethod.GET)
	public String printGreet(ModelMap map,@ModelAttribute("user") User user) {
//		String user1=req.getParameter("user");
		map.addAttribute("msg","this is from model map");
		
//		User userr=(User) dao.getUsers();
//		LoginService service = new LoginServiceImpl();
		
		
		if(service.isValidUser_det(user.getUsername(), user.getPassword())) {
//			UserDao dao=new UserDaoImpl() ;
			return "success";

		}
		
		else {
			map.addAttribute("msg","Please enter correct username");
			return "home";
		}
		
	}
	
	
	@RequestMapping(value="/register",method= RequestMethod.GET)
	public String register(ModelMap map,@ModelAttribute("user") User user1) {
		map.addAttribute("msg","this is from model map");
		register.setUsers(user1.getUsername(), user1.getPassword());
		return "index";

	}
	@RequestMapping(method= RequestMethod.GET)
	public String openMainPage() {
		
		return "index";
	}

}
