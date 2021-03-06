package fi.haagahelia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class LoginController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model) {
		return "login-page";
 
	}
 
	@RequestMapping(value="/loginfail", method = RequestMethod.GET)
	public String loginerror(Model model) {
		model.addAttribute("loginerror", "true");
		return "login-page";
 
	}
 
	@RequestMapping(value="logout", method = RequestMethod.GET)
	public String logout(Model model) {
		model.addAttribute("loggedout", "true");
		return "login-page";
 
	}

}
