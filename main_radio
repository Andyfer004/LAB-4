/*Este es el main de otro compañero*/
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.ArrayList;
public class main_radio {
    public static void main(String[] args){
        Scanner reclado = new Scanner(System.in);
        int opcion1 = 0;
        int v=0;
        radio tumba_la_casa= new radio();
        ArrayList <cancion> canciones =new ArrayList<cancion>();
        ArrayList <contacto> contactos =new ArrayList<contacto>();
        ArrayList <Double> emisoras =new ArrayList<Double>();
        //Playlist #1 
        ArrayList <cancion> top5 =new ArrayList<cancion>();
        cancion midnights = new cancion("Midnights","Talyor Swift","Pop","5:10 min");
        cancion revolver = new cancion("Revolver","The Beatles","Rock","4:10 min");
        cancion motomami = new cancion("Motomami","Rosalia","Música tropical","3:10 min");
        cancion sour = new cancion("Sour","Olivia Rodrigo","pop","2:21 min");
        top5.add(midnights);
        top5.add(revolver);
        top5.add(motomami);
        top5.add(sour);
        //Playlist #2
        ArrayList <cancion> hitsongs =new ArrayList<cancion>();
        cancion jasmine = new cancion("Jasmine","DPR LIVE","Pop","3:20 min");
        cancion you = new cancion("You","Travis Scott","Rap","3:33 min");
        cancion reminder = new cancion("Reminder","The Weekend","Pop","3;37 min");
        cancion sings = new cancion("Sings","Drake","Rap","3:52 min");
        hitsongs.add(jasmine);
        hitsongs.add(you);
        hitsongs.add(reminder);
        hitsongs.add(sings);
        //Playlist #3
        ArrayList <cancion> best =new ArrayList<cancion>();
        cancion location = new cancion("Location","Khalid","Pop","4:10 min");
        cancion hope = new cancion("Hope","XXXTENTACION","Rap","1:50 min");
        cancion bye = new cancion("Bye","Jaden","Rap","4:56 min");
        cancion telepatia = new cancion("Telpatia","Kali Uchis","Pop","2:39 min");
        cancion more = new cancion("More","J-Hope","KPop","2:58 min");
        cancion museo = new cancion("Museo","Rauw Alejandro","Reguetón","4:08 min");
        cancion positions = new cancion("Positions","Ariana Grande","Pop","2:52 min");
        cancion who = new cancion("Who","BTS","Kpop","2:59 min"); 
        best.add(location);
        best.add(hope);
        best.add(bye);
        best.add(telepatia);
        best.add(more);
        best.add(museo);
        best.add(positions);
        best.add(who);
        //Contactos 
        contacto jaime= new contacto("Jaime","5016-9827");
        contacto carlita= new contacto("Carlita","4456-7894");
        contacto Mami= new contacto("Mami","5510-5537");
        contactos.add(jaime);
        contactos.add(carlita);
        contactos.add(Mami);
        canciones=hitsongs;
        System.out.println("Radio tumba la casa \n[1] Encender \n[2] Cambiar volumen \n[3] Modo radio\n[4] Modo reproducción\n[5] Modo telefono\n[6] Modo productividad\n[7] Apagar");
        opcion1 = reclado.nextInt();
        try{
        while(opcion1 !=7)
            {   
                if(opcion1 == 1) //subirle y bajarle volumen
                { 
                    tumba_la_casa.estado(true);
                }
                if(tumba_la_casa.get_estado()=="Apagado")
                {
                    System.out.println("No se puede hacer nada si el radio está apagado");
                    System.out.println("Radio tumba la casa \n[1] Encender \n[2] Cambiar volumen \n[3] Modo radio\n[4] Modo reproducción\n[5] Modo telefono\n[6] Modo productividad\n[7] Apagar");
                    opcion1 = reclado.nextInt();
                }
                else
                {
                    v=0;
                    int x =0;
                    System.out.println("Radio tumba la casa************************************* \n[2] Cambiar volumen \n[3] Modo radio\n[4] Modo reproducción\n[5] Modo telefono\n[6] Modo productividad\n[7] Apagar");
                    opcion1 = reclado.nextInt();
                    if(opcion1 == 2) //subirle y bajarle volumen
                    {   while(v !=3)
                        {
                            System.out.println("Modo volumen- (Bajar y subir el volumen)-----------");
                            System.out.println("[1] Sumarle 1\n[2] Bajarle 1\n[3] Salir");
                            v = reclado.nextInt();
                            if(v==1) tumba_la_casa.volumen(true);
                            else tumba_la_casa.volumen(false);
                        }
                    }
                    else if(opcion1 == 3){
                        while(x !=5)
                        {
                        System.out.println("Modo Radio---------------\n[1] Cambiar FM a AM \n[2] Cambiar emisora \n[3] Guardar emisoras\n[4] Cargar emisora\n[5] Salir");
                        x = reclado.nextInt();
                        switch(x) 
                        {
                            case 1:
                                System.out.println("Escoja la modulación -----------");
                                System.out.println("[1] FM\n[2] AM");
                                v = reclado.nextInt();
                                if(v==1) tumba_la_casa.cambiar(true);
                                else tumba_la_casa.cambiar(false);
                                break;
                            case 2:
                                System.out.println("Escoja si desea bajarle 0.5 o sumarle 0.5 a la emisora -----------");
                                System.out.println("[1] Sumarle 0.5\n[2] Bajarle 0.5");
                                v= reclado.nextInt();
                                if(v==1) tumba_la_casa.cambiar_e(true);
                                else tumba_la_casa.cambiar_e(false);
                                break;
                            case 3:
                                System.out.println("Ingrese la emisora que quiere agregar -----------");
                                Double v1= reclado.nextDouble();
                                tumba_la_casa.guardar(emisoras, v1);
                                break;
                            case 4:
                                System.out.println("Las emisoras disponibles son -----------");
                                tumba_la_casa.cargar(emisoras);
                                break;
                            default:
                                System.out.println("Opcion ingresada erroneamente");

                        }
                        }
                    }
                    else if(opcion1 == 4){
                        while(x !=4)
                        {
                        System.out.println("Modo Reproduccion---------------\n[1] Seleccionar lista de reproduccion \n[2] Cambiar cancion \n[3] Escuchar cancion\n[4] Salir");
                        x = reclado.nextInt();
                        switch(x) 
                        {
                            case 1:
                                System.out.println("Seleccione la lista de reproduccion -----------");
                                System.out.println("[1] Top 4 songs \n[2] Hitsongs\n[3] Las mejores");
                                v = reclado.nextInt();
                                if(v==1) canciones=top5;
                                else if(v==2) canciones=hitsongs;
                                else if(v==3) canciones=best;
                                System.out.println("Playlist seleccionada -----------");
                                tumba_la_casa.seleccionar(canciones);
                                break;
                            case 2:
                                System.out.println("Cambiar cancion -----------");
                                System.out.println("[1] Siguiente\n[2] Anterior");
                                v= reclado.nextInt();
                                if(v==1) tumba_la_casa.cambiar_c(true,canciones);
                                else tumba_la_casa.cambiar_c(false,canciones);
                                break;
                            case 3:
                                tumba_la_casa.escuchar(canciones);
                                break;
                            default:
                                System.out.println("Opcion ingresada erroneamente");
                        }
                        }
                    }
                    else if(opcion1 == 5){
                        while(x !=4)
                        {
                        System.out.println("Modo telefono---------------\n[1] Conectar y Desconectar \n[2] Mostrar contactos \n[3] Llamar contacto\n[4] Salir");
                        x = reclado.nextInt();
                        switch(x) 
                        {
                            case 1:
                                System.out.println("Desea conectar el telefono?");
                                System.out.println("[1] Si\n[2] No");
                                v= reclado.nextInt();
                                if(v==1) tumba_la_casa.conexion(true);
                                else tumba_la_casa.conexion(false);;
                                break;
                            case 2:
                                tumba_la_casa.contactos(contactos);
                                break;
                            case 3:
                                if(tumba_la_casa.get_conectar())
                                {
                                    tumba_la_casa.llamar(contactos);
                                    System.out.println("Cambiar a auriculares o speaker-----------");
                                    System.out.println("[1] Auriculares\n[2] Speaker");
                                    v = reclado.nextInt();
                                    if(v==1) tumba_la_casa.audio(true);
                                    else tumba_la_casa.audio(false);
                                    System.out.println("Finalizar llamada presione 1");
                                    x = reclado.nextInt();
                                    if(x==1)
                                    {
                                        tumba_la_casa.finalizar();
                                    }
                                }
                                else
                                {
                                    System.out.println("No se puede porque no está conectado el telefono");
                                }
                                break;
                            default:
                                System.out.println("Opcion ingresada erroneamente");

                        }
                        }
                    }
                    else if(opcion1 == 6){
                        System.out.println("Ingrese destino de llegada");
                        String destiny = reclado.nextLine();
                        destiny = reclado.nextLine();
                        System.out.println(tumba_la_casa.viajes(destiny));
                    }
                    else if(opcion1 == 7){
                        System.out.println("Saliendo del programa...");
                    
                    }
            }
            }
        }
        catch(Exception e)
            {
                System.out.println("Dato ingresado incorrectamente");
            }
     }
}
