public class Animal{
	private String nombre;
	private boolean tiene_patas;
	private int numero_patas;
	private boolean carnivoro;

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setTienePatas(boolean tiene_patas){
		this.tiene_patas = tiene_patas;
	}

	public boolean isTienePatas(){
		return tiene_patas;
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
}