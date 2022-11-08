import java.util.Scanner;
import java.util.ArrayList;
public class radio_carro implements radio {
Scanner scan = new Scanner(System.in);
boolean itson = false ;
int volumen;
String mood;
float emisora;
ArrayList<Float> Lista_emisoras = new ArrayList<Float>();
    public void encender_apagar(){

        if(itson == false){
            itson = true;
        }
        else if(itson == true){
            itson = false;
        }
    }

    public void cambiar_volumen(){
        System.out.println("Ingrese 1 si quiere subir volumen o 2 si quiere bajar volumen");
        int opcion = scan.nextInt();
        switch(opcion){

            case 1:
                volumen ++;
            case 2:
                volumen --;
         
        }
            System.out.println("El nuevo volumen es " + volumen);   

    }
 
    public void modo_radio(){
        if(mood == "FM"){
            mood = "AM";

        }
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

    public void modo_productividad(){

    }

    public radio_carro(){
        mood = "FM";
    }
}
