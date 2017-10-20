public class Carro extends Vehiculo{
	private boolean encendido;
	private String tipo_combustible;
	private boolean clutch_liberado;

	public void acelerar(){

		if(!encendido)
		{
			prenderCarro();
		}

		cambiarCambio(1);
		liberarClutch();
		presionarAcelerador();
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
		}
	}

	public void cambiarCambio(int nuevo_cambio)
	{
		this.cambio_actual = nuevo_cambio;
	}
}