class Excepciones
{
	//http://www.geeksforgeeks.org/g-fact-32-user-defined-custom-exception-in-java/
	//http://www.geeksforgeeks.org/exceptions-in-java/

	/*
	https://www.javatpoint.com/exception-handling-in-java
	
	Ejercicio, teniendo en cuenta el arbol de herencia de las excepciones, realizar un programa que 
	capture diferentes tipos de excepciones. Vaya de lo general a lo particular
	*/
	public static void noHaverNada()throws OtraExcepcion{
		throw new OtraExcepcion();
	}

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();//null;
		try{
			str.append("Hola Mundo");
			noHaverNada();
			throw new MiExcepcion();
		}
		catch(NullPointerException e){
			System.out.println("NullPointer "+e);
			System.out.println("Pueden haber varios, se va por el mas especifico");
		}
		catch(OtraExcepcion e){
			System.out.println("OtraExcepcion "+e);
		}
		catch(MiExcepcion e){
			System.out.println("MiExcepcion "+e);
		}
		catch(Exception e){
			System.out.println("Exception "+e);
		}
		finally{
			System.out.println("Siempre se ejecuta, solo se pone uno");
		}

	}

}