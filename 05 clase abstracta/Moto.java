class Moto extends Vehiculo {
	private int rpm;

	public void revolucionarMotor()
	{
		for (int i=0; i< 5000; i++ ) {
			rpm +=5;
		}
	}

	public void acelerar(){

		cambio_actual = 1;
		
		revolucionarMotor();

		if(rpm == 5000){
			cambio_actual = 2;
		}

	}
}