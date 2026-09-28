package co.edu.universidad.biblioteca.modelo;

public class Revista extends Material{
	
	private String numeroEdicion;

	public Revista(String codigo, String titulo, int anioPublicacion, String numeroEdicion) {
		super(codigo, titulo, anioPublicacion);
		this.numeroEdicion = numeroEdicion;
	}
	
	@Override 
	public int diasMaximoPrestamo(){
		return 5;
	}
	
	public String getTipo(){
		return "Revista";
	}
	
	@Override 
	public String toString(){
		return String.format(super.toString()+"| Edicion No.: "+ numeroEdicion);
	}
	

	
}