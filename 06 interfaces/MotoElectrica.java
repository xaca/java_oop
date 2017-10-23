class MotoElectrica extends Moto {
	private float carga_bateria;

	public MotoElectrica(){
		super((float)Math.random()*10000);
	}

	public String toString()
    {
        return "Moto tiene "+kilometraje+" km";
    }

	public void acelerar(){
		desplazamiento();
	}

	public boolean estaCargada(){
		return (carga_bateria > 0);
	}
}