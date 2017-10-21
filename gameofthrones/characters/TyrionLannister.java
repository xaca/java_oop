
/**
 * Tyrion character object that sets all the fields in the constructor
 * Extending the Character class will allow for code reuse
 * based on game of thrones wiki page
 * 
 * @author sherilpaulin
 *
 */
public class TyrionLannister extends Character{
	private List<String> titles = new ArrayList<String>();      
	private String nickname;   
	private String fullName;  
	private String portrayedBy; 
	private House house;   
	
	public TyrionLannister(House house) {
		this.generateTitles();
		this.nickname = "The Imp";
		this.fullName = "Tyrion Lannister";
		this.portrayedBy = "Peter Dinklage"
		//house might be better assigned if it was passed into the constructor
		this.house = house;
	}

	private List<String> generateTitles(){
		this.titles.add("Lord of Casterly Rock");
		this.titles.add("Lord Paramount of the Westerlands");
		this.titles.add("Warden of the West");
		this.titles.add("Hand of the Queen");
		this.titles.add("Master of Coin");
		this.titles.add("Acting Hand of the King");
	}
}
