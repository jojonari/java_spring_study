package com.java.spring.sutdy;

import java.sql.SQLException;

import com.java.spring.study.user.dao.ConnectionMaker;
import com.java.spring.study.user.dao.DConnectionMaker;
import org.junit.Test;

import com.java.spring.study.user.dao.UserDao;
import com.java.spring.study.user.domain.User;

public class TestMain {
	@Test
	public void main() throws ClassNotFoundException, SQLException {
		ConnectionMaker connectionMaker = new DConnectionMaker();

		UserDao dao = new UserDao(connectionMaker);
		User user = new User();
		
		user.setId("3113j4");
		user.setName("백재현");
		user.setPassword("married");
		dao.add(user);
		
		System.out.println(user.getId() + "등록성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		
		System.out.println(user2.getId() + "조회 성공");
		
				

	}

}
