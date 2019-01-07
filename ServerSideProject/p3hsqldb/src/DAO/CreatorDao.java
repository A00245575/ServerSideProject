package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Creator;

public enum CreatorDao {
	instance;
	List<Creator> creators;
	
	
	public List<Creator> listCreator() {
		Connection con = getConnection();
		List<Creator> creators = new ArrayList<Creator>();
		 Creator creator = null ;
		 try {
			 PreparedStatement psmt = con
					 .prepareStatement("SELECT * FROM creator");
					 ResultSet rs = psmt.executeQuery();
					//ResultSet rs = psmt.executeQuery();
					 while (rs.next()) {
					 creator = new Creator( rs.getInt("id"), rs.getString("name"), rs.getString("foundedBy"), rs.getInt("yearFounded"), rs.getString("town")) ;
					 creators.add(creator);
					 }
		 
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }
		return creators;
		
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
	
	public void save(Creator creator) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO Creator(name, foundedBy, yearFounded, town)"
				+ "VALUES ('" + creator.getName() + "','" + creator.getFoundedBy() + "','" + creator.getYearFounded() + "','" + creator.getTown() +"')");
		stmt.executeUpdate();
	}
	
	public Creator searchCreator(String name) {
		Connection connection = getConnection();
		 Creator creator = null ;
		 try {
		 PreparedStatement psmt = connection
		 .prepareStatement("SELECT * FROM Creator WHERE name like '%"+ name +"%'");
		 ResultSet rs = psmt.executeQuery();
		//ResultSet rs = psmt.executeQuery();
		 while (rs.next()) {
			 creator = new Creator( rs.getInt("id"), rs.getString("name"), rs.getString("foundedBy"), rs.getInt("yearFounded"), rs.getString("town")) ;
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }
		 return creator;
	}
	

}
