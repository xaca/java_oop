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

	public void hacerRuido(String palabra){

		System.out.println("Repetir "+palabra);

	}

	public void hacerRuido(){

		int aleatorio = (int)(Math.random()*palabras.length);
		System.out.println(palabras[aleatorio]);

	}

	public void setPuedeHablar(boolean puede_hablar){
		this.puede_hablar = puede_hablar;
	}

	public boolean isPuedeHablar(){
		return puede_hablar;
	}
}