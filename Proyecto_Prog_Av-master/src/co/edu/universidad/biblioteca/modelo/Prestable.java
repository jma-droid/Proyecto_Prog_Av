package co.edu.universidad.biblioteca.modelo;

/**
*Contrato que cumple todo material que puede prestarse
*Una interfaz define QUE se puede hacer, no COMO se hace
*/

public interface Prestable{
	
	
	void prestar();
	
	
	void devolver();
	
	
	boolean estaDisponible();
	
	
	int diasMaximoPrestamo();
	
}