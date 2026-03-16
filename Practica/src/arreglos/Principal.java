package arreglos;

public class Principal {

	public static void main(String[] args) {
		/*
		 * int[] arreglo;
		arreglo = new int[5];
		//System.out.println(arreglo[3]);
		for(int x=0;x<arreglo.length;x++) {
			arreglo[x] = 2*x;
		}
		//System.out.println(arreglo[3]);
		Funciones.imprimir(arreglo);
		//System.out.println(arreglo);
	
		int[] aux = new int[arreglo.length+1];
		for(int x=0;x<arreglo.length;x++) {
			aux[x] = arreglo[x]; 
		}
		Funciones.imprimir(aux);
		aux[aux.length-1] = 10;
		Funciones.imprimir(aux);
		arreglo = aux;
		Funciones.imprimir(arreglo);
		int[] a;
		a = Funciones.rango(10,20);
		Funciones.imprimir(a);
		System.out.println("El promedio es " + Funciones.promedio(a));
		*/
		int[] b = {1,567,123,07,212,4,7,123,567,243,56,24};
		//Funciones.imprimir(b);
		//System.out.println("El maximo es " + Funciones.max(b));
		int[] a = Funciones.reverso(b);
		Funciones.imprimir(a);
		Funciones.imprimir(b);
	}
}