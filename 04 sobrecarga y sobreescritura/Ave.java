public class Ave extends Animal{
	private boolean puede_volar;
	private boolean es_cazador;

	public void setPuedeVolar(boolean puede_volar){
		this.puede_volar = puede_volar;
	}

	public boolean isPuedeVolar(){
		return puede_volar;
	}

	public void setEsCazador(boolean es_cazador){
		this.es_cazador = es_cazador;
	}

	public boolean isEsCazador(){
		return es_cazador;
	}
}