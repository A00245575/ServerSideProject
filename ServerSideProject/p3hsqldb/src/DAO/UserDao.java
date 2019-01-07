package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.User;


public enum UserDao {
	instance;
	List<User> users;
	
	public void listUser() {
		Connection connection = getConnection();
		 User user = null ;
		 try {
		 PreparedStatement psmt = connection
		 .prepareStatement("SELECT * FROM USER");
		 ResultSet rs = psmt.executeQuery();
		//ResultSet rs = psmt.executeQuery();
		 while (rs.next()) {
		 user = new User(rs.getString("name"), rs.getString("password"), rs.getString("address")) ;
		 users.add(user);
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }
		
	}
	
	public List<User> list() {
		return users;
	}
	
	public Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("org.hsqldb.jdbcDriver");
			con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/oneDB", "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
	
	public void save(User user) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO USER(name, password, address)"
				+ "VALUES ('" + user.getName() + "','" + user.getPassword() + "','" + user.getAddress() +"')");
		stmt.executeUpdate();
	}
	
	public User checkLogin(String name, String password) {
		 Connection connection = getConnection();
		 User user = null ;
		 try {
		 PreparedStatement psmt = connection
		 .prepareStatement("SELECT * FROM USER WHERE NAME = ? AND PASSWORD = ?");
		 psmt.setString(1, name);
		 psmt.setString(2, password);
		 ResultSet rs = psmt.executeQuery();
		//ResultSet rs = psmt.executeQuery();
		 if (rs.next()) {
		 user = new User(rs.getString("name"), rs.getString("password"), rs.getString("address")) ;
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }
		 return user ;
		 }
}

