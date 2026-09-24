package co.edu.universidad.biblioteca.modelo;

public class Material{

    public String tipo;
    private String titulo;
    private int anioPublicacion;
    private boolean prestado;



    public Material(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
         System.out.println("Tipo de material: "+ tipo);
        return super.toString();
    }

    

}
