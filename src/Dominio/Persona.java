/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;
import Principal.GestionEmpleados;

/**
 *
 * @author Alumno Mañana
 */
public class Persona {
    String nombre, apellido;
    int id;

    
    public Persona() {
        GestionEmpleados.contador++;
        id = GestionEmpleados.contador;
    } 
    
    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    @Override
    public String toString() {
        return "Id: "+ id + "; Nombre=" + nombre + "; Apellido=" + apellido ;
        
    }
 
    
    
}
