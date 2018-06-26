package chapter3_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise3 extends JFrame {

	private JPanel contentPane;
	private JTextField txt_nhap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise3 frame = new Exercise3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercise3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_nhap = new JTextField();
		txt_nhap.setBounds(10, 37, 129, 28);
		contentPane.add(txt_nhap);
		txt_nhap.setColumns(10);
		
		
		
		JLabel lbl_kq = new JLabel("New label");
		lbl_kq.setBounds(10, 120, 305, 14);
		contentPane.add(lbl_kq);
		
		JButton btnCheck = new JButton("check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				char kt = txt_nhap.getText().charAt(0);
				
				if(kt == 'a' || kt == 'e' || kt == 'o' || kt == 'i' || kt == 'u') {
					
					lbl_kq.setText("This character is vowel");
				}
				else {
					lbl_kq.setText("This character is consonant");
					
				}
			}
		});
		btnCheck.setBounds(224, 40, 91, 23);
		contentPane.add(btnCheck);
		
		
	}
}
