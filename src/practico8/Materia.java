/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico8;

/**
 *
 * @author mgara
 */
public class Materia {
    private int idMateria;
    /*  1 - Ingles I
        2 - Matematica
        3 - Laboratorio
    
    */

    private String nombre;

    private int anio;

    public Materia(int idMateria) {
        this.idMateria = idMateria;
        switch(idMateria){
            case 1:{
                nombre= "Ingles I";
                anio=1;
                break;
            }
            case 2:{
                nombre= "Matematica";
                anio=1;
                break;
            }
            case 3:{
                nombre="Laboratorio";
                anio=1;
                break;
            }default:{
                nombre="Error";
                anio=0;
            }
        }
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
