package kr.niad.spring.service.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.niad.spring.dao.system.UserDao;
import kr.niad.spring.domain.system.User;
import kr.niad.spring.service.system.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User findUser(Long id) {
		return userDao.selectUser(id);
	}

	public List<User> findUsers() {
		return userDao.selectUsers();
	}

}
