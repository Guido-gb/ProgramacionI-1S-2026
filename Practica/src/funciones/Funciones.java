package funciones;

import java.util.Scanner;

public class Funciones {
	public static String pedirNombre() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombreUsuario = lector.nextLine();
		lector.close();
		return nombreUsuario;
	}
	
	/*
	 * Ejercicio 7
	 * Escribir un metodo static void imprimirPromedio(int a, int b) que imprima el promedio de los dos parametros.
	*/
	public static void imprimirPromedio(int a, int b) {
		System.out.println( (a+b) / 2.0);
	}
	
	/*
	 * Ejercicio 8
	 * Escribir un metodo static void ponerNota(double x, double y) que toma dos numeros decimales y los promedia.
	 * En caso que el promedio sea mayor o igual a 7, debera imprimir ‘‘Promocionado’’, 
	 * si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’ y si es menor
	 * que 4 imprime ‘‘Debe recuperar’’.
	 * Probarla llamandola desde el main con distintos numeros.
	 * Luego, pedirle ambos numeros al usuario (usando nextFloat() del Scanner) para pasarselos a ponerNota.
	 */
	public static void ponerNota1(double x, double y) {
		double notaFinal = (x+y) / 2;
		if(notaFinal >= 7) {
			System.out.println("Promocionado");
		}else if(notaFinal >=4){
			System.out.println("Aprobado");
		}else {
			System.out.println("Debe Recuperar");
		}
	}
	
	public static void ponerNota2(double x, double y) {
		double notaFinal = (x+y) / 2;
		if(notaFinal >= 7) {
			System.out.println("Promocionado");
			return;
		}
		
		if(notaFinal >=4){
			System.out.println("Aprobado");
			return;
		}
		
		System.out.println("Debe Recuperar");
	}
	
	/*
	 * Ejercicio 9
	 * Escribir un metodo static void imprimirFecha(int dia, int mes, int anio) que imprime la
	 * fecha pasada como parametro en formato del estilo “5 de Julio de 2030”.
	 */
	public static void imprimirFecha(int dia, int mes, int anio) {
		System.out.print(dia + " de ");
		if(mes == 1) {
			System.out.println("enero de " + anio);
			return;
		}
		if(mes == 2) {
			System.out.println("febrero de " + anio);
			return;
		}
		if(mes == 3) {
			System.out.println("marzo de " + anio);
			return;
		}
		if(mes == 4) {
			System.out.println("abril de " + anio);
			return;
		}
		if(mes == 5) {
			System.out.println("mayo de " + anio);
			return;
		}
	}	
}