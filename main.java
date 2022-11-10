import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcion = 0; 
        radio rc = new radio();
        boolean valor = false;
        ArrayList<Double> listaEmisoras = new ArrayList<Double>();
        Scanner scan = new Scanner(System.in);
        String menu ="--Menu de selección-- \n--------------------- \n1. Encender/Apagar \n2. Cambiar volumen \n3. Modo radio \n4. Modo reproduccion \n5. Modo telefono \n6. Modo productividad \nIngrese el numero de la opcion que desea";
        System.out.println(menu);
        opcion = scan.nextInt();
        scan.nextLine();

        ArrayList<cancion> playlist1 = new ArrayList<cancion>();
        playlist1.add(new cancion("Bonito", "3:00", "Jarabe de Palo", "Pop"));
        
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


            case 4:
                break;




            case 5:
                break;

            case 6:
            if (valor == true){
                System.out.println("¿A dónde desea viajar?");
                String lugar = scan.nextLine();
                rc.viajes(lugar);
            }
    }
}
}