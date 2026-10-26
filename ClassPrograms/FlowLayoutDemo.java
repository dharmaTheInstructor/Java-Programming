// Demo for FlowLayout

import java.awt.*;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame{
   FlowLayoutDemo(){
	   
	setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
	   
	for(int i=1;i<=50;i++)
		add(new JButton("Button"+i));
   
   setSize(500,200);
   setVisible(true);
   }
   public static void main(String args[]){
		new FlowLayoutDemo();
   }
}