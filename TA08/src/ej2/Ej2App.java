package ej2;

import java.util.Scanner;

//Autor Eloi Martorell Martin 13/04/2022

public class Ej2App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la longitud para tu nueva contraseña: ");
		int longitud = sc.nextInt();
		Password contraseña = new Password(longitud);
		System.out.println("Tu nueva contraseña es: " + contraseña.getContraseña() );
		
		contraseña.generarContraseña(3);
		
		sc.close();
	}

}
