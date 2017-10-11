public class Programa{
	public static void main(String[] args) {
		Animal a = new Elefante();
		Animal zoo[] = {new Elefante(),new Lagartija()};
		System.out.println(a.getNombre());
		//a.crearCriasAleatorias(); Tenemos un error porque Animal no tiene este método
		//System.out.println((Elefante)a.getNombre()); ¿Qué pasa con el casting explícito?
		((Elefante)a).crearCriasAleatorias();
		((Elefante)a).imprimirNombreCrias();

		for(int i=0;i<zoo.length;i++){
			System.out.println(zoo[i].getNombre());
		}
	}
}