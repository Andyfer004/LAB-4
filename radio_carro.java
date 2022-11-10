import java.util.Scanner;
import java.util.ArrayList;


public class radio_carro implements radio {
        Scanner scan = new Scanner(System.in);
        private float emisora;
        private String mood;
        private int volumen;
        private boolean estado;
        private ArrayList<Float> listaEmisoras;
        private ArrayList<cancion> canciones;
        private ArrayList<contacto> contactos;


        public void encender_apagar(){
            if(estado == false){
                estado = true;
            }
            else if(estado == true){
                estado = false;
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
                System.out.println("Opcion 1: Siguiente emisora\n Opcion 2: emisora anterior\n Opcion 3: Guardar emisora\n Opcion 4: cargar emisora\n 5:salir");
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

}
