package  co.edu.universidad.biblioteca;
import co.edu.universidad.biblioteca.excepciones.PrestamoException;
import co.edu.universidad.biblioteca.modelo.*;
import co.edu.universidad.biblioteca.servicio.*;


public class App{
	public static void main(String [] args){
		
	Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
		
	biblioteca.registrarUsuario("1001","Ana Torres");
	biblioteca.registrarUsuario("1002","Luis Perez");
		

	Material libro1 = new Libro("L-001", "Cien anios de soledad", 1967, "Gabriel García Márquez",400);
	Material libro2 = new Libro("L-002", "1984", 1949, "George Orwell",347);
	Material libro3 = new Libro("L-003", "Premonición", 2021, "Rosa Blasco",501);
	Material revista1 = new Revista("R-001", "National Geographic", 2023, "National Geographic Society");
	biblioteca.registrarMaterial(libro1);
	biblioteca.registrarMaterial(libro2);
	biblioteca.registrarMaterial(libro3);
	biblioteca.registrarMaterial(revista1);
	
	

	biblioteca.listarCatalogo();

	try {
    biblioteca.prestar("L-001", "1001");
	} catch (PrestamoException e) {
    System.out.println(e.getMessage());
	}
	try {
    biblioteca.prestar("L-02", "1001");
	} catch (PrestamoException e) {
    System.out.println(e.getMessage());
	}
	try {
    biblioteca.prestar("L-003", "1001");
	} catch (PrestamoException e) {
    System.out.println(e.getMessage());
	}

	biblioteca.listarDisponibles();
			
	}
	
	
}