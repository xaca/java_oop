package structure;

/**
 * Abilities object from POWERGRID. 
 * Based on http://marvel.com/universe/{character} POWERGRID
 * @author andredgusmao
 *
 */

public class Abilities {

	private int durability;
	private int energy;
	private int fighting;
	private int intelligence;
	private int speed;
	private int strength;
	
	public Abilities() {}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getFighting() {
		return fighting;
	}

	public void setFighting(int fighting) {
		this.fighting = fighting;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
}
