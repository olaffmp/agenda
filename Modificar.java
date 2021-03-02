import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Modificar extends JPanel implements ActionListener{

      private JButton btnModificar, btnCancelar, btnGuardar, btnBuscar;
      private JTextField txtNombre,txtNombreNuevo,txtTelefonoNuevo,txtCorreoNuevo, txtCumpleNuevo;

      private JLabel n, t, co, cu,lblNombreNuevo,datos;
      private int index=0; 
      
      
      ManejoPersona mp1 = new ManejoPersona();
      ArrayList<Persona> datosPer = new ArrayList<Persona>();

      public Modificar(){
      
         datosPer=mp1.datos();
         setLayout(new GridLayout(8,2));
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
         
         datos=new JLabel();
         add(datos);
         
         JLabel lblNombreNuevo = new JLabel("Nombre: ", JLabel.RIGHT);
         txtNombreNuevo = new JTextField(50);
         add(lblNombreNuevo);
         add(txtNombreNuevo);
         
         JLabel lblTelefonoNuevo = new JLabel("Telefono: ", JLabel.RIGHT);
         txtTelefonoNuevo= new JTextField(10);
         add(lblTelefonoNuevo);
         add(txtTelefonoNuevo);
         
         JLabel lblCorreoNuevo= new JLabel("Correo: ", JLabel.RIGHT);
         txtCorreoNuevo = new JTextField(50);
         add(lblCorreoNuevo);
         add(txtCorreoNuevo);
         
         JLabel lblCumpleNuevo = new JLabel("Cumpleanios(dd/mm/aaaa): ", JLabel.RIGHT);
         txtCumpleNuevo = new JTextField(10);
         add(lblCumpleNuevo);
         add(txtCumpleNuevo);
         
         btnGuardar = new JButton("Guardar");
         btnGuardar.addActionListener(this);
         add(btnGuardar);
        
         btnCancelar = new JButton("Regresar");
         btnCancelar.addActionListener(this);
         add(btnCancelar);
      
      
      }//constructor
      
      public void actionPerformed(ActionEvent e){
         boolean flag= false;
         int cont = 0;
         if(e.getSource()==btnBuscar){
               if(txtNombre.getText()==null || txtNombre.getText().isEmpty()){
                     
                        JOptionPane.showMessageDialog(null, "Debes introducir un nombre para buscarlo y modificarlo", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                     
                  }//if-2
                  else{
                       Iterator<Persona> itrPersona = datosPer.iterator();
                        while(itrPersona.hasNext()){
                           Persona persona = itrPersona.next();
                           if(txtNombre.getText().equals(persona.getNombre())){
                               JOptionPane.showMessageDialog(null, "La persona esta registrada en la agenda", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                               flag=true;
                               cont++;
                               
                               datos.setText(String.valueOf("Nombre: "+persona.getNombre()+" Telefono: "+ persona.getTelefono()+" Correo: "+ persona.getCorreo()+ " CumpleAños: "+persona.getCumple()));
                               persona.setNombre("");
                               persona.setTelefono("");
                               persona.setCorreo("");
                               persona.setCumple("");
                               
                               break;
                                                     
                                     
                           }//if 
 
                           
                               
                         }//while
                         if(flag==false)
                                 JOptionPane.showMessageDialog(null, "La persona que desea modificar no existe", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                          
                     }//else
                        
                     
                 }//if-buscar
                 
                 
         //Guardara         
         if(e.getSource()==btnGuardar){
                   if(txtNombreNuevo.getText()==null || txtNombreNuevo.getText().isEmpty() || 
                       txtTelefonoNuevo.getText()==null || txtTelefonoNuevo.getText().isEmpty() ||
                        txtCorreoNuevo.getText()==null || txtCorreoNuevo.getText().isEmpty() ||
                        txtCumpleNuevo.getText()==null || txtCumpleNuevo.getText().isEmpty()){
                           
                              JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                           
                        }//if-2
                        else{
                              mp1.agregar(txtNombreNuevo.getText(), txtTelefonoNuevo.getText(), txtCorreoNuevo.getText(), txtCumpleNuevo.getText() );
                              
                              JOptionPane.showMessageDialog(null, "Se modifico con exito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                              txtNombre.setText(null);  
                              txtNombreNuevo.requestFocus();
                           
                        }//else
                        
                        
               }//if
        
         
         
         //Salir
         if(e.getSource()==btnCancelar){
            mp1.mostrar();
            setVisible(false);
            //System.exit(0);
         
         }//if
      
      
      }//actionEvent
   

}//class