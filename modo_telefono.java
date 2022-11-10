
/*
 * @author Sharis Barrios 
 * @author Andy Fuentes
 * @author David Trujillo
 * @date 8- 11 - 2022
 * Interfaz para el modo teléfono 
 */
import java.util.ArrayList;

public interface modo_telefono {
    
    public void conexion(boolean conection);
    public void contactos(ArrayList<contacto> lista);
    public void llamar(ArrayList<contacto> lista);
    public void finalizar();
    public void audio(Boolean flag);

}
