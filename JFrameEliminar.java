import javax.swing.*;
import java.awt.*;

public class JFrameEliminar extends JFrame
{
   Eliminar eli = new Eliminar();
      public JFrameEliminar()
   {     initComponents();
   }
   
   private void initComponents()
   {
      setSize(2000, 400);
      setTitle("Eliminar");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(eli);
      setVisible(true);
   }   
}