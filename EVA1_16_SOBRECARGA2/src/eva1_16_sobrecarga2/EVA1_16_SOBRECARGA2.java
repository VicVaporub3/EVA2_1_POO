/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_sobrecarga2;

/**
 *
 * @author invitado
 */
public class EVA1_16_SOBRECARGA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("suma: "+ suma (4,9));
    }
    public static int suma(int val1, int val2){
        return val1 + val2; 
    }

        public static double suma(int val1, double val2){
        return val1 + val2; 
       
   }
 
        public static String suma(int val1,  String val2 ) {
        return val1 + val2;
             
        }
         
                }
