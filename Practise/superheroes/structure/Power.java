package structure;

public class Power {
	private String name; //spider-sense, agility, super strength 

	public Power() {}
	
	public Power(String powerName) {
		this.name = powerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}