package cadenas;

import java.util.Scanner;

public class Funciones {
	
	public static String leerPalabra() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese una palabra");
		return lector.next();
	}
	
	
	public static char leerChar() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese una letra");
		return lector.nextLine().charAt(0);
	}
}