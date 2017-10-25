public abstract class Vehiculo {
	private String nombre;
	private boolean esta_moviendose;
	protected boolean hizo_mantenimiento;
	protected int cambio_actual;
	private int numero_llantas;
	protected float kilometraje;

	//¿Por que una clase abstracta permite tener constructores?
	protected Vehiculo(){}
	protected Vehiculo(String nombre){
		this.nombre = nombre;
	}
	protected Vehiculo(float kilometraje){
		this.kilometraje = kilometraje;
	}
	//No es obligatorio tener metodos abstractos en una clase abstracta,
	//Pero si es lo ideal, depende del diseño.
	public abstract void acelerar();

	public void desplazamiento(){
		kilometraje += 1;
	}

	public void frenar(){
		esta_moviendose = false;
	}
	public void arrancar(){
		esta_moviendose = true;
	}

	protected void setKilometraje(float kilometraje){
		this.kilometraje = kilometraje;
	}

	protected float getKilometraje(){
		return kilometraje;
	}
}