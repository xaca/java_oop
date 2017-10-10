public class Elefante{

	private String nombre;
	private String color;
	private int numero_patas;
	private Elefante[] crias;
	private boolean carnivoro;

	public Elefante(){

	}

	public Elefante(int numero_patas)
	{
		this.numero_patas=numero_patas;
	}

	public Elefante(String nombre){
		setNombre(nombre);
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setElefantes(Elefante[] crias){
		this.crias = crias;
	}

	public Elefante[] getElefantes(){
		return crias;
	}

	public void setNumeroPatas(int numero_patas){
		this.numero_patas = numero_patas;
	}

	public int getNumeroPatas(){
		return numero_patas;
	}

	public void setCarnivoro(boolean carnivoro)
	{
		this.carnivoro = carnivoro;
	}

	public boolean isCarnivoro(){
		return carnivoro;
	}

	public void imprimirNombreCrias(){
		for(int i=0;i<crias.length;i++){
			if(crias[i]!=null){
				System.out.println(crias[i].getNombre());
			}
		}
	}

	public void crearCriasAleatorias(){
		Elefante temp;
		crias = new Elefante[((int)(Math.random()*20))+1];

		for (int i = 0; i< crias.length ; i++) {
			temp = new Elefante();
			temp.setNombre("Elefante"+(int)(Math.random()*100));
			crias[i] = temp;
		}
	}

	public void setElefante(int indice, Elefante elefante)
	{
		if(crias == null){
			crias = new Elefante[5];
		}

		if(indice >= 0 && indice < crias.length)
		{
			crias[indice] = elefante;
		}
		else{
			System.out.println("Error, se intento asiagnar un elefante en una posición invalida");
		}
	}

}