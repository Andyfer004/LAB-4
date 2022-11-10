import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcion = 0; 
        radio rc = new radio();
        boolean valor = false;
        ArrayList<Double> listaEmisoras = new ArrayList<Double>();


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
        
        Scanner scan = new Scanner(System.in);
        String menu ="--Menu de selección-- \n--------------------- \n1. Encender/Apagar \n2. Cambiar volumen \n3. Modo radio \n4. Modo reproduccion \n5. Modo telefono \n6. Modo productividad \nIngrese el numero de la opcion que desea";
        System.out.println(menu);
        opcion = scan.nextInt();
        scan.nextLine();


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
                    rc.estado(valor);
                }
                break;
                
                
            case 3:
                String radiomenu ="--Menu de selección-- \n--------------------- \n1. Cambiar de emisora radial FM/AM \n2. Cambiar de emisora \n3. Guardar emisora \n4. Cargar emisora \nIngrese el numero de la opcion que desea";
                System.out.println(radiomenu);
                int eleccion = scan.nextInt();
                scan.nextLine();
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

                break; 


            case 4:
                String repromenu ="--Menu de selección-- \n--------------------- \n1. Seleccionar una lista de reproducción \n2. Cambiar Canción \n3. Escuchar canción \nIngrese el numero de la opcion que desea";
                System.out.println(repromenu);
                int opc = scan.nextInt();
                scan.nextLine();
            /*
             * Seleccionar lista de reproducción (se tienen configuradas algunas para prueba)
                o Cambiar canción (tanto para adelante como para atrás)
                o Escuchar canción
             */

                if(opc == 1){
                    System.out.println("¿Qué Playlist deseas escuchar? 1. Pop 2. Alternativo 3. ");
                    double emisora = scan.nextDouble();
                    rc.guardar(listaEmisoras, emisora);
                }

                if(opc == 2){

                }
                
                if(opc == 3){

                }
                

                break;




            case 5:
                break;

            case 6:
                if (valor == true){
                    System.out.println("¿A dónde desea viajar?");
                    String lugar = scan.nextLine();
                    rc.viajes(lugar);
                }
                break;
    }
}
}