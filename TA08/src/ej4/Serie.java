package ej4;

public class Serie {

	String titulo;
	int numeroTemporadas;
	boolean entregado;
	String genero;
	String creador;
	
	int NUMEROTEMPORADAS = 3;
	boolean ENTEREGADO = false;
	
	protected Serie() {
		this.titulo = "";
		this.numeroTemporadas = NUMEROTEMPORADAS;
		this.entregado = ENTEREGADO;
		this.genero = "";
		this.creador = "";
	}
	
	protected Serie(String titulo, String creador) {
		this.titulo = "";
		this.numeroTemporadas = NUMEROTEMPORADAS;
		this.entregado = ENTEREGADO;
		this.genero = "";
		this.creador = creador;
	}
	
	protected Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.entregado = ENTEREGADO;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	
}
