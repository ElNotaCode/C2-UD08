package ej2;

import java.util.Random;

//Autor Eloi Martorell Martin 13/04/2022

public class Password {
	
	private int longitud;
	private String contrase�a;
	
	//por defecto
	public Password() {
		
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		
		this.contrase�a = generarContrase�a(longitud);
		
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	String generarContrase�a(int longitud) { //default para que lo vea el package
		
		int numeroAleatorio[] = new int[longitud];
		String contrase�a = new String();
		Random r = new Random();
		
		for (int i = 0; i < longitud; i++) {
			numeroAleatorio[i] = r.nextInt(10);
			contrase�a += numeroAleatorio[i] + "";
		}
			
		return contrase�a;
		
	}

}
