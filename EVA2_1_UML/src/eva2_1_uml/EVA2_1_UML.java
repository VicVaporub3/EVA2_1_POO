/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_uml;

/**
 *
 * @author victorgrc723
 */
public class EVA2_1_UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Persona");
        MisClases Perso1 = new MisClases();
        Perso1.setId("22550290");
        Perso1.setNombre("Victor Granados");
        Perso1.setEdad(19);
        System.out.println("Id alumno: " + Perso1.id + "\n" + "Nombre: " + Perso1.nombre + "\n" + "Edad: " + Perso1.edad);
        
        System.out.println("Television");
        Television Tele1 = new Television();
        Tele1.setCanal(7);
        Tele1.setVolumen(55);
        Tele1.setPower("Encendida");
        System.out.println("Canal: " + Tele1.canal + "\n" + "Volumen: " + Tele1.volumen + "\n" + "Power: " + Tele1.power);
        
        System.out.println("Automovil");
        Automovil Auto1 = new Automovil();
        Auto1.setMarca("Nissan");
        Auto1.setModelo(2002);
        Auto1.setAnio(2002);
        System.out.println("Marca: " + Auto1.marca + "\n" + "Modelo: " + Auto1.modelo + "\n" + "Anio: " + Auto1.anio);
    }
    
}
