package co.edu.universidad.biblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario{

	public static final int MAX_PRESTAMOS = 3;
	private String documento;
	private String nombre;
	List<Material> prestamos = new ArrayList<>();

	public Usuario(String documento, String nombre) {
		this.documento = documento;
		this.nombre = nombre;
	}
	
	public String getDocumento() {
		return documento;

	} public String getNombre() {
		return nombre;
	}

	public void puedePrestarMas(){
		
		return;
	}
	
	public void agregarPrestamo(Material material){
		
		return;
	}
	
	public boolean  quitarPrestamo(){
		
		
		return true;
	}

	public void getPrestamos(){
		System.out.println(prestamos.toString());
		return;
	}

	@Override
	public String toString(){
		return String.format("%-15s (%-4s) - Prestamos: %d / %d",nombre,documento,prestamos.size(),MAX_PRESTAMOS);
	}
	
	
	
	
}