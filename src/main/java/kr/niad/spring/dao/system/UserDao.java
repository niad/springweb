package kr.niad.spring.dao.system;

import java.util.List;

import kr.niad.spring.domain.system.User;

public interface UserDao {

	User selectUser(Long id);
	
	List<User> selectUsers();
	
}
