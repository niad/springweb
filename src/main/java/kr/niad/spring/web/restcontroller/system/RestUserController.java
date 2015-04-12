package kr.niad.spring.web.restcontroller.system;

import java.util.List;

import kr.niad.spring.domain.system.User;
import kr.niad.spring.service.system.UserService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws/system/user")
public class RestUserController {

	private static final Log logger =  LogFactory.getLog(RestUserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping
	public List<User> findUsers() {
		
		logger.debug("request user jason data");
		
		List<User> users = userService.findUsers();
		
		return users;
	}
	
}
