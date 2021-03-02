import java.util.*;
public class ManejoPersona
{
   static ArrayList<Persona> Arrperson = new ArrayList<Persona>(); 
   private Persona objPersona;
   
   public ManejoPersona()
   {  }
   
   public void agregar(String nom, String tel, String correo, String cumple)
   {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setTelefono(tel);
    objPersona.setCorreo(correo);
    objPersona.setCumple(cumple);
    Arrperson.add(objPersona);//Agrega el objeto al arraylist
    
   }
   
   public void eliminar(int i)
   {
    /*objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setTelefono(tel);
    objPersona.setCorreo(correo);
    objPersona.setCumple(cumple);*/
    Arrperson.remove(i);//Agrega el objeto al arraylist
    
   }
   
   /*public void modificar(String nom, String tel, String correo, String cumple)
   {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setTelefono(tel);
    objPersona.setCorreo(correo);
    objPersona.setCumple(cumple);
    Arrperson.add(objPersona);//Agrega el objeto al arraylist
    
   }*/
   
   public ArrayList datos(){
      return Arrperson;
   }
   
   public void mostrar()
   {
     System.out.println("... Personas en la Agenda ...");
     Iterator<Persona> itrPersona = Arrperson.iterator();
     while(itrPersona.hasNext()){
	      Persona persona = itrPersona.next();
	    System.out.println(persona.getNombre() + "  "
			+ persona.getTelefono() + "  "
			+ persona.getCorreo() + "  "
			+ persona.getCumple());
      }
   }
  }