public abstract class Vehiculo {
	private String nombre;
	private boolean esta_moviendose;
	protected int cambio_actual;
	private int numero_llantas;

	/*¿Por que una clase abstracta permite tener constructores?
	  Rta/. Se permiten tener constructores en una clase abstracta, porque pueden ser 
	  invocados por las clases hijas, lo ideal es marcarlos como protected, ya que
	  marcar el acceso publico no tendria aplicación.

	  Para invocar el metodo desde una clase hija se usa la palabra super, asi
	  super() -> Llama al constructor por defecto
	  super("Patineta") ->Llama al constructor que espera una cadena como parametro
	*/
	protected Vehiculo(){}
	protected Vehiculo(String nombre){
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