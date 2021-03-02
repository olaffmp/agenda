//panel del menu de opciones

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelMenu extends JPanel implements ActionListener{
   
   private JButton btnAlta, btnBuscar, btnEliminar, btnModificar, btnSalir;
   //ManejoPersona mPerson = new ManejoPersona();
   
   public PanelMenu(){
      setLayout(new GridLayout(5,1));
      
      btnAlta = new JButton("Dar De Alta");
      btnAlta.addActionListener(this);
      
      btnBuscar= new JButton("Buscar");
      btnBuscar.addActionListener(this);
      
      btnModificar= new JButton("Modificar");
      btnModificar.addActionListener(this);
      
      btnEliminar= new JButton("Eliminar");
      btnEliminar.addActionListener(this);
      
      btnSalir= new JButton("Salir");
      btnSalir.addActionListener(this);
      
      add(btnAlta);
      add(btnBuscar);
      add(btnModificar);
      add(btnEliminar);
      add(btnSalir);
   
   }//PanelMenu-constructor
   
   public void actionPerformed(ActionEvent e){
      if(e.getSource()==btnAlta){
         JFrameAlta alt = new JFrameAlta();
      }   
      if(e.getSource()==btnBuscar){
         JFrameBuscar bsc = new JFrameBuscar();
      }   
      if(e.getSource()==btnModificar){
         JFrameModificar mdf = new JFrameModificar();
      }  
      if(e.getSource()==btnEliminar){
         JFrameEliminar elm = new JFrameEliminar();
      }   
      if (e.getSource()==btnSalir){
			System.exit(0);
      }
   
   }//actionEvent
   
   

}//class