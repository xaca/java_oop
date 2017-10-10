public class Programa{
	public static void main(String[] args) {

		Sesion s;

		//s = new Sesion("user123",3500);
		//s = new Sesion();

		s = Sesion.getInstance();

		System.out.println(s);
		System.out.println(Sesion.getInstance());
		new Elefante("Dumbo");
		Elefante grupo[] = {new Elefante("Dumbo"),new Elefante(3),new Elefante()};
		grupo[0].getNombre();


		String msg = "0";

		for (int i=0;i<2000 ;i++ ) {
			msg+= ""+i;
		}
		System.out.println(msg);

		StringBuilder msg_opt = new StringBuilder();
		for (int i=0;i<2000 ;i++ ) {
			msg_opt.append(i);
		}
		System.out.println(msg_opt.toString());
		/*
		//singleton, this
		Elefante []elefantes;//Declaración
		Elefante generico = new Elefante();
		Elefante generico2 = new Elefante();
		Elefante generico3 = new Elefante();

		//System.out.println(generico.getNombre());
		generico.setNombre("Dumbo");
		generico2.setNombre("Cria 2");
		generico3.setNombre("Cria 3");
		//System.out.println(generico.nombre_pila);//Acceso privado

		//System.out.println(elefantes[0]);
		elefantes = new Elefante[3];//Inicialización Arreglo
		elefantes[0] = new Elefante();//Inicialización de cada componente
		//elefantes[1] = new Elefante();//Inicialización de cada componente
		elefantes[2] = new Elefante();//Inicialización de cada componente
		//System.out.println(elefantes);

		elefantes[0].setNombre("Elefante 1");
		//elefantes[1].setNombre("Elefante 2");
		elefantes[2].setNombre("Elefante 3");


		elefantes[0].setElefante(0,generico);
		elefantes[0].setElefante(1,generico2);
		elefantes[0].setElefante(2,generico3);
		elefantes[0].setElefante(7,new Elefante());

		elefantes[2].crearCriasAleatorias();

		System.out.println("---------Crias----------");
		for(int i=0;i<elefantes.length;i++){
			//System.out.println(elefantes[i]);
			//System.out.println(elefantes[i].getNombre());//
			if(elefantes[i]!=null)
			{
				System.out.println(elefantes[i].getNombre());
				elefantes[i].imprimirNombreCrias();
				//System.out.println(elefantes[i].getElefantes());
				System.out.println("-------------------------");
			}
		}
		*/
	}
}