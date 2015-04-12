package kr.niad.spring.dao.system.impl.mapper;

import java.util.List;

import kr.niad.spring.annotation.Mapper;
import kr.niad.spring.domain.system.User;

@Mapper
public interface UserMapper {

	void insert(User user);
	
	List<User> selectAll();
	
	User select(Long id);
	
}
