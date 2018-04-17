package com.brresidency.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.brresidency.model.User;
import com.brresidency.service.IUserService;

@Controller
public class UserController {

	private static final Logger log = Logger.getLogger(UserController.class);
	
	@Autowired
	IUserService userService;
	
    
	@RequestMapping(value="getHomePage",method=RequestMethod.GET)
	public String getHomePage(HttpServletRequest request){
		log.info("entering getHomePage11()");
		log.info("exiting getHomePage()");
		return "welcome";
	}
	
	@RequestMapping(value="getCreateUserPage",method=RequestMethod.GET)
	public ModelAndView getCreateUserPage(HttpServletRequest request){
		log.info("entering getCreateUserPage()");
		 ModelAndView mav = new ModelAndView("create_user");
		log.info("exiting getHomePageModelAndView()");
		return mav;
	}
	
	@RequestMapping(value="getHomePageModelAndView",method=RequestMethod.GET)
	public ModelAndView getHomePageModelAndView(HttpServletRequest request){
		log.info("entering getHomePageModelAndView()");
		 ModelAndView mav = new ModelAndView("display");
		    mav.addObject("DATA_FROM_CONTROLLER", userService.getUserName());
		log.info("exiting getHomePageModelAndView()");
		return mav;
	}
	
	@RequestMapping(value="saveNewUser",method=RequestMethod.POST)
	public ModelAndView saveNewUser(HttpServletRequest request,@ModelAttribute ("user") User user){
		log.info("entering saveUserData()"+user.getUserName());
		int id=userService.saveUser(user);
		log.info("user saved with ID"+id);
		List<User> allUserMap=userService.findAllUsers();
		ModelAndView mav = new ModelAndView("user_info");
		    mav.addObject("USER_ID", id);
		    mav.addObject("ALL_USER_LIST", allUserMap);
		log.info("exiting saveUserData()");
		return mav;
	}
	
	@RequestMapping(value="findAllUsers",method=RequestMethod.GET)
	public ModelAndView findAllUsers(HttpServletRequest request){
		log.info("entering saveUserData()");
		log.info("user saved with ID");
		List<User> allUserMap=userService.findAllUsers();
		log.info("all user map in controller"+allUserMap);
		ModelAndView mav = new ModelAndView("user_info");
		    mav.addObject("ALL_USER_LIST", allUserMap);
		log.info("exiting saveUserData()");
		return mav;
	}
	
}
