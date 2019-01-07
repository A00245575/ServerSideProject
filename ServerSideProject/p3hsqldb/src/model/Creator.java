package model;

import java.util.ArrayList;
import java.util.List;

import DAO.CreatorDao;

public class Creator {

	private int id;
	private String name;
	private String foundedBy;
	private int yearFounded;
	private String town;
	List<Hero> heroes = new ArrayList<Hero>();
	/**
	 * @param name
	 * @param foundedBy
	 * @param yearFounded
	 * @param town
	 */
	public Creator( int id, String name, String foundedBy, int yearFounded, String town) {
		super();
		this.id = id;
		this.name = name;
		this.foundedBy = foundedBy;
		this.yearFounded = yearFounded;
		this.town = town;
	}
	public Creator(String name, String foundedBy, int yearFounded, String town) {
		super();
		this.name = name;
		this.foundedBy = foundedBy;
		this.yearFounded = yearFounded;
		this.town = town;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the foundedBy
	 */
	public String getFoundedBy() {
		return foundedBy;
	}
	/**
	 * @param foundedBy the foundedBy to set
	 */
	public void setFoundedBy(String foundedBy) {
		this.foundedBy = foundedBy;
	}
	/**
	 * @return the yearFounded
	 */
	public int getYearFounded() {
		return yearFounded;
	}
	/**
	 * @param yearFounded the yearFounded to set
	 */
	public void setYearFounded(int yearFounded) {
		this.yearFounded = yearFounded;
	}
	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}
	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}
	
	
}
