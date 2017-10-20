class BicicletaRuta extends Bicicleta {
	public float inclinacion;

	/* Observe que el método realizarCambio es similar al cambiarCambio de la clase Carro,
	   ¿Cómo podriamos estandarizar el nombre de los métodos?
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

	public void pedalear(){
		
	}
}