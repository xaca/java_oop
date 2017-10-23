class BicicletaRuta extends Bicicleta implements CambioDeMarcha,Mantenimiento {
	public float inclinacion;

	/* Observe que el método realizarCambio es similar al cambiarCambio de la clase Carro,
	   ¿Cómo podriamos estandarizar el nombre de los métodos?
	   Rta/. Realizando una interfaz con un método estandar que debe ser implementado
	*/
	public void realizarCambio(int cambio_actual){
		this.cambio_actual = cambio_actual;
	}

	public void acelerar(){
		if(inclinacion==0)
		{
			realizarCambio(1);
		}
		else if(inclinacion>0 && inclinacion<=.3)
		{
			realizarCambio(2);
		}
		else if(inclinacion>.3 && inclinacion<=.5)
		{
			realizarCambio(3);
		}
		else if(inclinacion>.5 && inclinacion<.7)
		{
			realizarCambio(4);
		}
		//...

		pedalear();

	}

	public boolean hayQueHacerMantenimiento(){
		return kilometraje >= Mantenimiento.CAMBIO_LLANTAS_BICICLETA;
	}

	public void engrasarPartesMoviles(){
		System.out.println("Engrasando balineras de las llantas");
	}

	public void cambiarLlantas(float cantidad_kilometros){

		if(cantidad_kilometros == Mantenimiento.CAMBIO_LLANTAS_BICICLETA)
		{
			System.out.println("Rotacion de las llantas");
		}
		else
		{
			System.out.println("Comprar nuevas llantas");
		}

	}

	public void realizarMantenimiento(){

		if(hayQueHacerMantenimiento())
		{
			engrasarPartesMoviles();
			cambiarLlantas(kilometraje);
		}

	}

	public void pedalear(){
		desplazamiento();
	}
}