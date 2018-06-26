package chapter3_GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

public class Exercise5_GUI extends JFrame {

	private JPanel contentPane;
	private JComboBox cbb_number;
	private JPanel pn_top, pn_main;
	private JTextArea txt_area1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise5_GUI frame = new Exercise5_GUI();
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
	public Exercise5_GUI() {
		setTitle("Number Table");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pn_top = new JPanel();
		pn_top.setBounds(12, 13, 408, 45);
		contentPane.add(pn_top);
		pn_top.setLayout(null);
		
		JLabel lbl_table = new JLabel("Table");
		lbl_table.setBounds(142, 13, 54, 15);
		lbl_table.setFont(new Font("Arial", Font.PLAIN, 14));
		pn_top.add(lbl_table);
		
		cbb_number = new JComboBox();
		cbb_number.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3","4","5","6","7","8","9","10"}));
		
		cbb_number.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x = cbb_number.getSelectedItem().toString();
				String[] result = new String[10];
				int nparse = Integer.parseInt(x);
				int num;
				for(int i=1; i<=10; i++) {
					result[i-1] = (x + " x " + i + " = " +nparse*i+ "\n");
				}
				String last_result="";
				for(String s : result) {
					last_result += s;
				}
				txt_area1.setText(last_result);
			}
		});
		
		cbb_number.setMaximumRowCount(10);
		
		cbb_number.setFont(new Font("Arial", Font.PLAIN, 14));
		cbb_number.setBounds(208, 9, 54, 22);
		pn_top.add(cbb_number);
		
		pn_main = new JPanel();
		pn_main.setBounds(12, 69, 408, 371);
		contentPane.add(pn_main);
		pn_main.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		txt_area1 = new JTextArea();
		txt_area1.setRows(15);
		txt_area1.setColumns(20);
		txt_area1.setMargin(new Insets (10,10,10,10));
		//txt_area1.setBorder(new LineBorder (Color.BLACK));
		txt_area1.setFont(new Font("Arial", Font.PLAIN, 14));
	    
		txt_area1.setLineWrap(true);
		txt_area1.setWrapStyleWord(true);
		txt_area1.setEditable(false);
		pn_main.add(txt_area1);
	}
	
	public void getValue_cbb() {
		
	}
}
