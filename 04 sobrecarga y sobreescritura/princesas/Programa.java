class Programa {

	public static void main(String[] args) {
		
		/*
		Primera opción de creación de una princesa
		Princesa princesa = new Pocahontas();
		Principe principe = new Principe("Jhon Smith");
		princesa.setPrincipe(principe);*/

		Princesa temporal;
		Princesa princesas[] = new Princesa[3];
		Cenicienta cenicienta = new Cenicienta();
		cenicienta.setPrincipe(new Principe("Enrique"));

		BlancaNieves blanca_nieves = new BlancaNieves();
		blanca_nieves.setPrincipe(new Principe("Florian"));

		Pocahontas pocahontas = new Pocahontas();
		pocahontas.setPrincipe(new Principe("Jhon Smith"));

		princesas[0] = cenicienta;
		princesas[1] = blanca_nieves;
		princesas[2] = pocahontas;

		for (int i=0;i<princesas.length ;i++ ) {
			//(princesas[i].getPrincipe()).getNombre(); No se recomienda por un posible error en tiempo de ejecución
			temporal = princesas[i];

			if(temporal!=null)
			{
				if(temporal.getPrincipe()!=null)
				{
					//Acá ya sabemos que no hay error, porque las instancias
					//existen y estan asignadas a princesa
					System.out.println(temporal.getPrincipe().getNombre());
				}
			}
		}

	}
	
}