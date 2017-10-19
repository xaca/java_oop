class Principe{
	private String nombre;
	private String color_ropa;
	private int estrato_social;

	public Principe(){

	}

	public Principe(String nombre)
	{
		setNombre(nombre);
		//this.nombre = nombre;//Mejor llamar al setter
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre(String nombre)
	{
		return nombre;
	}
}