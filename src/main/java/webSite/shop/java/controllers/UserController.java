package webSite.shop.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/user")
public class UserController {
	
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView  login(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
		
		
	}
	
	@RequestMapping(value="/accessDenied", method={RequestMethod.GET, RequestMethod.POST})
	public ModelAndView  accessDenied(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("accessDenied");
		return modelAndView;
		
		
	}

}
