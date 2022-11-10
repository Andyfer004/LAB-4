
/*
 * @author Sharis Barrios 
 * @author Andy Fuentes
 * @author David Trujillo
 * @date 8- 11 - 2022
 * Interfaz para la preproducción de música
 */
import java.util.ArrayList;

public interface modo_reproduccion {
    
    public void seleccionar(ArrayList<cancion> lista);
    public void cambiar_c(Boolean flag,ArrayList<cancion> lista);
    public void escuchar(ArrayList<cancion> lista);
   
}
