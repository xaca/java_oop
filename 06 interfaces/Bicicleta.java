public abstract class Bicicleta extends Vehiculo {
	private int velocidades;
	public abstract void realizarCambio(int cambio_actual);

	protected Bicicleta(float kilometraje){
		super(kilometraje);
		//super(3.4);//No compila porque 3.4 es double, se debe especificar con la F al final para que funcione
	}
}