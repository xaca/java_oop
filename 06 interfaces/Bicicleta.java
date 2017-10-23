public abstract class Bicicleta extends Vehiculo {
	private int velocidades;
	public abstract void realizarCambio(int cambio_actual);

	protected Bicicleta(float kilometraje){
		super(kilometraje);
	}
}