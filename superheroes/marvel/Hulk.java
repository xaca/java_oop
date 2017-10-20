package marvel;

import java.util.ArrayList;
import java.util.List;

import structure.Abilities;
import structure.Character;
import structure.Power;

public class Hulk extends Character {
	public Hulk() {
		this.setName("Hulk");
		this.setRealName("Robert Bruce Banner");
		this.setUniverse(new MarvelUniverse());
		this.setPlaceOfBirth("Dayton, Ohio");
		this.setPowers(this.powers());
		this.setAbilities(this.abilities());
	}
	
	private List<Power> powers() {
		ArrayList<Power> powers = new ArrayList<>();
		powers.add(new Power("super strength"));
		powers.add(new Power("leap great distances"));
		powers.add(new Power("hands shock wave"));
		powers.add(new Power("resistance to damage"));
		
		return powers;
	}
	
	private Abilities abilities() {
		Abilities abilities = new Abilities();
		abilities.setDurability(7);
		abilities.setEnergy(1);
		abilities.setFighting(5);
		abilities.setIntelligence(6);
		abilities.setSpeed(7);
		abilities.setStrength(7);
		
		return abilities;
	}
	
}
