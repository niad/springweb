package kr.niad.spring.dao.system.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.niad.spring.dao.system.UserDao;
import kr.niad.spring.dao.system.impl.mapper.UserMapper;
import kr.niad.spring.domain.system.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper mapper;
	
	public User selectUser(Long id) {
		return mapper.select(id);
	}

	public List<User> selectUsers() {
		return mapper.selectAll();
	}

	
	
	
}
