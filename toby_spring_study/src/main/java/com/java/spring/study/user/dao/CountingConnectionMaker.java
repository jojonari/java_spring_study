package com.java.spring.study.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by JoJoNaRi on 2016-10-31.
 */
public class CountingConnectionMaker implements ConnectionMaker{

    int counter = 0;
    private ConnectionMaker realConnectionMaker;

    public CountingConnectionMaker(ConnectionMaker realConnectionMaker) {
        this.realConnectionMaker = realConnectionMaker;
    }

    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        this.counter++;
        return realConnectionMaker.makeConnection();
    }

    public int getCounter() {
        return this.counter;
    }
}
