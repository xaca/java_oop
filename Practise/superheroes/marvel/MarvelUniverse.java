package marvel;

import java.util.ArrayList;
import java.util.List;

import structure.Universe;
import structure.Character;

public class MarvelUniverse extends Universe {
	
	public MarvelUniverse() {
		this.setName("Marvel");
		this.setSuperheroes(this.superheroes());
	}
	
	public List<Character> superheroes() {
		ArrayList<Character> characters = new ArrayList<Character>();
		
		characters.add(new SpiderMan());
		characters.add(new Hulk());
		
		return characters;
	}
}
