package chapter6_exception;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DIV extends JFrame {

	private JPanel contentPane;
	private JTextField txt_a;
	private JTextField txt_b;
	JTextField txt_result; //

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DIV frame = new DIV();
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
	public DIV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setBounds(10, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		txt_a = new JTextField();
		txt_a.setBounds(74, 38, 190, 20);
		contentPane.add(txt_a);
		txt_a.setColumns(10);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(10, 69, 46, 14);
		contentPane.add(lblB);
		
		txt_b = new JTextField();
		txt_b.setColumns(10);
		txt_b.setBounds(74, 66, 190, 20);
		contentPane.add(txt_b);
		
		JButton btnNewButton = new JButton("DIV");
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					int a =Integer.parseInt(txt_a.getText());//""
					int b= Integer.parseInt(txt_b.getText());
					
					int c = a/b;
					
					txt_result.setText(""  +c);
				
				}catch (Exception e) {
					
					
					JOptionPane.showMessageDialog(null, "Check a,b", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(74, 97, 91, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Result");
		lblNewLabel_1.setBounds(10, 146, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		
		 txt_result = new JTextField();//<> null
		txt_result.setBounds(74, 143, 190, 20);
		contentPane.add(txt_result);
		txt_result.setColumns(10);
	}
}
