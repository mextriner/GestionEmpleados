/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona{
    String numSegSocial;
    float salario;

    public Empleado(String numSegSocial, float salario, String nombre, String apellido) {
        super(nombre, apellido);
        this.numSegSocial = numSegSocial;
        this.salario = salario;
    }


    public String getNumSegSocial() {
        return numSegSocial;
    }

    public void setNumSegSocial(String numSegSocial) {
        this.numSegSocial = numSegSocial;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
