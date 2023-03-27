package eva2_19_polimorfismo;

/**
 * @author Diego
 */


        //CLASE DERIVADA extends CLASE BASE
        //CLASE HIJO extends CLASE PADRE
        //SUBCLASE extends SUPERCLASE
public class Estudiante extends Persona{
    public String noControl;

    public Estudiante() {
        super(); //Llamada a la superClase
        this.noControl = "----";
    }

    public Estudiante(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

}
