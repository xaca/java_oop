class Excepciones
{
	//http://www.geeksforgeeks.org/g-fact-32-user-defined-custom-exception-in-java/
	//http://www.geeksforgeeks.org/exceptions-in-java/

	/*
	https://www.javatpoint.com/exception-handling-in-java
	
	Ejercicio, teniendo en cuenta el arbol de herencia de las excepciones, realizar un programa que 
	capture diferentes tipos de excepciones. Vaya de lo general a lo particular

	¿Es posible realizar un try-catch dentro de un catch, es decir un try-catch anidado?
	*/
	public static void noHaverNada()throws OtraExcepcion{
		throw new OtraExcepcion();
	}

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();//null;
		int x[] = new int[3];
		try{
			/*str.append("Hola Mundo");
			noHaverNada();
			throw new MiExcepcion();*/
			str = null;
			str.append("Hola Mundo");
		}
		catch(NullPointerException e1){
			//Se debe tener precaución con el nombre de la variable e1, debe ser diferente dentro de este contexto
			System.out.println("NullPointer "+e1);
			System.out.println("Pueden haber varios, se va por el mas especifico");
			try{
				System.out.println(3/0);
			}
			catch(ArithmeticException e2){
				try{
					x[6] = 5;					
				}
				catch(ArrayIndexOutOfBoundsException e3)
				{
					System.out.println("Podemos seguir atrapando otras excepciones");
				}
			}
			
		}
		/*catch(OtraExcepcion e){
			System.out.println("OtraExcepcion "+e);
		}
		catch(MiExcepcion e){
			System.out.println("MiExcepcion "+e);
		}*/
		catch(Exception e){
			System.out.println("Exception "+e);
		}
		finally{
			System.out.println("Siempre se ejecuta, solo se pone uno");
		}

	}

}