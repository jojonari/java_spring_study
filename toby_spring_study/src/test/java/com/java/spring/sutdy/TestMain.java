package com.java.spring.sutdy;

import java.sql.SQLException;

import org.junit.Test;

import com.java.spring.study.user.dao.UserDao;
import com.java.spring.study.user.domain.User;

public class TestMain {
	@Test
	public void main() throws ClassNotFoundException, SQLException {
		
		UserDao dao = new UserDao();
		User user = new User();
		
		user.setId("whiteship");
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
