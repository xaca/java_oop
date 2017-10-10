class Sesion{
	
	private static Sesion referencia;
	private String usuario;
	private long tiempo_vida;
	private boolean activo;
	//private boolean activa = true; No hace esto, solo es valido con constantes

	private Sesion(){
		
	}

	public static Sesion getInstance(){
		if(referencia == null)
		{
			referencia = new Sesion();
		}
		return referencia;
	}

	/*
	private Sesion(){
		activo = true;
	}

	public Sesion(String usuario, long tiempo_vida)
	{
		this.usuario = usuario;
		this.tiempo_vida = tiempo_vida;
		imprimirValoresPorDefecto();
	}

	public Sesion(long tiempo_vida)
	{
		
	}*/

	public void imprimirValoresPorDefecto(){
		System.out.println("usuario "+usuario);
		System.out.println("tiempo_vida "+tiempo_vida);
		System.out.println("activo "+activo);
	}
}