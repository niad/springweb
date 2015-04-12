package kr.niad.spring.web.controller.system;

import java.util.List;

import kr.niad.spring.domain.system.User;
import kr.niad.spring.service.system.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/system/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping
	public ModelAndView list() {
		
		List<User> users = userService.findUsers();
		
		ModelAndView mav = new ModelAndView("system/user/users");
		mav.addObject("users", users);
		
		return mav;
	}
	
}
