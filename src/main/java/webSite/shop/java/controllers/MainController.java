package webSite.shop.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {

	public MainController (){
		
		
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("home");
		
		return modelAndView;
		
	}
}
