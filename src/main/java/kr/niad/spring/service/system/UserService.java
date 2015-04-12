package kr.niad.spring.service.system;

import java.util.List;

import kr.niad.spring.domain.system.User;

public interface UserService {

	User findUser(Long id);
	
	List<User> findUsers();
	
}
