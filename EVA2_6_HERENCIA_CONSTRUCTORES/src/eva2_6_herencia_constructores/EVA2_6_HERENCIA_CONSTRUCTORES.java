/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_herencia_constructores;

/**
 *
 * @author victorgrc723
 */
public class EVA2_6_HERENCIA_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("CLASE ANIMAL");
        Animal animal = new Animal();
        animal.comer();
        animal.respirar();
        System.out.println("CLASE MAMIFERO");
        Mamifero mamifero = new Mamifero();

    }
    
}
