/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico8;

import java.util.HashSet;

/**
 *
 * @author mgara
 */
public class Alumno {
    HashSet materias= new HashSet();
    
    private int legajo;

    private String apellido;

    private String nombre;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   

    public void agregarMateria(Materia materia) {
        /*Esto es lo que haria si quisiera que la materia no se repita en la lista, pero como
        use HashSet no es necesario ya que no permite elementos repetidos.
        Modifique el constructor para que no haya errores cuando ingreso por ejemplo el nombre de la materia
        solo ingreso el id y con eso se asignan los valores correspondientes.(Todo para que no haya ninguna chance de tener
        elementos repetidos)
        */
        
        
        /*if(materias.contains(materia)){
            System.out.println("No se pudo agregar la materia "+materia.getNombre()+" porque ya se encuentra en la lista de "+apellido+".");
        }else{
            materias.add(materia);
            System.out.println("Se agrego la materia "+materia.getNombre()+" a la lista de materias de "+apellido+" correctamente.");
        }*/
        
        
         materias.add(materia);
    }

    public int cantidadMaterias() {
        return materias.size();
    }
}
