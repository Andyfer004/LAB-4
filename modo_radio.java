/*
 * @author Sharis Barrios 
 * @author Andy Fuentes
 * @author David Trujillo
 * @date 8- 11 - 2022
 * Interfaz para el modo radio 
 */
import java.util.ArrayList; 

public interface modo_radio {

    public void cambiar(Boolean estado);
    public void cambiar_e(Boolean estado);
    public void guardar(ArrayList<Double> lista, Double emisora_number);
    public void cargar(ArrayList<Double> lista);

}
