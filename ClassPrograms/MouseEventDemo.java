/*
MouseEvent:
  MouseListener:
			MouseEntered
			MouseExited
			MouseClick
			MousePress
  MouseMotionListener
            MouseDragged
			MouseMove
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends JFrame implements MouseListener,MouseMotionListener{
	JLabel lbl1;
	MouseEventDemo(){
		setLayout(new FlowLayout());
		lbl1=new JLabel("Event Showing Here....!");
		//lbl1.setBounds(100,100,80,20);
		lbl1.setForeground(Color.BLUE);
		lbl1.setFont(new Font("Arial", Font.BOLD, 16));
		add(lbl1);
		addMouseListener(this);
		addMouseMotionListener(this);
		setVisible(true);
		setSize(1000,500);
	//	setLayout(null);
	}
	public void mouseEntered(MouseEvent me){
		lbl1.setText("Mouse Entered.....!");
	}
	public void mouseExited(MouseEvent me){
		lbl1.setText("Mouse Exited.....!");
	}
	public void mouseClicked(MouseEvent me){
		lbl1.setText("Mouse Clicked at ("+me.getX()+","+me.getY()+").....!");
	}
	public void mouseReleased(MouseEvent me){
		lbl1.setText("Mouse Released.....!");
	}
	public void mousePressed(MouseEvent me){
		lbl1.setText("Mouse Pressed.....!");
	}
	public void mouseDragged(MouseEvent me){
		lbl1.setText("Mouse Dragged.....!");
	}
	public void mouseMoved(MouseEvent me){
		lbl1.setText("Mouse Moved.....!");
	}
	public static void main(String args[]){
		new MouseEventDemo();
	}
}	