package com.java.spring.study.user.dao;

import com.java.spring.study.user.domain.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDao {
	private ConnectionMaker connectionMaker;

	public MessageDao(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	public MessageDao() {
		this.connectionMaker = new DConnectionMaker();
	}

	public void add(User user)throws ClassNotFoundException, SQLException {

		Connection conn = connectionMaker.makeConnection();
		PreparedStatement ps = conn.prepareStatement(
				"insert into users(id, name, password) values(?,?,?)");
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		
		ps.close();
		conn.close();
				
	}


	public User get(String id)throws ClassNotFoundException, SQLException {

		Connection conn = connectionMaker.makeConnection();
		PreparedStatement ps = conn.prepareStatement("select * from users where id = ?");
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		User user = new User();
		user.setId(rs.getString("id"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		conn.close();
		return user;
		
	}
}
