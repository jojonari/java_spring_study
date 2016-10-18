package com.java.spring.study.user.dao;



/**
 * Created by JoJoNaRi on 2016-10-18.
 */
public class DaoFactory {
    public UserDao userDao(){
        UserDao userDao = new UserDao(connectionMaker());
        return userDao;
    }

    public AcountDao acountDao(){
        AcountDao acountDao = new AcountDao(connectionMaker());
        return acountDao;
    }

    public MessageDao messageDao(){
        MessageDao messageDao = new MessageDao(connectionMaker());
        return messageDao;
    }

    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }
}
