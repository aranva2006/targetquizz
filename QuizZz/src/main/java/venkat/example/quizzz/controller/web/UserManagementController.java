package venkat.example.quizzz.controller.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import venkat.example.quizzz.model.User;

@Controller
@RequestMapping("/user")
public class UserManagementController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@PreAuthorize("permitAll")
	public String login(@ModelAttribute User user) {
		return "login";
	}
	
	@RequestMapping(value = "/login-error", method = RequestMethod.GET)
	@PreAuthorize("permitAll")
	public String loginError(@ModelAttribute User user, Model model) {
		model.addAttribute("loginError", true);
		return "login";
	}

	@RequestMapping(value = "/forgotPassword", method = RequestMethod.GET)
	@PreAuthorize("permitAll")
	public String forgotPassword() {
		return "forgotPassword";
	}

}
