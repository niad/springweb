package kr.niad.spring.dao.system.impl.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import kr.niad.spring.AbstractTest;
import kr.niad.spring.dao.system.impl.mapper.UserMapper;
import kr.niad.spring.domain.system.User;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.springtestdbunit.annotation.DatabaseSetup;


public class UserMapperTest extends AbstractTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	@DatabaseSetup("/kr/niad/spring/dao/system/impl/mapper/UserMapperTest.xml")
	public void testSelectUser() {
		List<User> users = userMapper.selectAll();
		
		assertEquals(1, users.size());
	}

}
