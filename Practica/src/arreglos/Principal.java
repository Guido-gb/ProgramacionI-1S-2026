package arreglos;

public class Principal {

	public static void main(String[] args) {
		int[] arreglo;
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
	}
}