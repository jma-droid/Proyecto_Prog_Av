package co.edu.universidad.biblioteca.servicio;

import co.edu.universidad.biblioteca.excepciones.PrestamoException;
import co.edu.universidad.biblioteca.modelo.*;
import java.util.HashMap;
import java.util.Map;


public class Biblioteca{

    public String nombre;
    public Map<String, Material> catalogo = new HashMap<>();
    public Map<String, Usuario> usuarios = new HashMap<>();


    public Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public void registrarUsuario(String documento, String nombre){
        usuarios.put(documento, new Usuario(documento, nombre));
    }

    public void registrarMaterial(Material material){
        catalogo.put(material.getCodigo(), material);
    }

    public void listarCatalogo(){
    System.out.println("==== CATALOGO INICIAL - " + nombre + " ====");
    if(catalogo.isEmpty()){
        System.out.println("No hay materiales");;
    }
    for(Material m : catalogo.values()){
        System.out.println(m.toString());
    }
    }

    public void listarDisponibles(){
        System.out.println("Materiales disponibles en la "+nombre);
        if(catalogo.isEmpty()){
            System.out.println("No hay materiales");;
        }
        for(Material m : catalogo.values()){
            if(!m.getPrestado()){
                System.out.println(m.toString());
            }
        }
    }

    public void prestar(String codigoMaterial, String documentoUsuario) throws PrestamoException{
        Material material = catalogo.get(codigoMaterial);
        Usuario usuario = usuarios.get(documentoUsuario);
        System.err.println("== PRESTAMOS ==");

        if(material == null){
            throw new PrestamoException("No existe el material con codigo: "+ codigoMaterial);
        }
        if(usuario == null){
            throw new PrestamoException("No existe el usuario con documento: "+ documentoUsuario);
        }
        if(material != null && usuario != null){
            material.prestar();
            usuario.agregarPrestamo(material);
            System.out.println("OK  ->"+documentoUsuario+" presto "+codigoMaterial);
        }
        }

    public void devolver(String codigoMaterial, String documentoUsuario){

        return;
    }

    private void buscarUsuario(){
        return;
    }

    private void buscarMaterial(){
        return;
    }

}


