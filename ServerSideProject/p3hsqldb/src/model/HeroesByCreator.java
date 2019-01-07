package model;

public class HeroesByCreator {
	
	private int heroID;
	private String name;
	private String alias;
	private String hometown;
	private String weapon;
	private int creatorID;
	private String creator;
	private String foundedBy;
	private int yearFounded;
	/**
	 * @param heroID
	 * @param name
	 * @param alias
	 * @param hometown
	 * @param weapon
	 * @param creatorID
	 * @param creator
	 * @param foundedBy
	 * @param yearFounded
	 */
	public HeroesByCreator(int heroID, String name, String alias, String hometown, String weapon, int creatorID,
			String creator, String foundedBy, int yearFounded) {
		super();
		this.heroID = heroID;
		this.name = name;
		this.alias = alias;
		this.hometown = hometown;
		this.weapon = weapon;
		this.creatorID = creatorID;
		this.creator = creator;
		this.foundedBy = foundedBy;
		this.yearFounded = yearFounded;
	}
	/**
	 * @return the heroID
	 */
	public int getHeroID() {
		return heroID;
	}
	/**
	 * @param heroID the heroID to set
	 */
	public void setHeroID(int heroID) {
		this.heroID = heroID;
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
	/**
	 * @return the creatorID
	 */
	public int getCreatorID() {
		return creatorID;
	}
	/**
	 * @param creatorID the creatorID to set
	 */
	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
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
	
	
}
