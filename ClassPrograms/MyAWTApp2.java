//create GUI by creating object for Frame class

import java.awt.*;
import javax.swing.*;
class MyApp2{
 MyApp2(){
  JFrame f=new JFrame();
  JLabel lbl1=new JLabel("Username",JLabel.CENTER);
	lbl1.setBounds(30,50,80,20);
	lbl1.setForeground(Color.BLUE);
	lbl1.setFont(new Font("Arial", Font.BOLD, 16));
	f.add(lbl1);
	JLabel lbl2=new JLabel("Password",JLabel.CENTER);
	lbl2.setBounds(30,80,80,20);
	lbl2.setForeground(Color.BLUE);
	lbl2.setFont(new Font("Arial", Font.BOLD, 16));
	f.add(lbl2);
	JTextField tf1=new JTextField("Enter UserName");
	tf1.setBounds(130,50,120,20);
	f.add(tf1);
	JPasswordField tf2=new JPasswordField("Enter Password");
	tf2.setBounds(130,80,120,20);
	f.add(tf2);
	JButton btn=new JButton("Submit");
	btn.setBounds(130,230,70,30);
	//f.add(btn);
	JTextArea ta=new JTextArea("Enter your Address",5,100);
	ta.setBounds(130,110,200,100);
	f.add(ta);
	JLabel lbl3=new JLabel("Address",JLabel.CENTER);
	lbl3.setBounds(30,110,80,20);
	lbl3.setForeground(Color.BLUE);
	lbl3.setFont(new Font("Arial", Font.BOLD, 16));
	f.add(lbl3);
	JLabel lbl4=new JLabel("Branch",JLabel.CENTER);
	lbl4.setBounds(30,210,80,20);
	lbl4.setForeground(Color.BLUE);
	lbl4.setFont(new Font("Arial", Font.BOLD, 16));
	f.add(lbl4);
	JCheckBox cb1=new JCheckBox("CSE",true);
	cb1.setBounds(130,210,70,30);
	f.add(cb1);
	JCheckBox cb2=new JCheckBox("AIML");
	cb2.setBounds(210,210,70,30);
	f.add(cb2);
	JCheckBox cb3=new JCheckBox("AIDS");
	cb3.setBounds(290,210,70,30);
	f.add(cb3);
	
	JLabel lbl5=new JLabel("Gender",JLabel.CENTER);
	lbl5.setBounds(30,240,80,20);
	lbl5.setForeground(Color.BLUE);
	lbl5.setFont(new Font("Arial", Font.BOLD, 16));
	f.add(lbl5);
	ButtonGroup bg=new ButtonGroup();
	JRadioButton rb1=new JRadioButton("Male",true);
	rb1.setBounds(130,240,70,30);
	bg.add(rb1);
	JRadioButton rb2=new JRadioButton("Female");
	rb2.setBounds(210,240,70,30);
	bg.add(rb2);
	JRadioButton rb3=new JRadioButton("Others");
	rb3.setBounds(290,240,70,30);
	bg.add(rb3);
	f.add(rb1);
	f.add(rb2);
	f.add(rb3);
	
	
  f.setSize(1000,500);
  f.setTitle("My First AWT GUI");
  f.setLayout(null);
  f.setVisible(true);
 }
}
public class MyAWTApp2 {
 public static void main(String args[])
 {
   MyApp2 ma=new MyApp2(); 
 }
}