public interface Mantenimiento{
	
	/*
	¿Qué es una interfaz?
	- Hay total abstracción
	- Puede tener métodos y variables
	- Métodos por defecto abstractos solo firma no cuerpo (No se requiere el uso de la palabra reservada abstract)
	- Define un set de métodos que la clase debe implementar
	- Si una clase implementa una interfaz y no realiza la implementación de los métodos debe ser marcada como abstract
	- Se puede implementar varias interfaces
    - Favorece el bajo acoplamiento
    - No puede ser instanciada
    - Una interfaz puede extender de otra interfaz
    - Miembros datos constantes marcados como public static final
	*/

    /* Las constantes no son de uso obligatorio por parte de las clases concretas
    que implementan la interfaz*/
	public static final float CAMBIO_LLANTAS_BICICLETA = 1000F;
	public static final float CAMBIO_LLANTAS_PATINETA = 100F;
	public static final float CAMBIO_LLANTAS_MOTO = 8000F;
	public static final float CAMBIO_LLANTAS_CARRO = 30000F;

	public void engrasarPartesMoviles();
	public void cambiarLlantas(float cantidad_kilometros);
	public boolean hayQueHacerMantenimiento();
	public void realizarMantenimiento();
}