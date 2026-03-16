package cadenas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*String fruta,palabra;
		fruta = "banana";
		palabra = "banana";
		int num = 10;
		System.out.println(fruta.toLowerCase());
		System.out.println(fruta);
		System.out.println(palabra);
		System.out.println(fruta.toUpperCase().equals(palabra.toUpperCase()));
		System.out.println(fruta.toUpperCase() == palabra.toUpperCase());
		System.out.println(fruta.contains("ana"));
		System.out.println(fruta.length());
		*/
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese una palabra: ");
		String palabra = lector.next();
		for(int x=0; x<palabra.length();x++) {
			System.out.println(palabra.charAt(x));
		}
		lector.close();
	}

}
