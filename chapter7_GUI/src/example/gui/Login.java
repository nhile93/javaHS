package example.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField text_username;
	private JTextField txt_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("DEMO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User name");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 22, 72, 14);
		contentPane.add(lblNewLabel);
		
		text_username = new JTextField();
		text_username.setBackground(new Color(51, 102, 153));
		text_username.setBounds(106, 11, 192, 36);
		contentPane.add(text_username);
		text_username.setColumns(10);
		
		JLabel lbl_password = new JLabel("Pass Word");
		lbl_password.setBounds(10, 93, 72, 14);
		contentPane.add(lbl_password);
		
		txt_password = new JTextField();
		txt_password.setColumns(10);
		txt_password.setBackground(new Color(51, 102, 153));
		txt_password.setBounds(106, 79, 192, 36);
		contentPane.add(txt_password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(106, 160, 91, 23);
		contentPane.add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExit.setBounds(207, 160, 91, 23);
		contentPane.add(btnExit);
	}
}
