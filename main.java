import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Sharis Barrios 
 * @author Andy Fuentes
 * @author David Trujillo
 * @date 10- 11 - 2022
 * Clase principal para interactuar con la radio
 */

public class main {
    public static void main(String[] args) {
        int opcion = 0; 
        radio rc = new radio();
        boolean valor = false;
        ArrayList<Double> listaEmisoras = new ArrayList<Double>();

        /*
         * Creación playlists de canciones 
         */
        ArrayList<cancion> playlist1 = new ArrayList<cancion>();
        ArrayList<cancion> playlist2 = new ArrayList<cancion>();
        ArrayList<cancion> playlist3 = new ArrayList<cancion>();

        playlist1.add(new cancion("Bonito", "3:00", "Jarabe de Palo", "Pop"));
        playlist1.add(new cancion("Flip", "3:43", "Glass Animals", "Pop"));
        playlist1.add(new cancion("Cabinet Man", "4:23", "Lemon Demon", "Synth Pop"));

        playlist2.add(new cancion("Is This What You Can Not Do", "4:46", "Gold Celeste", "Alternativo"));
        playlist2.add(new cancion("Pink Showers", "2:33", "Deeper", "Alternativo"));
        playlist2.add(new cancion("Dirty Mouth", "2:54", "Alice Phoebe Lou", "Alternativo"));

        playlist3.add(new cancion("The Pyre", "3:40", "Kronowski", "Heavy Metal"));
        playlist3.add(new cancion("White Flag", "3:40", "Fall of Envy", "Heavy Metal"));
        playlist3.add(new cancion("The River Flows", "4:20", "Everture", "Rock Alternativo"));
        
        /*
         * Creación de lista de contactos
         */

        ArrayList<contacto> contactos = new ArrayList<contacto>();
        contactos.add(new contacto("Sharis", "12345678"));
        contactos.add(new contacto("Luis", "23145678"));
        contactos.add(new contacto("Pablo", "34567812"));

        Scanner scan = new Scanner(System.in);
        String menu ="------ Menu de selección ------ \n ¿Qué desea hacer el día de hoy? \n-------------------------------- \n1. Encender/Apagar el radio \n2. Cambiar volumen \n3. Programar modo radio \n4. Programar modo reproduccion \n5. Programar modo telefono \n6. Programar modo productividad \n7. Salir \nIngrese el número de la opcion que desea";
        System.out.println(menu);
        opcion = scan.nextInt();
        scan.nextLine();

        while (opcion<7 && opcion>=1){
            switch(opcion){
                case 1:
                    System.out.println("¿Deseas encender o apagar la radio? 1. Encender 2. Apagar");
                    int enc = scan.nextInt();
                    scan.nextLine();
                    if (enc == 1){
                        valor = true;}
                    else {
                        valor = false;}
                    rc.estado(valor);
                    break;
                   
                    

                case 2:
                    if (valor == true){
                        System.out.println("¿Deseas subir o bajar el volumen? 1. Subir 2. Bajar");
                        int vol = scan.nextInt();
                        scan.nextLine();
                        boolean valor1 = false;
                        if (vol == 1){
                            valor1 = true;}
                        else {
                            valor1 = false;}
                        rc.volumen(valor1);
                    }
                    else {
                        System.out.println("La Radio está apagada no puede realizar esta acción \n");
                    }
                    break;
                    
                    


                case 3:
                    if (valor == true){
                        String radiomenu ="--Menu de selección-- \n--------------------- \n1. Cambiar de emisora radial FM/AM \n2. Cambiar de emisora \n3. Guardar emisora \n4. Cargar emisora \n5. Salir \nIngrese el numero de la opcion que desea";
                        System.out.println(radiomenu);
                        int eleccion = scan.nextInt();
                        scan.nextLine();
                        while (eleccion<5 && opcion>=1){
                            if (eleccion == 1){
                                System.out.println("¿Deseas cambiar a FM o AM? 1. FM 2. AM");
                                int rad = scan.nextInt();
                                scan.nextLine();
                                boolean valor2 = false;
                                if (rad == 1){
                                    valor2 = true;}
                                else {
                                    valor2 = false;}
                                rc.cambiar(valor2);
                            }

                            if (eleccion == 2){
                                System.out.println("¿Deseas cambiar emisora hacia arriba o abajo? 1. Arriba 2. Abajo");
                                int emi = scan.nextInt();
                                scan.nextLine();
                                boolean valor3 = false;
                                if (emi == 1){
                                    valor3 = true;}
                                else {
                                    valor3 = false;}
                                rc.cambiar_e(valor3);
                            }

                            if (eleccion == 3){
                                System.out.println("¿Qué emisora deseas guardar? Ingresala ");
                                double emisora = scan.nextDouble();
                                rc.guardar(listaEmisoras, emisora);
                            }

                            if (eleccion == 4){
                                rc.cargar(listaEmisoras);
                            }

                            System.out.println(radiomenu);
                            eleccion = scan.nextInt();
                            scan.nextLine();
                        }
                    }
                    else {
                        System.out.println("La Radio está apagada no puede realizar esta acción \n");
                    }
                    break; 




                case 4:
                    if (valor == true){
                        String repromenu ="--Menu de selección-- \n--------------------- \n1. Seleccionar una lista de reproducción \n2. Cambiar Canción \n3. Escuchar canción \n4. Salir \nIngrese el numero de la opcion que desea";
                        System.out.println(repromenu);
                        int opc = scan.nextInt();
                        scan.nextLine();
                    
                        ArrayList<cancion> playlist = new ArrayList<cancion>();
                        playlist = null; 
                        while (opc<4 && opc>=1){
                            if(opc == 1){
                                System.out.println("¿Qué Playlist deseas escuchar? 1. Pop 2. Alternativo 3. Rock ");
                                double play = scan.nextDouble();
                                if(play == 1){
                                    playlist = playlist1;
                                    rc.seleccionar(playlist);
                                }
                                if(play == 2){
                                    playlist = playlist2;
                                    rc.seleccionar(playlist);
                                }
                                if(play == 3){
                                    playlist = playlist3;
                                    rc.seleccionar(playlist);
                                }
                            }

                            if(opc == 2){
                                System.out.println("¿Deseas cambiar hacia adelante o hacia atrás? 1. Adelante 2. Atrás");
                                int can = scan.nextInt();
                                scan.nextLine();
                                boolean valor4 = false;
                                if (can == 1){
                                    valor4 = true;}
                                else {
                                    valor4 = false;}
                                rc.cambiar_c(valor4, playlist);
                            }
                            
                            if(opc == 3){
                                rc.escuchar(playlist);
                            }
                            System.out.println(repromenu);
                            opc = scan.nextInt();
                            scan.nextLine();
                        }
                    }
                    else {
                        System.out.println("La Radio está apagada no puede realizar esta acción \n");
                    }

                    break;


                case 5:
                    if (valor == true){
                        String telmenu ="--Menu de selección-- \n--------------------- \n1. Conectar/Desconectar télefono \n2. Mostrar Ccntactos \n3. Llamar \n4. Finalizar llamada \n5. Modo Speaker/Auriculares \n6. Salir \n Ingrese el numero de la opcion que desea";
                        System.out.println(telmenu);
                        int opci = scan.nextInt();
                        scan.nextLine();
                    
                        while (opci<6 && opci>=1){
                            if(opci == 1){
                                System.out.println("¿Deseas conectar o desconectar tu télefono? 1. Conectar 2. Desconectar");
                                int can = scan.nextInt();
                                scan.nextLine();
                                boolean valor5 = false;
                                if (can == 1){
                                    valor5 = true;}
                                else {
                                    valor5 = false;}
                                rc.conexion(valor5);
                            }

                            if(opci == 2){
                                rc.contactos(contactos);
                            }

                            if(opci == 3){
                                rc.llamar(contactos);
                            }

                            if(opci == 4){
                                rc.finalizar();
                            }

                            if(opci == 5){
                                System.out.println("¿Deseas usar Speaker o Auriculares? 1. Auriculares 2. Speaker");
                                int can = scan.nextInt();
                                scan.nextLine();
                                boolean valor6 = false;
                                if (can == 1){
                                    valor6 = true;}
                                else {
                                    valor6 = false;}
                                rc.audio(valor6);

                            }

                            System.out.println(telmenu);
                            opci = scan.nextInt();
                            scan.nextLine();
                        }
                    }
                    else {
                        System.out.println("La Radio está apagada no puede realizar esta acción \n");
                    }

                    break;

                case 6:
                    if (valor == true){
                        System.out.println("¿A dónde desea viajar?");
                        String lugar = scan.nextLine();
                        System.out.println(rc.viajes(lugar));
                    }
                    else {
                        System.out.println("La Radio está apagada no puede realizar esta acción \n");
                    }
                    break;
        }
        System.out.println(menu);
        opcion = scan.nextInt();
        scan.nextLine();
    }
}
}