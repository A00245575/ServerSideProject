package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Hero;
import model.HeroesByCreator;

public enum HeroesByCreatorsDao {
	instance;


	public List<HeroesByCreator> listHero(String name) {
		Connection connection = getConnection();
		List<HeroesByCreator> heroes = new ArrayList<HeroesByCreator>();
		HeroesByCreator hero = null ;
		 try {
		 PreparedStatement psmt = connection
				 .prepareStatement("SELECT hero.id, hero.name, hero.alias, hero.hometown, hero.weapon, creator.id, creator.name, creator.foundedBy, creator.yearFounded  FROM Hero, Creator WHERE Hero.creator = Creator.name and Creator.name like '"+ name +"'");
		 ResultSet rs = psmt.executeQuery();
		//ResultSet rs = psmt.executeQuery();
		 while (rs.next()) {
			 hero = new HeroesByCreator( rs.getInt("hero.id"), rs.getString("hero.name"), rs.getString("hero.alias"), rs.getString("hero.hometown"), rs.getString("hero.weapon"), rs.getInt("creator.id"), rs.getString("creator.name"), rs.getString("creator.foundedBy"), rs.getInt("creator.yearFounded")) ;
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
	
	public HeroesByCreator searchHero(String name) {
		Connection connection = getConnection();
		HeroesByCreator hero = null ;
		 try {
		 PreparedStatement psmt = connection
		 .prepareStatement("SELECT hero.id, hero.name, hero.alias, hero.hometown, hero.weapon, creator.id, creator.name, creator.foundedBy, creator.yearFounded  FROM Hero, Creator WHERE Hero.creator = Creator.name and Creator.name like '%"+ name +"%'");
		 ResultSet rs = psmt.executeQuery();
		//ResultSet rs = psmt.executeQuery();
		 while (rs.next()) {
		 hero = new HeroesByCreator( rs.getInt("hero.id"), rs.getString("hero.name"), rs.getString("hero.alias"), rs.getString("hero.hometown"), rs.getString("hero.weapon"), rs.getInt("creator.id"), rs.getString("creator.name"), rs.getString("creator.foundedBy"), rs.getInt("creator.yearFounded")) ;
		 }
		 } catch (SQLException e) {
		 e.printStackTrace();
		 }
		 return hero;
	}
}
