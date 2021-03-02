import javax.swing.*;//importa la libreria de interfaces graficas de java
import java.awt.*;//kit de herramientas graficas y de interfaz de ususario
import java.awt.event.*;//importa la libreria de eventos por perifericos
import java.util.*;

public class JFrameIngreso extends JFrame{


   Ingreso ing = new Ingreso();
   
   public JFrameIngreso(){
      initComponents();
   }//constructor
   
   private void initComponents(){
      setSize(300,200);
      setTitle("Menu Principal");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(ing);
      setVisible(true);
   
   }//initComponents

}//class
