package chapter4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ENTERDATA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ENTERDATA frame = new ENTERDATA();
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
	public ENTERDATA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployeeid = new JLabel("EmployeeID");
		lblEmployeeid.setBounds(29, 25, 121, 14);
		contentPane.add(lblEmployeeid);
		
		textField = new JTextField();
		textField.setBounds(146, 22, 121, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmployeename = new JLabel("EmployeeName");
		lblEmployeename.setBounds(29, 53, 121, 14);
		contentPane.add(lblEmployeename);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(146, 50, 225, 20);
		contentPane.add(textField_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(146, 239, 91, 23);
		contentPane.add(btnSave);
	}

}
