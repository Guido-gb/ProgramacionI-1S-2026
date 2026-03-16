package arreglos;

public class Funciones {
	public static void imprimir(int[] a) {
		System.out.print("[ ");
		for(int x=0;x<a.length-1;x++) {
			System.out.print(a[x] + ", ");
		}
		System.out.println(a[a.length-1] + " ]");
	}
}
