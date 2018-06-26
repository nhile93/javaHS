package chapter4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	ENTERDATA frame;//null
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ENTER DATA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame ==null)
				{
					frame = new ENTERDATA();
					frame.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(61, 22, 171, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEW DATA");
		btnNewButton_1.setBounds(61, 68, 171, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setBounds(61, 113, 171, 23);
		contentPane.add(btnNewButton_2);
	}

}
