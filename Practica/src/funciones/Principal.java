package funciones;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nombre = pedirNombre();
		System.out.println("Hola " + nombre);

	}
	
	public static String pedirNombre() {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		String nombreUsuario = lector.nextLine();
		return nombreUsuario;
	}
	

}
