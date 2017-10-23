class MotoElectrica extends Moto {
	private float carga_bateria;

	public void acelerar(){
		desplazamiento();
	}

	public boolean estaCargada(){
		return (carga_bateria > 0);
	}
}