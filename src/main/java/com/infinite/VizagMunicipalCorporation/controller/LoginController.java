package com.infinite.VizagMunicipalCorporation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.infinite.VizagMunicipalCorporation.model.Login;
import com.infinite.VizagMunicipalCorporation.service.LoginService;

@Controller
public class LoginController {
	private Login user;

	@RequestMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, Model model,
			RedirectAttributes redirectAttributes) {
		// Check user credentials (in a real application, use Spring Security or
		// a custom authentication mechanism)
		Login user = LoginService.findByName(username);

		if (user != null && user.getPassword().equals(password)) {
			// Successful login, set user information in the session or any user
			// context
			// For simplicity, we set it in the model.
			model.addAttribute("user", user);

			return "redirect:/complaint";
		} else {
			redirectAttributes.addFlashAttribute("loginError", "Invalid username or password");
			return "redirect:/login";
		}
	}
}
