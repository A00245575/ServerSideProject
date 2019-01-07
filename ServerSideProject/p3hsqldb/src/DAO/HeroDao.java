package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Hero;

public enum HeroDao {
	instance;
	
	
	
	public List<Hero> listHero() {
		Connection connection = getConnection();
		List<Hero> heroes = new ArrayList<Hero>();
		 Hero hero = null ;
		 try {
		 PreparedStatement psmt = connection
		 .prepareStatement("SELECT * FROM Hero");
		 ResultSet rs = psmt.executeQuery();
		//ResultSet rs = psmt.executeQuery();
		 while (rs.next()) {
		 hero = new Hero( rs.getInt("id"), rs.getString("name"), rs.getString("creator"), rs.getString("alias"), rs.getString("hometown"), rs.getString("weapon")) ;
		 heroes.add(hero);
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }
		return heroes;
		
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
	
	public void save(Hero hero) throws ClassNotFoundException, SQLException
	{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("INSERT INTO Hero(name, creator, alias, hometown, weapon)"
				+ "VALUES ('" + hero.getName() + "','" + hero.getCreator() + "','" + hero.getAlias() + "','" + hero.getHometown() + "','" + hero.getWeapon() +"')");
		stmt.executeUpdate();
	}
	
	public List<Hero> searchHero(String name) {
		Connection connection = getConnection();
		List<Hero> heroes = new ArrayList<Hero>();
		 Hero hero = null ;
		 try {
		 PreparedStatement psmt = connection
		 .prepareStatement("SELECT * FROM Hero WHERE name like '%"+ name +"%'");
		 ResultSet rs = psmt.executeQuery();
		//ResultSet rs = psmt.executeQuery();
		 while (rs.next()) {
		 hero = new Hero( rs.getInt("id"), rs.getString("name"), rs.getString("creator"), rs.getString("alias"), rs.getString("hometown"), rs.getString("weapon")) ;
		 heroes.add(hero);
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }
		 return heroes;
	}

}
