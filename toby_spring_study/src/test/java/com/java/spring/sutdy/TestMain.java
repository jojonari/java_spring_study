package com.java.spring.sutdy;

import java.sql.SQLException;

import com.java.spring.study.user.dao.ConnectionMaker;
import com.java.spring.study.user.dao.DConnectionMaker;
import com.java.spring.study.user.dao.DaoFactory;
import org.junit.Test;

import com.java.spring.study.user.dao.UserDao;
import com.java.spring.study.user.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	@Test
	public void main() throws ClassNotFoundException, SQLException {

	    ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);	User user = new User();

		user.setId("11223311");
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
