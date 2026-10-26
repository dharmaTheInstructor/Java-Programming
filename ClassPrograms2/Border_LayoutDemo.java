// Demo for BorderLayout

import java.awt.*;
import javax.swing.*;
public class Border_LayoutDemo extends JFrame{
   Border_LayoutDemo(){
	  setLayout(new BorderLayout());
	  add(new JButton("North"),BorderLayout.NORTH);
	   add(new JButton("South"),BorderLayout.SOUTH);
	    add(new JButton("West"),BorderLayout.WEST);
		 add(new JButton("EAST"),BorderLayout.EAST);
		  add(new JButton("Center"),BorderLayout.CENTER);
	  
      setSize(500,200);
	  setVisible(true);
   }
   public static void main(String args[]){
	   new Border_LayoutDemo();
   }
}