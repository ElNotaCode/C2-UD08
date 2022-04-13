package ej2;

import java.util.Random;

public class Password {
	
	private int logitud;
	private String contraseña;
	
	public Password() {
		
		this.logitud = 0;
		String contraseñaGenerada = new String(generarContraseña(logitud));
		this.contraseña = contraseñaGenerada;
	}
	
	public Password(int longitud) {
		
		this.logitud = longitud;
		
		this.contraseña = generarContraseña(longitud);
		
	}

	public String getContraseña() {
		return contraseña;
	}
	
	public String generarContraseña(int longitud) {
		
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
