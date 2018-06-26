package chapter5_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class libraryManagement extends JFrame {

	private JPanel contentPane;
	softwareBookfrm swb;
	hardwareBookfrm hwb;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					libraryManagement frame = new libraryManagement();
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
	public libraryManagement() {
		setTitle("Library Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_sw = new JButton("Soft Ware");
		btn_sw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(swb == null) {
					swb = new softwareBookfrm();
					swb.setVisible(true);
				}
			}
		});
		btn_sw.setBounds(124, 31, 91, 23);
		contentPane.add(btn_sw);
		
		JButton btn_hw = new JButton("Hard Ware");
		btn_hw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(hwb == null) {
					hwb = new hardwareBookfrm();
					hwb.setVisible(true);
				}
			}
		});
		btn_hw.setBounds(249, 31, 91, 23);
		contentPane.add(btn_hw);
	}

}
