import java.util.Scanner;
<<<<<<< HEAD

public class main {
    public static void main(String[] args) {
        int opcion = 0; 
        radio rc = new radio();
        Scanner scan = new Scanner(System.in);

        String menu ="--Menu de selección-- \n--------------------- \n1. Encender/Apagar \n2. Cambiar volumen \n3. Modo radio \n4. Modo reproduccion \n5. Modo telefono \n6. Modo productividad \nIngrese el numero de la opcion que desea";
         }

         System.out.println(menu);
         opcion = scan.nextInt();
         scan.nextLine();

        switch(opcion){
            case 1:
                rc.encender_apagar();
            case 2:
                rc.cambiar_volumen();
            case 3:
                rc.modo_radio();
            case 4:
                rc.modo_reproduccion();
            case 5:
                rc.modo_telefono();
            case 6:
                rc.modo_productividad();
            
        }
    }
