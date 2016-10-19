package com.java.spring.study.user.dao;



/**
 * Created by JoJoNaRi on 2016-10-18.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {
    @Bean
    public UserDao userDao(){
        UserDao userDao = new UserDao(connectionMaker());
        return userDao;
    }

    @Bean
    public AcountDao acountDao(){
        AcountDao acountDao = new AcountDao(connectionMaker());
        return acountDao;
    }
    @Bean
    public MessageDao messageDao(){
        MessageDao messageDao = new MessageDao(connectionMaker());
        return messageDao;
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}
