public class Programa{
	public static void main(String[] args) {
		Elefante e;
		Animal a = new Elefante();
		Animal zoo[] = {new Elefante(),new Perro(),new Lagartija(),new Loro(),new Gato()};
		System.out.println(a.getNombre());
		//a.crearCriasAleatorias(); Tenemos un error porque Animal no tiene este método
		//System.out.println((Elefante)a.crearCriasAleatorias()); ¿Qué pasa con el casting explícito?
		e = ((Elefante)a);
		//((Elefante)a).crearCriasAleatorias();
		//((Elefante)a).imprimirNombreCrias();
		e.crearCriasAleatorias();
		e.imprimirNombreCrias();

		for(int i=0;i<zoo.length;i++){
			System.out.print("Animal :");
			System.out.println(zoo[i].getNombre());
			zoo[i].hacerRuido();//R.Sobreescribiendo el método
		}

		((Loro)zoo[2]).hacerRuido("Nueva palabra");//Sobrecarga del método		

		//((Loro)zoo[2]).hablar(); Ya no es necesario invocar el metodo por separado
	}
}