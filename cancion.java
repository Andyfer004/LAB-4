public class cancion {
   private  String nombre;
   private  String duracion;
   private  String autor;
   private  String genero;
 
   
   /** 
    * @return String
    */
   public String mostrar(){
     return "El nombre es "+nombre + "\n"+ 
      "La duracion es "+duracion  + "\n"+ 
      "El autor es "+autor  + "\n"+ 
      "El genero es "+genero  + "\n";
   }

   public cancion(String nombre_ingresado,String duracion_ingresado,String autor_ingresado,String genero_ingresado){
      this.nombre = nombre_ingresado;
      this.duracion = duracion_ingresado;
      this.autor = autor_ingresado;
      this.genero = genero_ingresado;
   }


   
   /** 
    * @return String
    */
   public String getNombre() {
      return this.nombre;
   }

   
   /** 
    * @param nombre
    */
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   
   /** 
    * @return String
    */
   public String getDuracion() {
      return this.duracion;
   }

   
   /** 
    * @param duracion
    */
   public void setDuracion(String duracion) {
      this.duracion = duracion;
   }

   
   /** 
    * @return String
    */
   public String getAutor() {
      return this.autor;
   }

   
   /** 
    * @param autor
    */
   public void setAutor(String autor) {
      this.autor = autor;
   }

   
   /** 
    * @return String
    */
   public String getGenero() {
      return this.genero;
   }

   
   /** 
    * @param genero
    */
   public void setGenero(String genero) {
      this.genero = genero;
   }

 

}
