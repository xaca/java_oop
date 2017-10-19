class BlancaNieves{

	public Enano[] enanos; 

	public BlancaNieves(){
		enanos = new Enano[7];
	}
	
	public BlancaNieves(int numero_enanos){
		
		if(numero_enanos>1)
		{
			enanos = new Enano[numero_enanos];
		}
	}

	/*
	¿Qué pasa si hay varias princesas que hablan con animales, pero no
	son todas? ¿Cómo se debe diseñar esta situación dentro de la clase?
	*/
	public void hablarConAnimales(){

	}
}