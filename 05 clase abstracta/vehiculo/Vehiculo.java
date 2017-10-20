public abstract class Vehiculo {
	private String nombre;
	private boolean esta_moviendose;
	protected int cambio_actual;

	public abstract void acelerar();
	public void frenar(){
		esta_moviendose = false;
	}
	public void arrancar(){
		esta_moviendose = true;
	}
}