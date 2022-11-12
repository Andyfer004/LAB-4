import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class radio implements modo_radio, modo_estado, modo_productividad, modo_reproduccion, modo_telefono, modo_volumen {
    private Double emisora;
    private String tipoEmisora;
    private String mood;
    private int volumen;
    private int posicion;
    private boolean conectar;
    private String audio;


    Scanner scan = new Scanner(System.in);
    public radio() {
        emisora = 94.5;
        tipoEmisora = "FM";
        mood = "Apagado";
        volumen = 5;
        posicion = 1;
        conectar = false;
        audio = "Speaker";
    }


    
    /** 
     * @param itson
     */
    /*
     * Modo estado
     */

    public void estado(Boolean itson){
        if(itson == false){
            mood = "Apagada";
        }
        else if(itson == true){
            mood = "Encendida";
        }
        System.out.println("La radio está " + mood + "\n"); 
    }

    
    /** 
     * @param flag
     */
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
        System.out.println("El nuevo volumen está en " + volumen);   
    }

    
    /** 
     * @param viaje
     * @return String
     */
    /*
     * Modo productividad
     */

    public String viajes(String viaje){
        Random numero = new Random();
        int distancia = numero.nextInt(100)+1; 
        int tiempo = numero.nextInt(10)+1;
        return "El destino será " + viaje + " el cual se encuentra a una distancia de " + distancia + " KM y  a un tiempo de "+tiempo + " horas \n";
    }


     
     /** 
      * @param estado
      */
     /*
     * Modo radio
     */

    public void cambiar(Boolean estado){
        if(estado == true){
            tipoEmisora = "FM";
            System.out.println("La emisora de radio está en " +tipoEmisora+  "\n");
        }
        else if(estado == false){
            tipoEmisora = "AM";
            System.out.println("La emisora de radio está en " +tipoEmisora+  "\n");
        }
    }


    
    /** 
     * @param flag
     */
    public void cambiar_e(Boolean flag){
        if(flag == true){
            emisora = emisora + 0.5;
            System.out.println("La emisora que está escuchando es " +emisora+  "\n");
        }
        else if(flag == false){
            emisora = emisora - 0.5;
            System.out.println("La emisora que está escuchando es " +emisora+  "\n");
        }          
    }


    
    /** 
     * @param listaEmisoras
     * @param emisora
     */
    public void guardar(ArrayList<Double> listaEmisoras, Double emisora){
        if(listaEmisoras.size() <= 50 ){
            listaEmisoras.add(emisora);
            System.out.println("La emisora " +emisora+" fue guardada" );
        }
        else {
            System.out.println("Error la lista esta llena");
        }
    }


    
    /** 
     * @param listaEmisoras
     */
    public void cargar(ArrayList<Double> listaEmisoras){
        System.out.println("Ingrese la emisora que desee");
                Double emisora_deseada = scan.nextDouble();
                scan.nextLine();
                System.out.println("Esta escuchando la emisora " + emisora_deseada + " en la emisora radial " + tipoEmisora);

    }


    
    /** 
     * @param lista
     */
    /*
     * Modo reproducción
     */
    public void seleccionar(ArrayList<cancion> lista){
        int orden =1;
        for (cancion i: lista) {
            System.out.println("-"+orden+". "+i.getNombre() +", artista: "+i.getAutor()+"("+i.getGenero()+")");
          }
    }

    
    /** 
     * @param flag
     * @param lista
     */
    public void cambiar_c(Boolean flag,ArrayList<cancion> lista){
        if (flag==true)
        {
            posicion++;
            if(posicion==lista.size()){
                posicion=0;
                System.out.println("Se seleccionó la canción " + lista.get(posicion).getNombre());
            }   
        }
        else
        {
            if (posicion==0){
                posicion=lista.size()-1;
                System.out.println("Se seleccionó la canción " + lista.get(posicion).getNombre());
            }
            else{
                posicion--;
                System.out.println("Se seleccionó la canción " + lista.get(posicion).getNombre());
            }
        }

    }

    
    /** 
     * @param lista
     */
    public void escuchar(ArrayList<cancion> lista){
        System.out.println("Reproduciendo "+lista.get(posicion).mostrar());
    }

    
    /** 
     * @param conexion
     */
    /*
     * Modo telefono
     */

    public void conexion(boolean conexion){
        String mensaje="";
        if (conexion == true)
        {
            mensaje="El telefono esta conectado";
        }
        else
        {
            mensaje="El telefono esta desconectado";
        }
        conectar = conexion;
        System.out.println(mensaje);

    }


    
    /** 
     * @param contactos
     */
    public void contactos(ArrayList<contacto> contactos){
        int orden =1;
        for (contacto i: contactos) {
            System.out.println(orden+". "+i.toString());
            orden++;
          }

    }


    
    /** 
     * @param contactos
     */
    public void llamar(ArrayList<contacto> contactos){
        int posicion = 1;
        for (contacto i: contactos) {
            System.out.println(posicion+". "+i.toString());
            posicion++;
        }
        System.out.println("Escoja un contacto a llamar");
        int op = scan.nextInt()-1;
        scan.nextLine();
        System.out.println("Llamando a "+contactos.get(op).getNombre()+ " al numero "+ contactos.get(op).getNumero());

    }
    
    public void finalizar(){
        System.out.println("La llamada se finalizó");
    }


    
    /** 
     * @param flag
     */
    public void audio(Boolean flag){
        if (flag == true)
        {
            audio ="Auriculares";
        }
        else
        {
            audio =" Speaker";
        }
        System.out.println("El sonido está en modo "+audio);  
    }
    public boolean get_conectar(){
        return true;
    }
    public String get_estado(){
        return "encendido";
    }

}
