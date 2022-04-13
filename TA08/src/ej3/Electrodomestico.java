package ej3;

//Autor Eloi Martorell Martin 13/04/2022

public class Electrodomestico {
	
	//precioBase color consumoEnergetico (A-F) peso
	//usaremos protected porque se pueden heredar
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//CONSTANTES
	protected double PRECIOBASE = 100;
	protected String COLOR = "Blanco";
	protected char CONSUMOENERGETICO  = 'F';
	protected double PESO = 5;
	
	//enums
	enum Consumo{A,B,C,D,F}
	
	enum Color{BLANCO,NEGRO,ROJO,AZUL,GRIS}
	
	//por defecto
	protected Electrodomestico() {
		this.precioBase = PRECIOBASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = PESO;
	}
	
	protected Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMOENERGETICO;
		this.peso = peso;
	}
	
	protected Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso +"]";
	}

	protected void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	protected void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
