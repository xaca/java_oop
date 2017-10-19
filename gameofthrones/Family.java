

import java.util.List;
/**
 * Family object.
 * Based on http://gameofthrones.wikia.com/wiki/Game_of_Thrones_Wiki
 * @author pahkk
 *
 */
public class Family {
	private Character father;		  //Eddard Stark
	private Character mother;         //Catelyn Stark
	private List<Character> children; //Robb Stark, Sansa Stark,Arya Stark,Bran Stark,Rickon Stark
	
	public Family() {S}

	public Character getFather() {
		return father;
	}

	public void setFather(Character father) {
		this.father = father;
	}

	public Character getMother() {
		return mother;
	}

	public void setMother(Character mother) {
		this.mother = mother;
	}

	public List<Character> getChildren() {
		return children;
	}

	public void setChildren(List<Character> children) {
		this.children = children;
	}
}
