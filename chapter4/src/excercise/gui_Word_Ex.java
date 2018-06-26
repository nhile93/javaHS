package excercise;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.*;

public class gui_Word_Ex extends JFrame {

	private JPanel contentPane;
	public JTextField txt_try;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_Word_Ex frame = new gui_Word_Ex();
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
	public gui_Word_Ex() {
		setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("Words");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pn_main = new JPanel();
		pn_main.setBounds(0, 0, 442, 273);
		contentPane.add(pn_main);
		pn_main.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(207, 12, 0, 0);
		pn_main.add(label);
		
		JLabel lbl_header = new JLabel("Works");
		lbl_header.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_header.setBounds(127, 12, 80, 25);
		lbl_header.setFont(new Font("Arial", Font.BOLD, 16));
		pn_main.add(lbl_header);
		
		txt_try = new JTextField();
		txt_try.setBounds(76, 66, 86, 20);
		pn_main.add(txt_try);
		txt_try.setColumns(10);
		txt_try.setText("");
		
		
		
		JComboBox cob_WordQuantity = new JComboBox();
		cob_WordQuantity.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int m = cob_WordQuantity.getSelectedIndex();
				/*String k = Integer.toString(m);
				txt_try.setText(k);*/
				for(int i=0; i<=m; i++) {
					
					JTextField txt_a = new JTextField();
					
					
					
				}
			}
		});
		cob_WordQuantity.setForeground(Color.BLACK);
		cob_WordQuantity.setFont(new Font("Arial", Font.PLAIN, 12));
		cob_WordQuantity.setBackground(Color.LIGHT_GRAY);
		cob_WordQuantity.setToolTipText("maximun of word is 5");
		cob_WordQuantity.setMaximumRowCount(5);
		cob_WordQuantity.setBounds(224, 12, 57, 22);
		cob_WordQuantity.addItem("1");
		cob_WordQuantity.addItem("2");
		cob_WordQuantity.addItem("3");
		cob_WordQuantity.addItem("4");
		cob_WordQuantity.addItem("5");
		
		pn_main.add(cob_WordQuantity);
		
		
	}
}
