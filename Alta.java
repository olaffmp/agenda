
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Alta extends JPanel implements ActionListener{

      private JButton btnGuardar, btnCancelar;
      private JTextField txtNombre, txtTelefono, txtCorreo, txtCumple;
      
      ManejoPersona mp1 = new ManejoPersona(); //import java.util.*;

      public Alta(){
         setLayout(new GridLayout(5,2));
         JLabel lblNombre = new JLabel("Nombre: ", JLabel.RIGHT);
         txtNombre = new JTextField(50);
         add(lblNombre);
         add(txtNombre);
         
         JLabel lblTelefono = new JLabel("Telefono: ", JLabel.RIGHT);
         txtTelefono = new JTextField(10);
         add(lblTelefono);
         add(txtTelefono);
         
         JLabel lblCorreo = new JLabel("Correo: ", JLabel.RIGHT);
         txtCorreo = new JTextField(50);
         add(lblCorreo);
         add(txtCorreo);
         
         JLabel lblCumple = new JLabel("Cumpleanios(dd/mm/aaaa): ", JLabel.RIGHT);
         txtCumple = new JTextField(10);
         add(lblCumple);
         add(txtCumple);
         
         btnGuardar = new JButton("Guardar");
         btnGuardar.addActionListener(this);
         add(btnGuardar);
         
         btnCancelar = new JButton("Regresar");
         btnCancelar.addActionListener(this);
         add(btnCancelar);
         
      
      
      }//constructor
      
      public void actionPerformed(ActionEvent e){
         if(e.getSource()==btnGuardar){
               if(txtNombre.getText()==null || txtNombre.getText().isEmpty() || 
                  txtTelefono.getText()==null || txtTelefono.getText().isEmpty() ||
                  txtCorreo.getText()==null || txtCorreo.getText().isEmpty() ||
                  txtCumple.getText()==null || txtCumple.getText().isEmpty()){
                     
                        JOptionPane.showMessageDialog(null, "Debes llenar todos los campos", "Aviso" , JOptionPane.INFORMATION_MESSAGE);
                     
                  }//if-2
                  else{
                        mp1.agregar(txtNombre.getText() , txtTelefono.getText(), txtCorreo.getText(), txtCumple.getText());
                        JOptionPane.showMessageDialog(null, "Se dio de alta con exito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        txtNombre.setText(null); 
                        txtTelefono.setText(""); 
                        txtCorreo.setText(""); 
                        txtCumple.setText("");  
                        txtNombre.requestFocus();
                     
                  }//else
                  
                  
         }//if
         
         if(e.getSource()==btnCancelar){
            mp1.mostrar();
            setVisible(false);
            //System.exit(0);
         
         }//if
      
      
      }//actionEvent
   

}//class