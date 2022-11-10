/*
 * @author Sharis Barrios 
 * @author Andy Fuentes
 * @author David Trujillo
 * @date 9- 11 - 2022
 * Clase para crear objetos tipo contactos
 */

public class contacto {
    private String nombre; 
    private String numero; 
    

    public contacto() {
        this.nombre = "";
        this.numero = "";
    }

    public contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getNumero() {
        return this.numero;
    }

    
    /** 
     * @param numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }


   
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "\n" +
            " Numero='" + getNumero() + "\n" ;
    }
    
}
