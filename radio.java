import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class radio implements modo_radio, modo_estado, modo_productividad, modo_reproduccion, modo_telefono, modo_volumen {
    Scanner scan = new Scanner(System.in);
    private Double emisora;
    private String tipoEmisora;
    private String mood;
    private int volumen;
    private int posicion;
    private boolean conectar;
    private String audio;
    private ArrayList<Double> listaEmisoras;
    private ArrayList<contacto> contactos;



    public radio() {
        emisora = 87.5;
        tipoEmisora = "FM";
        mood = "Apagado";
        volumen = 5;
        posicion = 1;
        conectar = false;
        audio = "Speaker";
        listaEmisoras = new ArrayList<Double>();
        contactos = new ArrayList<contacto>();
    }


    /*
     * Modo estado
     */

    public void estado(Boolean itson){
        if(itson == false){
            mood = "Apagado";
        }
        else if(itson == true){
            mood = "Encendido";
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


    public void guardar(ArrayList<Double> listaEmisoras, Double emisora){
        if(listaEmisoras.size() <= 50 ){
            listaEmisoras.add(emisora);
        }
        else {
            System.out.println("Error la lista esta llena");
        }
    }


    public void cargar(ArrayList<Double> listaEmisoras){
        System.out.println("Ingrese la emisora que desee");
                Double emisora_deseada = scan.nextDouble();
                scan.nextLine();
                emisora = emisora_deseada;
    }


    /*
     * Modo reproducción
     */
    public void seleccionar(ArrayList<cancion> lista){
        int orden =1;
        for (cancion i: lista) {
            System.out.println("-"+orden+". "+i.getNombre() +", artista: "+i.getAutor()+"("+i.getGenero()+")");
          }
    }

    public void cambiar_c(Boolean flag,ArrayList<cancion> lista){
        if (flag==true)
        {
            posicion++;
            if(posicion==lista.size()){
                posicion=0;}   
        }
        else
        {
            if (posicion==0){
                posicion=lista.size()-1;}
            else{
                posicion--;}
        }

    }

    public void escuchar(ArrayList<cancion> lista){
        System.out.println("Reproduciendo "+lista.get(posicion).mostrar());
    }

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


    public void contactos(ArrayList<contacto> contactos){
        int orden =1;
        for (contacto i: contactos) {
            System.out.println("-"+orden+". "+i.toString());
          }

    }


    public void llamar(ArrayList<contacto> contactos){
        int posicion =1;
        for (contacto i: contactos) {
            System.out.println("-"+posicion+". "+i.toString());
            posicion++;
        }
        System.out.println("Escoja un contacto a llamar");
        int op = scan.nextInt()-1;
        scan.nextLine();
        System.out.println("llamando a "+contactos.get(op).getNombre()+ " del numero "+ contactos.get(op).getNumero());

    }
    
    public void finalizar(){
        System.out.println("La llamada se finalizó");
    }


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



}
