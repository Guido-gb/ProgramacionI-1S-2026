package arreglos;

import java.util.Scanner;

public class Funciones {
	public static void imprimir(int[] a) {
		System.out.print("[ ");
		for(int x=0;x<a.length-1;x++) {
			System.out.print(a[x] + ", ");
		}
		System.out.println(a[a.length-1] + " ]");
	}
	
	/*
	 * Escribir la función public static int[] pedirArray(int n) que construye un array de longitud n, 
	 * solicitando al usuario el valor de cada una de las posiciones y devuelve el array construído.
	 */
	
	public static int[] pedirArray(int n) {
		int[] arreglo = new int[n];
		for(int x=0;x<arreglo.length;x++) {
			arreglo[x] = pedirEntero();
		}
		return arreglo;
	}
	
	public static int pedirEntero() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un entero");
		return lector.nextInt();
	}
	/*
	 * Escribir la función public static int[] rango(int m, int n) que recibe dos enteros m y n,
	 * y devuelve un array que contiene todos los números comprendidos en el intervalo [m, n] (inclusive).
	 * Probar la función con varios ejemplos.
	 */
	
	public static int[] rango(int m, int n) {
		int[] arreglo = new int[n-m+1];
		for(int y=0;y<arreglo.length;y++) {
			arreglo[y] = m + y;
		}
		return arreglo;
	}
	
	/*
	 * Implementar una función public static double promedio(int[] a) que dado un array de enteros,
	 * devuelva el promedio de los elementos del array.
	 */
	public static double promedio(int[] a) {
		double suma = 0;
		for(int p=0;p<a.length;p++) {
			suma += a[p];
		}
		return suma / a.length;
	}
	
	/*
	 * Implementar una función public static int max(int[] a),
	 * que dado un array de enteros desordenado devuelva el máximo elemento del array.
	 */
	
	public static int max(int[] a) {
		int max = a[0];
		for(int x=1; x<a.length;x++) {
			if(a[x] > max) {
				max = a[x];
			}
		}
		return max;
	}
	
	/*
	 * Implementar una función public static int[] reverso(int[] a),
	 * que dado un array de enteros devuelva un nuevo array con los elementos en orden inverso.
	 */
	
	public static int[] reverso(int[] a) {
		int[] b = new int[a.length];
		for(int y=0;y<b.length;y++) {
			b[y] = a[a.length-1-y];
		}
		return b;
	}
	
}
