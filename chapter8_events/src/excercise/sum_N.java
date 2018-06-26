package excercise;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;

public class sum_N extends JFrame {
	private JTextField txt_number;
	private JTextField txt_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sum_N frame = new sum_N();
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
	public sum_N() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_number = new JLabel("Number:");
		lbl_number.setFont(new Font("Arial", Font.PLAIN, 12));
		lbl_number.setBounds(24, 25, 80, 14);
		contentPane.add(lbl_number);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Arial", Font.PLAIN, 12));
		lblResult.setBounds(24, 112, 80, 14);
		contentPane.add(lblResult);
		
		txt_number = new JTextField();
		txt_number.setFont(new Font("Arial", Font.PLAIN, 12));
		txt_number.setBounds(92, 17, 229, 32);
		contentPane.add(txt_number);
		txt_number.setColumns(10);
		
		txt_result = new JTextField();
		txt_result.setFont(new Font("Arial", Font.PLAIN, 12));
		txt_result.setColumns(10);
		txt_result.setBounds(92, 104, 229, 32);
		contentPane.add(txt_result);
		
		JButton btn_cal = new JButton("Calculate");
		btn_cal.setForeground(new Color(0, 255, 255));
		btn_cal.setBackground(new Color(248, 248, 255));
		btn_cal.setFont(new Font("Arial", Font.PLAIN, 12));
		btn_cal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sum();
			}
		});
		btn_cal.setBounds(157, 63, 91, 23);
		contentPane.add(btn_cal);
	}
	
	public void sum() {
		
		String s = txt_number.getText();
		String num[] = s.split(";");
	
		int sum=0;
		
		for(String n : num) {
			int ni = Integer.parseInt(n);
			sum += ni;
		}
		
		txt_result.setText(String.valueOf(sum));
		
		//Show message box
		//JOptionPane.showMessageDialog(this, "show message", "Title", JOptionPane.CLOSED_OPTION);
	}
}
