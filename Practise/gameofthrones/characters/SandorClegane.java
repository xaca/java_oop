/*
 * 
 * @author chaostools
 *
 */
public class SandorClegane extends Character{
	private List<String> titles;      
	private String nickname;   
	private String fullName;  
	private String portrayedBy; 
	private House house;
	private Seat seat;
	private Family family;
	
	public SandorClegane(House house,Seat seat, Family family) {
		this.titles = new ArrayList<String>();
		this.generateTitles();
		this.nickname = "The Hound";
		this.fullName = "Sandor Clegane";
		this.portrayedBy = "Rory McCann";
		
		this.house = house;
		this.seat = seat
		this.family = family;
		
	}

	private void generateTitles(){
		this.titles.add("Dog");
		this.titles.add("The Hound");
		this.titles.add("KingsGuard");
		
	}
}

