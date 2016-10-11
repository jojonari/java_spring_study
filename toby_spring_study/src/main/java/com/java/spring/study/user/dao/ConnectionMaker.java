package com.java.spring.study.user.dao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by JoJoNaRi on 2016-10-11.
 */
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;

}
