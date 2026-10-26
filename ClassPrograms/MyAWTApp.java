// create GUI by extending Frame class

import java.awt.*;
//import javax.swing.*;
class MyApp extends Frame{
  MyApp(){
	Label lbl1=new Label("Username",Label.CENTER);
	lbl1.setBounds(30,50,80,20);
	lbl1.setForeground(Color.BLUE);
	lbl1.setFont(new Font("Arial", Font.BOLD, 16));
	add(lbl1);
	Label lbl2=new Label("Password",Label.CENTER);
	lbl2.setBounds(30,80,80,20);
	lbl2.setForeground(Color.BLUE);
	lbl2.setFont(new Font("Arial", Font.BOLD, 16));
	add(lbl2);
	TextField tf1=new TextField("Enter UserName");
	tf1.setBounds(130,50,120,20);
	add(tf1);
	TextField tf2=new TextField("Enter Password");
	tf2.setBounds(130,80,120,20);
	tf2.setEchoChar('$');
	add(tf2);
	Button btn=new Button("Submit");
	btn.setBounds(130,230,70,30);
	//add(btn);
	TextArea ta=new TextArea("Enter your Address",5,100);
	ta.setBounds(130,110,200,100);
	add(ta);
	Label lbl3=new Label("Address",Label.CENTER);
	lbl3.setBounds(30,110,80,20);
	lbl3.setForeground(Color.BLUE);
	lbl3.setFont(new Font("Arial", Font.BOLD, 16));
	add(lbl3);
	Label lbl4=new Label("Branch",Label.CENTER);
	lbl4.setBounds(30,210,80,20);
	lbl4.setForeground(Color.BLUE);
	lbl4.setFont(new Font("Arial", Font.BOLD, 16));
	add(lbl4);
	Checkbox cb1=new Checkbox("CSE",true);
	cb1.setBounds(130,210,70,30);
	add(cb1);
	Checkbox cb2=new Checkbox("AIML");
	cb2.setBounds(210,210,70,30);
	add(cb2);
	Checkbox cb3=new Checkbox("AIDS");
	cb3.setBounds(290,210,70,30);
	add(cb3);
	
	Label lbl5=new Label("Gender",Label.CENTER);
	lbl5.setBounds(30,240,80,20);
	lbl5.setForeground(Color.BLUE);
	lbl5.setFont(new Font("Arial", Font.BOLD, 16));
	add(lbl5);
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox cb4=new Checkbox("CSE",true,cbg);
	cb4.setBounds(130,240,70,30);
	add(cb4);
	Checkbox cb5=new Checkbox("AIML",false,cbg);
	cb5.setBounds(210,240,70,30);
	add(cb5);
	Checkbox cb6=new Checkbox("AIDS",false,cbg);
	cb6.setBounds(290,240,70,30);
	add(cb6);
	
	setSize(1000,500);
	setLayout(null);
	setVisible(true);
  }
}
public class MyAWTApp{
 public static void main(String args[]){
  MyApp ma=new MyApp();
 }
}