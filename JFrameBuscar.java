import javax.swing.*;
import java.awt.*;

public class JFrameBuscar extends JFrame
{
   Buscar bus = new Buscar();
      public JFrameBuscar()
   {     initComponents();
   }
   
   private void initComponents()
   {
      setSize(2000, 400);
      setTitle("Buscar Contactos");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(bus);
      setVisible(true);
   }   
}