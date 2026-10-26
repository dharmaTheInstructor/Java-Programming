// Handle Button Event

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEvent extends JFrame implements ActionListener {
	JTextField tf1,tf2,tf3;
	JButton btn;
  ButtonEvent(){
	setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
	tf1=new JTextField("Enter First Value:");
	add(tf1);
	tf2=new JTextField("Enter First Value:");
	add(tf2);
	tf3=new JTextField("Enter First Value:");
	add(tf3);
	btn=new JButton("Addition");
	add(btn);
	btn.addActionListener(this);
	setSize(500,200);
	setVisible(true);
  }
  public void actionPerformed(ActionEvent ae){
	  int x=Integer.parseInt(tf1.getText());
	  int y=Integer.parseInt(tf2.getText());
	  int result=x+y;
	  tf3.setText(String.valueOf(result));
  }
  
  public static void main(String args[]){
   new ButtonEvent();
  }
}