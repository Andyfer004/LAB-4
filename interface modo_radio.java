/*
 * @author Sharis Barrios 
 * @author Andy Fuentes
 * @author David Trujillo
 * @date 8- 11 - 2022
 * Interfaz para el modo radio 
 */
 
public interface modo_radio {

    public boolean cambiar();
    public boolean cambiar_e();
    public ArrayList<Float> guardar();
    public int cargar();

}
