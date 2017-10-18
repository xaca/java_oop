class Princesa{

	private String nombre;
	private String color_cabello;
	private String color_piel;
	private float longitud_cabello;
	private String color_ojos;
	private boolean delicada;
	private Mascota mascota;
	private Vestido vestido;
	private int edad;
	private int estrato_social;
	private int estado_civil;


	/*¿Qué pasa si intentamos crear una instancia de Princesa
	usando el contructor por defecto?
	nota: observe que no tenemos la implementación del contructor por defecto.
	*/
	public Princesa(String nombre){
		this.nombre = nombre;
	}
	
}