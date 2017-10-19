

/**
 * House object. 
 * Based on http://gameofthrones.wikia.com/wiki/Game_of_Thrones_Wiki
 * @author pahkk
 *
 */
public class House {
	private String    sigil;    //A grey direwolf on a white field
	private String    quote;    //"Winter Is Coming"
	private String    religion; //Old Gods of the Forest
	private Character founder;  //Bran the Builder
	
	public House() {}

	public String getSigil() {
		return sigil;
	}

	public void setSigil(String sigil) {
		this.sigil = sigil;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public Character getFounder() {
		return founder;
	}

	public void setFounder(Character founder) {
		this.founder = founder;
	}
	
}
