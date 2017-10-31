/*
 * 
 * @author chaostools
 *
 */
public class GregorClegane extends Character{
	private List<String> titles;      
	private String nickname;   
	private String fullName;  
	private String portrayedBy; 
	private House house;
	private Seat seat;
	private Family family;
	
	public GregorClegane(House house,Seat seat, Family family) {
		this.titles = new ArrayList<String>();
		this.generateTitles();
		this.nickname = "The Mountain";
		this.fullName = "Gregor Clegane";
		this.portrayedBy = "Hafþór Júlíus Björnsson";
		
		this.house = house;
		this.seat = seat
		this.family = family;
		
	}

	private void generateTitles(){
		this.titles.add("The Mountain That Rides");
		this.titles.add("The Mountain");
		this.titles.add("Tywin Lannister's Mad Dog");
		
	}
}

