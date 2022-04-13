package ej3;

import java.util.Scanner;

import ej3.Electrodomestico.Color;
import ej3.Electrodomestico.Consumo;

public class Ej3App {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico nevera = new Electrodomestico();
		System.out.println(nevera);
		Electrodomestico ventilador = new Electrodomestico(2.0,2.0);
		System.out.println(ventilador);
		
		System.out.println();
		
		System.out.println("Precio base del electrodomestico?");
		nevera.setPrecioBase(sc.nextDouble());
		colorPicker(nevera);
		System.out.println("Peso del electrodomestico?");
		nevera.setPeso(sc.nextDouble());
		energiaPicker(nevera);
		
		System.out.println(nevera);
		
		sc.close();
	}
	
	public static void colorPicker(Electrodomestico electrodomestico) {
		boolean check = false;
		do {
		System.out.println("Color del electrodomestico?");
		for(Color myVar: Color.values()) {
			System.out.print(myVar + " ");
		}
		String color = new String(sc.next());
		color = color.toUpperCase();
		//Color{BLANCO,NEGRO,ROJO,AZUL,GRIS}
		switch (color) {
			case "BLANCO":
				electrodomestico.setColor(color);
				check = true;
				break;
			case "NEGRO":
				electrodomestico.setColor(color);
				check = true;
				break;
			case "ROJO":
				electrodomestico.setColor(color);
				check = true;
				break;
			case "AZUL":
				electrodomestico.setColor(color);
				check = true;
				break;
			case "GRIS":
				electrodomestico.setColor(color);
				check = true;
				break;
		default:
			System.out.println("Color no encontrado.");
			break;
		}

		}while(!check);
	}

	public static void energiaPicker(Electrodomestico electrodomestico) {
		boolean check = false;
		do {
		System.out.println("Color del electrodomestico?");
		for(Consumo myVar: Consumo.values()) {
			System.out.print(myVar + " ");
		}
		String consumo = new String(sc.next());
		consumo = consumo.toUpperCase();
		char consumoChar = consumo.charAt(0);
		//Color{BLANCO,NEGRO,ROJO,AZUL,GRIS}
		switch (consumoChar) {
			case 'A':
				electrodomestico.setConsumoEnergetico(consumoChar);
				check = true;
				break;
			case 'B':
				electrodomestico.setConsumoEnergetico(consumoChar);
				check = true;
				break;
			case 'C':
				electrodomestico.setConsumoEnergetico(consumoChar);
				check = true;
				break;
			case 'D':
				electrodomestico.setConsumoEnergetico(consumoChar);
				check = true;
				break;
			case 'E':
				electrodomestico.setConsumoEnergetico(consumoChar);
				check = true;
				break;
			case 'F':
				electrodomestico.setConsumoEnergetico(consumoChar);
				check = true;
				break;
		default:
			System.out.println("Calificación no encontrada.");
			break;
		}

		}while(!check);
	}
	
}