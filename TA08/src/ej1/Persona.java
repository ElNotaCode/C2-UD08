package ej1;

public class Persona {
	
	//no queremos que se acceda directamente a ellos por lo que private
	//nos garantiza que solo se podrá acceder desde la clase
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	private char SEXO = 'H';
	
	//constructor por defecto
	public Persona() {
		this.dni = "";
		this.sexo = SEXO;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + ", SEXO=" + SEXO + ", toString()=" + super.toString() + "]";
	}
	
}
