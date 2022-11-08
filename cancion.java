public class cancion {
String nombre;
String duracion;
String autor;
String genero;
 public void mostrar(){
    System.out.println("El nombre es "+nombre);
    System.out.println("la duracion es "+duracion);
    System.out.println("El autor es "+autor);
    System.out.println("el genero es "+genero);
 }
 public cancion(String nombre_ingresado,String duracion_ingresado,String autor_ingresado,String genero_ingresado){
    this.nombre = nombre_ingresado;
    this.duracion = duracion_ingresado;
    this.autor = autor_ingresado;
    this.genero = genero_ingresado;
 }

}
