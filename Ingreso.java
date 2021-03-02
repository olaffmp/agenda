//esta clase va a contener la ventana de ingreso y contraseña

import javax.swing.*;//importa la libreria de interfaces graficas de java
import java.awt.*;//kit de herramientas graficas y de interfaz de ususario
import java.awt.event.*;//importa la libreria de eventos por perifericos


public class Ingreso extends JPanel implements ActionListener{
      
      //Decaramos variables de tipo JPanel
      private JButton btnIngresar, btnCancelar;
      private JTextField txtUser;
      private JPasswordField contra;
    //private JPanel;//****
      
      //Metodo constructor
      public Ingreso(){
         setLayout(new GridLayout(3,2));
         
         //Definimos el espacio para el usuario
         JLabel lblUser = new JLabel("Usuario:", JLabel.RIGHT);//etiqueta de usuario
         txtUser = new JTextField(20);//espacio para poner el nombre de usuario
         add(lblUser);//agregamos los objetos al layout
         add(txtUser);
         
         //Definimos el espacio para la contraseña
         JLabel lblContra = new JLabel("Contrasena:", JLabel.RIGHT);//etiqueta de contrasena
         contra = new JPasswordField(20);//espacio para poner la contraseña
         contra.setToolTipText("Ingrese contrasena: ");
         add(lblContra);//agregamos los objetos al layout
         add(contra);
         
         //creacion de botones de la interfaz
         btnIngresar = new JButton("Ingresar");
         btnIngresar.addActionListener(this);
         btnCancelar = new JButton("Cancelar");
         btnCancelar.addActionListener(this);
         add(btnIngresar);
         add(btnCancelar);
         
         
      }//constructor
      
      public void actionPerformed(ActionEvent e){
         String usuario = txtUser.getText();
         String password = new String(contra.getPassword());
         
         //si le das click en ingresar
         if(e.getSource()== btnIngresar){
            
            //si hay un campo vacio te da error
            if(usuario.isEmpty() || password.isEmpty()){
               JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario y contrasena");
               txtUser.setText(null);
               contra.setText(null);
               txtUser.requestFocus();
            }//if-2
            else{
               
               //si la contraseña y el usuario estan correctos el programa se abre
               if(usuario.equals("admin")&& password.equals("1234")){
                  JOptionPane.showMessageDialog(null, "Bienvenido a la agenda");//mensaje de bienvenida
                  JFrameMenu obj = new JFrameMenu();//creamos el objeto que nos envia a la clase JFrameDatos
                  
               }//if-3
               else{
                  JOptionPane.showMessageDialog(null, "Usuario o contraseña no valido", "Warning", JOptionPane.WARNING_MESSAGE);
                  txtUser.setText(null);//vaciamos los campos
                  contra.setText(null);//vaciamos los campos
                  txtUser.requestFocus();// hace que el puntero se situe en ese espacio
               }//else-2
            
            }//else 1
            
         
         }//if-1 -> si da click en el boton aceptar
         
         //si da clic en el boton cancelar
         if(e.getSource()==btnCancelar){
            System.exit(0);
         
         }//if boton cancelar
      
      }//actionPerformed


}//class