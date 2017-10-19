class Princesa{

	private String nombre;
	private String color_cabello;
	private String color_piel;
	private float longitud_cabello;
	private String color_ojos;
	private boolean delicada;
	private Mascota mascota;
	private Vestido vestido;
	private Principe principe;
	private int edad;
	private int estrato_social;
	private int estado_civil;
	private String profesion;

	//Se sobrecarga el constructor por defecto aunque no se use.
	public Princesa()
	{
		//principe = new Principe(); El principe no es generico
	}

	public Princesa(Principe principe)
	{
		this.setPrincipe(principe);
	}

	/*¿Qué pasa si intentamos crear una instancia de Princesa
	usando el contructor por defecto?
	nota: observe que no tenemos la implementación del contructor por defecto.
	Rta/. El programa no compila si se llama al constructor por defecto y el programa
	si compila si solo se llama al constructor sobrecargado
	*/
	public Princesa(String nombre){
		this.nombre = nombre;
	}
	
	public void cantar(){

	}

	public void bailar(){

	}

	public void setPrincipe(Principe principe)
	{
		this.principe = principe;
	}

	public Principe getPrincipe()
	{
		return principe;
	}
}