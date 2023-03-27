/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_19_polimorfismo;

/**
 *
 * @author invitado
 */
public class EVA2_19_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Docentes docentes = new Docentes("Tiempo copmleto", "Kanye", "West", 45);
        //docentes.imprimirDatos();
        Estudiante estudiante = new Estudiante("22550290", "Jhon", "Hill", 30);
        //estudiante.imprimirDatos();
        //EN RESUMEN, ESTO ES POLIMORFISMO:
        Persona persona = docentes;
        persona.imprimirDatos();
        Persona persona2 = estudiante;
        persona2.imprimirDatos();
        //AHORA AL REVES
        //NO SE PUEDE HACER CONVERSION DE SUPER CLASE A SUBCLASE
        //EN ESTE CASO NO EXIXSTE LA PLAZA 
        Persona perso = new Persona();
        Docentes doce = perso;
    }
    
}
