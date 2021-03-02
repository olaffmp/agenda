import javax.swing.*;//importa la libreria de interfaces graficas de java
import java.awt.*;//kit de herramientas graficas y de interfaz de ususario
import java.awt.event.*;//importa la libreria de eventos por perifericos
import java.util.*;

public class JFrameMenu extends JFrame{


   PanelMenu pm = new PanelMenu();
   
   public JFrameMenu(){
      initComponents();
   }//constructor
   
   private void initComponents(){
      setSize(300,200);
      setTitle("Menu Principal");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(pm);
      setVisible(true);
   
   }//initComponents

}//class
