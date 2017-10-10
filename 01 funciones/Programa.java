import java.util.*;

public class Programa{

	public static void prueba(){
		System.out.println("Prueba sin retorno");
	}


	public static int prueba2(){
		return 3;
	}

	public static void prueba3(int a){
		System.out.println("Recibi el parametro "+a);
	}

	public static double prueba4(int a){
		return a*2;
	}

	public static void imprimirArreglo(int[] arreglo){
		System.out.println(Arrays.toString(arreglo));
	}

	public static void cambiarValores(int[] arreglo){
		for(int i=0;i<arreglo.length;i++){
			arreglo[i] = 0;
		}
	}
	public static void main(String[] args) {
		
		int salida;
		int []arreglo = {2,3,4,5,6,7,8,8,9,0};
		prueba();
		//salida = prueba3(2); Error, porque prueba 3 no retorna
		salida = prueba2();
		System.out.println("El valor numerico es "+salida);
		System.out.println("Se envia el dato "+salida);
		System.out.println("Se envia el dato "+salida+" "+prueba4(salida));

		imprimirArreglo(arreglo);
		cambiarValores(arreglo);
		imprimirArreglo(arreglo);

	}

}