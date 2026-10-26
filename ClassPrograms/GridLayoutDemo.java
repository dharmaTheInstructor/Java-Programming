// Demo for GridLayout

import java.awt.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame{
	GridLayoutDemo(){
		setLayout(new GridLayout(5,10));
		for(int i=1;i<=50;i++)
		add(new JButton("Button"+i));
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String args[]){
			new GridLayoutDemo();
	}
}