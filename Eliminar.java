import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Eliminar extends JPanel implements ActionListener{

      private JButton btnEliminar, btnCancelar, btnBuscar;
      private JTextField txtNombre;
      private JLabel datos;
      
      
      ManejoPersona mp1 = new ManejoPersona();
      ArrayList<Persona> datosPer = new ArrayList<Persona>();

      public Eliminar(){
      
         datosPer=mp1.datos();
         setLayout(new GridLayout(8,2));
         JLabel etiqueta = new JLabel("Ingrese el nombre de la persona que desea eliminar: ");
         JLabel etiqueta2 = new JLabel("");
         add(etiqueta);
         add(etiqueta2);
         
         
         JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
         txtNombre = new JTextField(50);
         add(lblNombre);
         add(txtNombre);
         
         btnEliminar = new JButton("Eliminar");
         btnEliminar.addActionListener(this);
         add(btnEliminar);
         
         datos=new JLabel();
         add(datos);
       
         btnCancelar = new JButton("Regresar");
         btnCancelar.addActionListener(this);
         add(btnCancelar);
      
      
      }//constructor
      
      public void actionPerformed(ActionEvent e){
         boolean flag= false;
         int cont = 0;
         if(e.getSource()==btnEliminar){
               if(txtNombre.getText()==null || txtNombre.getText().isEmpty()){
                     
                        JOptionPane.showMessageDialog(null, "Debes introducir un nombre para buscarlo y eliminarlo", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                     
                  }//if-2
                  else{
                       Iterator<Persona> itrPersona = datosPer.iterator();
                        while(itrPersona.hasNext()){
                           Persona persona = itrPersona.next();
                           if(txtNombre.getText().equals(persona.getNombre())){
                               JOptionPane.showMessageDialog(null, "La persona esta registrada en la agenda y sera eliminada", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                               flag=true;
                               persona.setNombre("");
                               persona.setTelefono("");
                               persona.setCorreo("");
                               persona.setCumple("");
                               
                               break;
                                                     
                                     
                           }//if 
 
                           
                               
                         }//while
                         if(flag==false){
                                 JOptionPane.showMessageDialog(null, "La persona que desea eliminar no existe", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                                 txtNombre.setText("");
                                 txtNombre.requestFocus();
                                 
                         } 
                     }//else
                        
                     
                 }//if-buscar       
           
         //Salir
         if(e.getSource()==btnCancelar){
            mp1.mostrar();
            setVisible(false);
            //System.exit(0);
         
         }//if
      
      
      }//actionEvent
   

}//class