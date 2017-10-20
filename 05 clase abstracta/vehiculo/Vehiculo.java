public abstract class Vehiculo {
	private String nombre;
	private boolean esta_moviendose;
	protected int cambio_actual;
	private int numero_llantas;

	//¿Por que una clase abstracta permite tener constructores?
	public Vehiculo(){}
	public Vehiculo(String nombre){
		this.nombre = nombre;
	}
	//No es obligatorio tener metodos abstractos en una clase abstracta,
	//Pero si es lo ideal, depende del diseño.
	public abstract void acelerar();

	public void frenar(){
		esta_moviendose = false;
	}
	public void arrancar(){
		esta_moviendose = true;
	}
}