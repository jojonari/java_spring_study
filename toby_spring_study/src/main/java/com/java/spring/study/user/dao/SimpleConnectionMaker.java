package com.java.spring.study.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by JoJoNaRi on 2016-10-11.
 */
public class SimpleConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_spring_study?autoReconnect=true&useUnicode=true&useSSL=true&characterEncoding=utf8", "user", "user");
        return conn;

    }
}
