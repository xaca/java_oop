import java.util.*;
import java.lang.*;
import java.io.*;

class Programa{
	public static void main(String[] args) {
		
		//Vehiculo v = new Vehiculo(); No es posible crear la instancia
		//Moto m = new Moto(); No se puede porque vehiculo y Moto son abstractos

		MotoElectrica me = new MotoElectrica();
		//Vehiculo generico = new Moto(); Moto es abstracta no se puede crear instancias
		Vehiculo generico = new MotoElectrica();
		//generico.estaCargada();
		((MotoElectrica)generico).estaCargada();

		/*
		¿Cómo podríamos incluir el concepto Bateria en este problema? 
		La Bicicleta, el carro y la moto tienen una bateria.
		*/
		ArrayList<Vehiculo> parqueadero = new ArrayList<Vehiculo>();
		parqueadero.add(new BicicletaRuta());
		parqueadero.add(new Carro());
		parqueadero.add(new BicicletaRuta());
		parqueadero.add(new Carro());
		parqueadero.add(new Carro());
		parqueadero.add(new Patineta());
		parqueadero.add(new Carro());
		parqueadero.add(new MotoElectrica());

		Collections.sort(parqueadero,new Ordenar());//Se ordena por kilometraje

		for (int i=0; i<parqueadero.size(); i++)
            System.out.println(parqueadero.get(i));
	}
}