package chapter8_events;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventDemo2 extends JFrame implements ActionListener {
	
	JButton btn1, btn2;
	JPanel pn_command, pn_main;
	JLabel lbl_msg;
	
	public ActionEventDemo2(){
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		pn_command = new JPanel();
		
		pn_command.add(btn1);
		pn_command.add(btn2);
		
		pn_main = new JPanel();
		lbl_msg = new JLabel("Messenger");
		
		pn_main.add(lbl_msg);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		btn1.setActionCommand("1");
		btn2.setActionCommand("2");
		
		getContentPane().add(pn_command, BorderLayout.SOUTH);
		getContentPane().add(pn_main, BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		setTitle("Action Event Demo 2");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if(cmd.equals("1")) {
			lbl_msg.setText("Button 1 was clicked");
			btn1.setText("button 1 was clicked");
			
			
		}
		else {
			if(cmd.equals("2")) {
				lbl_msg.setText("Button 2 was clicked");
			}
		}
		
		//extend, if button2 or other was click, return original text's button
	}
	
	public static void main(String[] args) {
		ActionEventDemo2 demo = new ActionEventDemo2();

	}

}
