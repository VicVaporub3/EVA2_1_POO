/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_throw_exception;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_7_throw_exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        do{
            try{
                Prueba obj = new Prueba();
                Scanner scan = new Scanner(System.in);
                System.out.println("Ingresa un numero entero positivo: ");
                int valor = scan.nextInt();
                obj.setValor(valor);
                
                System.out.println("\nGRACIAS :)");
                break;
                
            } catch (Exception e){
                System.out.println(e.getLocalizedMessage());
            }
        }while(true);
    }
    
}
class Prueba{
    private int valor;
    public int getValor(){
        return valor;
        
    }
    public void setValor(int valor) throws Exception {
    if (valor < 0) {
        throw new RuntimeException("El valor " + valor + " es inválido. Debe ser mayor a cero.");
    }
    this.valor = valor;
}


}
