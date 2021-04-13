package com.randy.strings;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	String password = "null";
	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
//		model.addAttribute("password", null);
		return "index.jsp";
	}
	
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String result(@RequestParam(value="password") String password, HttpSession session) {
		session.setAttribute("password", password);
//		return "results.jsp";
		String code = "bushido";
		if(password.equals(code)) {
			return "results.jsp";
		}
			return "redirect:/createError";
	}
	
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder");
        return "redirect:/";
    }
	
}
