

import java.util.List;
/**
 * Seat object. Refers to the kingdom
 * Based on http://gameofthrones.wikia.com/wiki/Game_of_Thrones_Wiki
 * @author pahkk
 *
 */
public class Seat {
	private House		house;       //House Stark
	private String      name;        //Winterfell
	private String      region;      //The North
	private Character   lord;        //Sansa Stark
	private Character   heir;        //Arya Stark
	private List<House> allegiances; //House Targaryen
	private List<House> vassals;     //House Glover,House Hornwood,House Mazin,House Mormont,House Reed, etc.
	private int         military;    //20000 approx
	
	public Seat() {}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Character getLord() {
		return lord;
	}

	public void setLord(Character lord) {
		this.lord = lord;
	}

	public Character getHeir() {
		return heir;
	}

	public void setHeir(Character heir) {
		this.heir = heir;
	}

	public List<House> getAllegiances() {
		return allegiances;
	}

	public void setAllegiances(List<House> allegiances) {
		this.allegiances = allegiances;
	}

	public List<House> getVassals() {
		return vassals;
	}

	public void setVassals(List<House> vassals) {
		this.vassals = vassals;
	}

	public int getMilitary() {
		return military;
	}

	public void setMilitary(int military) {
		this.military = military;
	}
	
}
