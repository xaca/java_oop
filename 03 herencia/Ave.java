public class Ave extends Animal{
	private boolean puede_volar;
	private boolean es_cazador;

	public setPuedeVolar(boolean puede_volar){
		this.puede_volar = puede_volar;
	}

	public boolean isPuedeVolar(){
		return puede_volar;
	}

	public setEsCazador(boolean es_cazador){
		this.es_cazador = es_cazador;
	}

	public boolean isPuedeVolar(){
		return es_cazador;
	}
}