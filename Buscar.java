import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Buscar extends JPanel implements ActionListener{

      private JButton btnBuscar, btnCancelar;
      private JTextField txtNombre;
      private JLabel datos;
      
      ManejoPersona mp1 = new ManejoPersona(); //import java.util.*;
      ArrayList<Persona> datosPer = new ArrayList<Persona>();

      public Buscar(){
      
         datosPer=mp1.datos();
         setLayout(new GridLayout(5,2));
         JLabel etiqueta = new JLabel("Ingrese el nombre de la persona que desea buscar: ");
         JLabel etiqueta2 = new JLabel("");
         add(etiqueta);
         add(etiqueta2);
         
         
         JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
         txtNombre = new JTextField(50);
         add(lblNombre);
         add(txtNombre);
         
         btnBuscar = new JButton("Buscar");
         btnBuscar.addActionListener(this);
         add(btnBuscar);
         
         btnCancelar = new JButton("Regresar");
         btnCancelar.addActionListener(this);
         add(btnCancelar);
         
         //datos = new Jlabel();
         //add(datos);
         
      
      
      }//constructor
      
      public void actionPerformed(ActionEvent e){
         boolean flag= false;
         if(e.getSource()==btnBuscar){
               if(txtNombre.getText()==null || txtNombre.getText().isEmpty()){
                     
                        JOptionPane.showMessageDialog(null, "Debes introducir un nombre para buscarlo", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                     
                  }//if-2
                  else{
                 
                        Iterator<Persona> itrPersona = datosPer.iterator();
                        while(itrPersona.hasNext()){
                           Persona persona = itrPersona.next();
                           if(txtNombre.getText().equals(persona.getNombre())){
                               JOptionPane.showMessageDialog(null, "La persona esta registrada en la agenda", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                               flag=true;
                               datos = new JLabel();
                               add(datos);

                               datos.setText(String.valueOf("Nombre: "+persona.getNombre()+" Telefono: "+ persona.getTelefono()+" Correo: "+ persona.getCorreo()+ " CumpleAños: "+persona.getCumple()));
                               
                               break;
                                     
                           }//if 
                           
                               
                         }//while
                         if(flag==false){
                                 JOptionPane.showMessageDialog(null, "La persona no existe", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                                 txtNombre.setText("");
                                 txtNombre.requestFocus();
                         } 
                           
                             //System.out.println("Si no recibio el mensaje de que fue encontrado... es por que no fue encontrado el nombre. ");
                     }//else
                        
                     
                 }//if-buscar
                  
                  
         
         
         
         if(e.getSource()==btnCancelar){
            mp1.mostrar();
            setVisible(false);
            //System.exit(0);
         
         }//if
      
      
      }//actionEvent
   

}//class