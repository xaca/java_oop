public class Programa{
	public static void main(String[] args) {
		Elefante e;
		Animal a = new Elefante();
		Animal zoo[] = {new Elefante(),new Lagartija(),new Loro()};
		System.out.println(a.getNombre());
		//a.crearCriasAleatorias(); Tenemos un error porque Animal no tiene este método
		//System.out.println((Elefante)a.crearCriasAleatorias()); ¿Qué pasa con el casting explícito?
		e = ((Elefante)a);
		//((Elefante)a).crearCriasAleatorias();
		//((Elefante)a).imprimirNombreCrias();
		e.crearCriasAleatorias();
		e.imprimirNombreCrias();

		for(int i=0;i<zoo.length;i++){
			System.out.println(zoo[i].getNombre());
			//System.out.println(zoo[i].hacerRuido()); ¿Como hacemos para que cada animal exprese su ruido caracteristico?
		}

		((Loro)zoo[2]).hablar();
	}
}