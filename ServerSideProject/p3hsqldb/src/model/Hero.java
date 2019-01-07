package model;

public class Hero {
	private int id;
	private String name;
	private String creator;
	private String alias;
	private String hometown;
	private String weapon;
	/**
	 * @param name
	 * @param creator
	 * @param alias
	 * @param hometown
	 * @param weapon
	 */
	public Hero( int id, String creator, String name, String alias, String hometown, String weapon) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.alias = alias;
		this.hometown = hometown;
		this.weapon = weapon;
	}
	public Hero(String name, String creator, String alias, String hometown, String weapon) {
		super();
		this.name = name;
		this.creator = creator;
		this.alias = alias;
		this.hometown = hometown;
		this.weapon = weapon;
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
	 * @return the creator
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * @param creator the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * @param alias the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * @return the hometown
	 */
	public String getHometown() {
		return hometown;
	}
	/**
	 * @param hometown the hometown to set
	 */
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	/**
	 * @return the weapon
	 */
	public String getWeapon() {
		return weapon;
	}
	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
}
