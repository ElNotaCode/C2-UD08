package ej2;

import java.util.Random;

//Autor Eloi Martorell Martin 13/04/2022

public class Password {
	
	private int longitud;
	private String contraseña;
	
	//por defecto
	public Password() {
		
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		
		this.contraseña = generarContraseña(longitud);
		
	}

	public String getContraseña() {
		return contraseña;
	}
	
	String generarContraseña(int longitud) { //default para que lo vea el package
		
		int numeroAleatorio[] = new int[longitud];
		String contraseña = new String();
		Random r = new Random();
		
		for (int i = 0; i < longitud; i++) {
			numeroAleatorio[i] = r.nextInt(10);
			contraseña += numeroAleatorio[i] + "";
		}
			
		return contraseña;
		
	}

}
