package structure;

import java.util.List;

/**
 * Character object. 
 * Based on http://marvel.com/universe/Main_Page
 * @author andredgusmao
 *
 */

public class Character {
	
	private String name; //Spider-Man
	private String realName; //Peter Benjamin Parker
	private Universe universe; //Marvel Universe
	private String placeOfBirth; //Forest Hills, New York
	private List<Power> powers; //spider-sense, agility, super strength 
	private Abilities abilities; //from POWERGRID
	
	public Character() {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public Universe getUniverse() {
		return universe;
	}
	
	public void setUniverse(Universe universe) {
		this.universe = universe;
	}
	
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	public List<Power> getPowers() {
		return powers;
	}
	
	public void setPowers(List<Power> powers) {
		this.powers = powers;
	}
	
	public Abilities getAbilities() {
		return abilities;
	}
	
	public void setAbilities(Abilities abilities) {
		this.abilities = abilities;
	}
	
}