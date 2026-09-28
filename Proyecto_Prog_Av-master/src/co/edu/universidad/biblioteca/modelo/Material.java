package co.edu.universidad.biblioteca.modelo;

public abstract class Material implements Prestable{

    private String titulo;
    private int anioPublicacion;
    private boolean prestado = false;
    private final String codigo;


    public Material(String codigo, String titulo, int anioPublicacion){
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    public abstract String getTipo();
    public abstract int diasMaximoPrestamo();


    public String getTitulo(){
        return titulo;
    }

    public int getAnioPublicacion(){
        return anioPublicacion;
    }

    public boolean getPrestado(){
        return this.prestado;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    @Override 
    public String toString(){
        String prestado = getPrestado() ? "Prestado" : "Disponible";
        return String.format("[%s] %-8s %-35s (%d) - %s",codigo,getTipo(),titulo,anioPublicacion,prestado);
    }

    @Override
    public void prestar(){
        this.prestado = true;
    }

    @Override
    public void devolver(){
        this.prestado = false;
    }

    @Override
    public boolean estaDisponible(){
        return !this.prestado;
    }
    
    
    
    

}
