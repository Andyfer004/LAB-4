import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class radio implements modo_radio, modo_estado, modo_productividad, modo_reproduccion, modo_telefono, modo_volumen {
    Scanner scan = new Scanner(System.in);
    private double emisora;
    private String tipoEmisora;
    private String mood;
    private int volumen;
    private boolean itson;
    private String estado;
    private ArrayList<Float> listaEmisoras;
    private ArrayList<cancion> canciones;
    private ArrayList<contacto> contactos;

    /*
     * Modo estado
     */

    public void estado(Boolean itson){
        if(itson == false){
            estado = "Apagado";
        }
        else if(itson == true){
            estado = "Encendido";
        }
    }

    /*
     * Modo volumen
     */

    public void volumen(Boolean flag){
        if(flag == true){
            volumen ++;
        }
        else if(flag == false){
            volumen --;
        }  
        System.out.println("El nuevo volumen es " + volumen);   
    }

    /*
     * Modo productividad
     */

    public String viajes(String viaje){
        Random numero = new Random();
        int distancia = numero.nextInt(100)+1; 
        int tiempo = numero.nextInt(10)+1;
        return "El destino será " + viaje + "el cual se encuentra a una distancia de " + distancia + "KM y  a un tiempo de "+tiempo + "horas";
    }


     /*
     * Modo radio
     */

    public void cambiar(Boolean estado){
        if(estado == true){
            tipoEmisora = "FM";
        }
        else if(estado == false){
            tipoEmisora = "AM";
        }
    }


    public void cambiar_e(Boolean flag){
        if(flag == true){
            emisora = emisora + 0.5;
        }
        else if(flag == false){
            emisora = emisora - 0.5;
        }          
    }


    public void guardar(ArrayList<Double> lista, Double emisora_number);
    public void cargar(ArrayList<Double> lista);
 
    
        boolean salir = false;
        while (salir == false){
            System.out.println("opcion 1: Siguiente emisora\n opcion 2: emisora anterior\n opcion 3: Guardar emisora\n opcion 4: cargar emisora\n 5:salir");
            int opcion = scan.nextInt();
            switch(opcion){

                case 1:
                    emisora = emisora + 0.5;
                case 2:
                    emisora = emisora - 0.5;
                case 3:
                    if(Lista_emisoras.size() <= 50 ){
                        Lista_emisoras.add(emisora);
                    }
                    else {
                        System.out.println("Error la lista esta llena");
                    }
                case 4:
                System.out.println("Ingrese la emisora que desee");
                float emisora_deseada = scan.nextFloat();
                emisora = emisora_deseada;
                case 5: 
                 salir = true;
            }
        }
    }

    public void modo_reproduccion(){

    }

    public void modo_telefono(){

    }

    

    public radio(){
        mood = "FM";
    }
}
