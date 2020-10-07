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
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Materia a= new Materia(1);
        Materia b= new Materia(2);
        Materia c= new Materia(3);
        
        Alumno uno= new Alumno(1001,"Lopez","Martin");
        Alumno dos= new Alumno(1002,"Martinez","Brenda");
        
        uno.agregarMateria(a);
        uno.agregarMateria(b);
        uno.agregarMateria(c);
        
        dos.agregarMateria(a);
        dos.agregarMateria(b);
        dos.agregarMateria(c);
        dos.agregarMateria(c);
        
        System.out.println(""+uno.getNombre()+" está inscripto en: "+uno.cantidadMaterias()+" materias.");
        System.out.println(""+dos.getNombre()+" está inscripto en: "+dos.cantidadMaterias()+" materias.");
        
        //Deje comentarios en la clase Alumno, metodo agregarMateria
    }
    
}
