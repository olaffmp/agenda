public class Persona{
   
   //variables
   private String Nombre;
   private String Telefono;
   private String Correo;
   private String Cumple;
   
   //nombre
   public String getNombre(){
      return Nombre;
   }
   
   public void setNombre(String nombre){
      this.Nombre = nombre;
   }
   //telefono
   public String getTelefono(){
      return Telefono;
   }
   
   public void setTelefono(String telefono){
      this.Telefono = telefono;
   }
   //correo
   public String getCorreo(){
      return Correo;
   }
   
   public void setCorreo(String correo){
      this.Correo = correo;
   }
   //cumpleanios
   public String getCumple(){
      return Cumple;
   }
   
   public void setCumple(String cumple){
      this.Cumple = cumple;
   }

}//class