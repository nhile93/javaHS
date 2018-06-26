package chapter8_events;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class MouseEventDemo extends JFrame {
	
	JPanel pn_command, pn_main;
	JLabel lbl_msg;
	
	public MouseEventDemo(){
		
		pn_command = new JPanel();
		pn_main = new JPanel();
		lbl_msg = new JLabel("Messenger");
		pn_command.add(lbl_msg);
		
		//dk bo nghe  = register listener
		pn_main.addMouseMotionListener(new MouseLis());
		
		getContentPane().add(pn_command, BorderLayout.SOUTH);
		getContentPane().add(pn_main, BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		setTitle("Mouse Event Demo");
	}
	
	class MouseLis implements MouseMotionListener {
		@Override
		public void mouseDragged(MouseEvent e) {
			
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			
			String s = "";
			s = "At X:" + e.getX() + " At Y:" + e.getY();
			lbl_msg.setText(s);
			
		}
	}
	
	public static void main(String[] args) {
		MouseEventDemo demo = new MouseEventDemo();

	}

}
