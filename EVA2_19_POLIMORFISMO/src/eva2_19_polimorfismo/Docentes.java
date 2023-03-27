package eva2_19_polimorfismo;
/**
 * @author Diego
 */
public class Docentes extends Persona{
    private String plaza;

    public Docentes() {
        super();
    }

    public Docentes(String plaza, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }
    
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    public void imprimir(){
        System.out.println(plaza);
    }

}
