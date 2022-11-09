
/*
 * @author Sharis Barrios 
 * @author Andy Fuentes
 * @author David Trujillo
 * @date 8- 11 - 2022
 * Interfaz para productividad (planificación de viajes)
 */

public interface productividad {
    
    public String viajar(String lugar){    
        return "Su destino es " + lugar + ", el viaje sera de " + (int)(Math.random() * (35-1) + 1) + "km y tomara " + (int)(Math.random() * (200-20) + 20) + " minutos";
    }
}