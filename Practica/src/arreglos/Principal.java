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
		int[] b = {2,4,6,12,24,23,24,24,4,7,1,24,4,24,24,24,4,4,23,56,9};
		//Funciones.imprimir(b);
		//System.out.println("El maximo es " + Funciones.max(b));
		//int[] a = Funciones.reverso(b);
		Funciones.imprimir(b);
		/*
		System.out.println(Funciones.cantidadDeRepetidos(b));
		int[] nuevo = Funciones.sinRepetidos(b);
		Funciones.imprimir(nuevo);
		
		System.out.println(Funciones.cantidadDeRepetidos2(b));
		System.out.println(Funciones.cantidadDeRepetidos(b));
		int[] nuevo = Funciones.sinRepetidos2(b);
		Funciones.imprimir(nuevo);
		*/
		int indice = Funciones.maximoIndice(b);
		System.out.println("Tamaño " + b.length);
		System.out.println("Indice Maximo " + indice);
		System.out.println("Elmento con indice maximo " + b[indice]);
	}
}