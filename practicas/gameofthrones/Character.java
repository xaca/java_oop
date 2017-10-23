

import java.util.List;
/**
 * Character object. 
 * Based on http://gameofthrones.wikia.com/wiki/Game_of_Thrones_Wiki
 * @author pahkk
 *
 */
public class Character {
	private List<String>  titles;      //Lady of Winterfell
	private String        nickname;    //Little dove
	private String        fullName;    //Sansa Stark
	private String        portrayedBy; //Sophie Turner
	private House         house;       //House Stark
	
	public Character() {}

	public List<String> getTitles() {
		return titles;
	}

	public void setTitles(List<String> titles) {
		this.titles = titles;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPortrayedBy() {
		return portrayedBy;
	}

	public void setPortrayedBy(String portrayedBy) {
		this.portrayedBy = portrayedBy;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}
}
