public class Carro extends Vehiculo implements CambioDeMarcha,Mantenimiento {
	private boolean encendido;
	private String tipo_combustible;
	private boolean clutch_liberado;

	public Carro(){
		super((float)Math.random()*10000);		
	}

	public String toString()
    {
        return "Carro tiene "+kilometraje+" km";
    }

	public void acelerar(){

		if(!encendido)
		{
			prenderCarro();
		}

		realizarCambio(1);
		liberarClutch();
		presionarAcelerador();
	}

	public void realizarCambio(int nuevo_cambio)
	{
		this.cambio_actual = nuevo_cambio;
	}
	
	public boolean hayQueHacerMantenimiento(){
		return kilometraje >= Mantenimiento.CAMBIO_LLANTAS_CARRO;
	}

	public void engrasarPartesMoviles(){
		System.out.println("Engrasando balineras de las llantas y del motor");
	}

	public void cambiarLlantas(float cantidad_kilometros){

		if(cantidad_kilometros == Mantenimiento.CAMBIO_LLANTAS_CARRO)
		{
			System.out.println("Rotacion de las llantas");
		}
		else if(cantidad_kilometros>Mantenimiento.CAMBIO_LLANTAS_CARRO)
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

	public void prenderCarro(){
		encendido = true;
	}

	public void liberarClutch(){
		clutch_liberado = true;
		System.out.println("liberando el clutch");
	}

	public void presionarAcelerador(){
		if(clutch_liberado && cambio_actual > 0){
			System.out.println("Avanzando");
			desplazamiento();
			//Solución temporal para el caso de que un vehiculo no se le vuelva a
			//realizar mantenimiento teniendo en cuenta el kilomentraje
			//Pendiente mejorar
			if(kilometraje + 1000 > Mantenimiento.CAMBIO_LLANTAS_CARRO)
			{
				this.hizo_mantenimiento = false;
			}
		}
	}

}