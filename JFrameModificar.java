import javax.swing.*;
import java.awt.*;

public class JFrameModificar extends JFrame
{
   Modificar mod = new Modificar();
      public JFrameModificar()
   {     initComponents();
   }
   
   private void initComponents()
   {
      setSize(500, 400);
      setTitle("Modifcar Contactos");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(mod);
      setVisible(true);
   }   
}