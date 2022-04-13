package ej2;

import java.util.Random;

public class Password {
	
	private int logitud;
	private String contrase�a;
	
	public Password() {
		
		this.logitud = 0;
		String contrase�aGenerada = new String(generarContrase�a(logitud));
		this.contrase�a = contrase�aGenerada;
	}
	
	public Password(int longitud) {
		
		this.logitud = longitud;
		
		this.contrase�a = generarContrase�a(longitud);
		
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	public String generarContrase�a(int longitud) {
		
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
