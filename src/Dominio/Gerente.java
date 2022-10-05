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
public class Gerente extends Empleado{
    String departamento;
    String estudios;

    public Gerente(String departamento, String estudios, String numSegSocial, float salario, String nombre, String apellido) {
        super(numSegSocial, salario, nombre, apellido);
        this.departamento = departamento;
        this.estudios = estudios;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    
    
}
