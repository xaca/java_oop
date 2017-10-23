public abstract class Moto extends Vehiculo {
	private int rpm;
	
	protected Moto(float kilometraje){
		super(kilometraje);
	}
	public void revolucionarMotor()
	{
		for (int i=0; i< 5000; i++ ) {
			rpm +=5;
		}
	}

	/* Implemente la interfaz matenimiento */

	//public void acelerar(){} No es una buena practica, porque no hay implementación

	/*public void acelerar(){

		cambio_actual = 1;
		
		revolucionarMotor();

		if(rpm == 5000){
			cambio_actual = 2;
		}

	}*/
}