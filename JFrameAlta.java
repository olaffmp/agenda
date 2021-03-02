import javax.swing.*;
import java.awt.*;

public class JFrameAlta extends JFrame
{
   Alta alt1 = new Alta();
      public JFrameAlta()
   {     initComponents();
   }
   
   private void initComponents()
   {
      setSize(500, 400);
      setTitle("Dar de Alta");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setContentPane(alt1);
      setVisible(true);
   }   
}