package com.java.spring.study.user.dao;

import com.java.spring.study.user.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * Created by JoJoNaRi on 2016-10-31.
 */
public class UserDaoConnectionCountionTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
        UserDao dao = context.getBean("userDao", UserDao.class);

       User user = new User();

        user.setId("123ddd");
        user.setName("백재현");
        user.setPassword("married");
        dao.add(user);

        System.out.println(user.getId() + "등록성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회 성공");


        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println(" Connection : " + ccm.getCounter());
    }
}
