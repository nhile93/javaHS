package chapter3_GUI;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class Exercise4_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txt_from_input;
	private JTextField txt_to_input;
	private JTextField txt_result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise4_GUI frame = new Exercise4_GUI();
					frame.setVisible(true);
					frame.setTitle("Prime number");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Exercise4_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_input = new JLabel("Enter list number wanto show prime number: ");
		lbl_input.setBounds(10, 32, 414, 14);
		contentPane.add(lbl_input);
		
		txt_from_input = new JTextField();
		txt_from_input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
			}
		});
		txt_from_input.setBounds(43, 70, 46, 20);
		contentPane.add(txt_from_input);
		txt_from_input.setColumns(10);
		
		JLabel lbl_from_input = new JLabel("From");
		lbl_from_input.setBounds(10, 73, 60, 14);
		contentPane.add(lbl_from_input);
		
		txt_to_input = new JTextField();
		txt_to_input.setColumns(10);
		txt_to_input.setBounds(157, 70, 46, 20);
		
		contentPane.add(txt_to_input);
		
		JLabel lbl_to_input = new JLabel("To");
		lbl_to_input.setBounds(128, 73, 32, 14);
		contentPane.add(lbl_to_input);
		
		JLabel lblListPrimeNumber = new JLabel("List prime number is:");
		lblListPrimeNumber.setBounds(10, 113, 128, 14);
		contentPane.add(lblListPrimeNumber);
		
		txt_result = new JTextField();
		txt_result.setBounds(10, 143, 414, 30);
		contentPane.add(txt_result);
		txt_result.setColumns(10);
		
		JButton btn_check = new JButton("check");
		btn_check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
								
				int start_number = Integer.parseInt(txt_from_input.getText());
				int end_number = Integer.parseInt(txt_to_input.getText());
				
				//first solve				
				ArrayList<Integer> prime_number_array = new ArrayList<>();
				
				for(int i=start_number; i<=end_number; i++) {
					if(check_prime_number(i)) {
						prime_number_array.add(i);
					}
				}
				
				
				//second solve
				/*
				int prime_number_array[] = new int[end_number];
				for(int i=start_number; i<=end_number; i++) {
					if(check_prime_number(i)) {
						for(int j=0; j<prime_number_array.length; j++) {
							prime_number_array[j] = i;
						}
					}
				}
				*/
			  
				String s="";
				int len=0;
				for(Integer i : prime_number_array) {
					
					len++;
					if(len == prime_number_array.size())
					{
						s+=i.toString();
					}else {
						
						s+=i.toString()+", ";
					}
				}
				txt_result.setText(s);
			}
		});
		
		btn_check.setBounds(266, 69, 89, 23);
		contentPane.add(btn_check);
	}
	
	public boolean check_prime_number(int so) {
		boolean ch = true;
		for(int i=2; i<=so-1; i++) {
			if(so % i == 0) {
				ch = false;
				break;
			}
		}
		return ch;
	}
}
