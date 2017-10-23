public class Patineta extends Vehiculo implements Mantenimiento {
	
	public void acelerar()
	{
		desplazamiento();
	}
	
	public boolean hayQueHacerMantenimiento(){
		return kilometraje >= Mantenimiento.CAMBIO_LLANTAS_PATINETA;
	}

	public void engrasarPartesMoviles(){
		System.out.println("Engrasando balineras de las llantas");
	}

	public void cambiarLlantas(float cantidad_kilometros){

		if(cantidad_kilometros == Mantenimiento.CAMBIO_LLANTAS_CARRO)
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

}