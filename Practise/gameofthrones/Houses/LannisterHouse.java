/**
 * Lannister house object that sets all the fields in the constructor
 * Extending the House object will allow for code reuse
 * based on game of thrones wiki page
 * @author sherilpaulin
 *
 */
public class LannisterHouse extends House{
	private String sigil;
	private String quote;
	private String religion;
	private Character founder;
	public LannisterHouse(){
		this.sigil = "A golden lion rampant on a crimson field";
		this.quote = "Hear me roar"
		this.religion = "Faith of the Seven"
		/*since founder is the type Character in the House class 
		*you need to create a new lann the clever character.
		*/ 
		this.founder = new LannTheClever();
	}

}
