class Programa{
	public static void main(String[] args) {
		
		//Vehiculo v = new Vehiculo(); No es posible crear la instancia
		//Moto m = new Moto(); No se puede porque vehiculo y Moto son abstractos

		MotoElectrica me = new MotoElectrica();
		//Vehiculo generico = new Moto(); Moto es abstracta no se puede crear instancias
		Vehiculo generico = new MotoElectrica();
		//generico.estaCargada();
		((MotoElectrica)generico).estaCargada();

		Vehiculo parqueadero [] = {new MotoElectrica(), new BicicletaRuta(), new Carro() };
	}
}