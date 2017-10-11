public class Loro extends Ave{
	public boolean puede_hablar;
	public String palabras[];

	public Loro()
	{
		this.setNombre("Loro");
		this.setPuedeHablar(true);
		palabras = new String[4];
		palabras[0] = "Hola";
		palabras[1] = "Mundo";
		palabras[2] = "Buenos días";
		palabras[3] = "¿Quiere cacao?";
	}


	public void hablar(){

		int aleatorio = Math.round(Math.random()*palabras.length);
		System.out.println(palabras[aleatorio]);

	}
}