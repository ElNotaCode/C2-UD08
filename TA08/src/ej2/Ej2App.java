package ej2;

import java.util.Scanner;

public class Ej2App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud para tu nueva contrase�a: ");
		int longitud = sc.nextInt();
		Password contrase�a = new Password(longitud);
		System.out.println("Tu nueva contrase�a es: " + contrase�a.getContrase�a() );
		
		contrase�a.generarContrase�a(3);
		
		sc.close();
	}

}
