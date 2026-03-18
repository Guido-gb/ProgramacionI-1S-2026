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
		lector.close();
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
	
	/*
	 * public static int[] agregarAtras(int[] a, int item)
	 * Devuelve un array que tiene los mismos elementos que el array recibido, 
	 * con el nuevo elemento item agregado al final.
	 */
	
	public static int[] agregarAtras(int[] a, int item) {
		int[] nuevo = new int[a.length + 1];
		for(int x = 0;x<a.length;x++) {
			nuevo[x] = a[x];
		}
		nuevo[a.length] = item;
		//nuevo[nuevo.length - 1] = item;
		return nuevo;
	}
	
	/*
	 * public static int[] quitar(int[] a, int i)
	 * Devuelve un array que tiene los mismos elementos que el array
	 * recibido, excepto el elemento que estaba en la posición i.
	 */
	
	public static int[] quitar(int[] a, int i) {
		int[] nuevo = new int[a.length-1];
		int z =0;
		for(int y =0; y<a.length;y++) {
			if(y != i-1) {
				nuevo[z] = a[y];
				z++;
			}
		}
		return nuevo;
	}
	
	/*
	 * public static int[] opuestos(int[] a)
	 * Devuelve un array con los elementos opuestos, e.g: si el valor es 2 devuelve -2.
	 */
	
	public static int[] opuestos(int[] a) {
		int[] nuevo = new int[a.length];
		for(int x=0;x<nuevo.length;x++) {
			nuevo[x] = - a[x];
		}
		return nuevo;
	}
	
	/*
	 * public static boolean sonTodosDivisoresDe(int[] a, int n)
	 * Devuelve true si todos los elementos del array recibido son divisores de n.
	 */
	
	public static boolean sonTodosDivisoresDe(int[] a, int n) {
		for(int x=0; x<a.length;x++) {
			if( n % a[x] != 0 ){
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Implementar la función public static int cantidadDeRepetidos(int[] a) que dado un array,
	 * devuelve la cantidad de elementos repetidos.
	 */
	
	public static int cantidadDeRepetidos(int[] a) {
		int cont=0;
		for(int y=0;y<a.length;y++) {
			if(cantRepeticion(a, a[y]) > 1) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int cantidadDeRepetidos2(int[] a) {
		int cont=0;
		for(int y=0;y<a.length;y++) {
			if(contarApartir(a, a[y], y+1) == 1) {
				cont++;
			}
		}
		return cont;
	}
	
	// cantidad de veces que b esta en el arreglo a
	public static int cantRepeticion(int[] a, int b) {
		int cont=0;
		for(int x=0;x<a.length;x++) {
			if(a[x]==b) {
				cont++;
			}
		}
		
		return cont;
	}
	
	/*
	 * Implementar la función public static int[] sinRepetidos(int[] a) que dado un array, 
	 * devuelve un nuevo array sin los elementos repetidos. Utilizar la función cantidadDeRepetidos()
	 * para saber la cantidad de elementos del nuevo array.
	 */
	
	public static int[] sinRepetidos(int[] a) {
		int[] nuevo = new int[a.length-cantidadDeRepetidos(a)];
		int z=0;
		for(int x=0;x<a.length;x++) {
			if(cantRepeticion(a, a[x]) == 1) {
				nuevo[z] = a[x];
				z++;
			}
		}
		return nuevo;
	}
	
	public static int[] sinRepetidos2(int[] a) {
		int[] nuevo = new int[a.length-cantidadDeRepetidos(a)+cantidadDeRepetidos2(a)];
		int z=0;
		for(int x=0;x<a.length;x++) {
			if(contarApartir(a, a[x], x) == 1) {
				nuevo[z] = a[x];
				z++;
			}
		}
		return nuevo;
	}
	
	
	public static int contarApartir(int[] a, int item, int pos) {
		if(pos>= a.length) {
			return 0;
		}
		int cont=0;
		for(int x=pos;x<a.length;x++) {
			if(a[x] == item) {
				cont++;
			}
		}
		return cont;
	}
	
	/*
	 * Ejercicio 26
	 * Escribir un metodo static int maximoIndice(int[] a) que dado un arreglo de enteros no vacıo,
	 * devuelve el ındice del valor mas alto que aparece.
	 */
	
	public static int maximoIndice(int[] a) {
		int indiceMax = 0;
		for(int x=0; x<a.length;x++) {
			if(a[x] > a[indiceMax]) {
				indiceMax = x;
			}
		}
		return indiceMax;
	}
	
}
