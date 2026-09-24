package co.edu.universidad.biblioteca.modelo;

public class Revista{
	
	private String numeroEdicion;
	
	public int diasMaximoPrestamo(){
		return 5;
	}
	
	public String getTipo(){
		String tipo = "Revista";
		return tipo;
	}
	
	@Override
	public String toString(){
		 System.out.println("Tipo de material: "+ tipo);
        return super.toString();
	}
}