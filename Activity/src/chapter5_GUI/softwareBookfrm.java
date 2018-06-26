package chapter5_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class softwareBookfrm extends JFrame {

	private JPanel contentPane;
	private JTextField txt_author, txt_title,  txt_price, txt_numofpage, txt_stock, txt_version, txt_name;
	private JLabel lbl_author, lbl_name, lbl_title, lbl_price, lbl_numofpage, lbl_stock, lbl_version;
	private JButton btn_save, btn_clear, btn_exit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					softwareBookfrm frame = new softwareBookfrm();
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
	public softwareBookfrm() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				setVisible(false);
			}
		});
		setTitle("Soft Ware Management");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_author = new JLabel("Author");
		lbl_author.setBounds(10, 42, 70, 19);
		contentPane.add(lbl_author);
		
		txt_author = new JTextField();
		txt_author.setBounds(84, 41, 194, 20);
		txt_author.setMargin(new Insets (3,3,3,3));
		contentPane.add(txt_author);
		txt_author.setColumns(10);
		
		txt_title = new JTextField();
		txt_title.setColumns(10);
		txt_title.setBounds(84, 72, 348, 20);
		txt_title.setMargin(new Insets (3,3,3,3));
		contentPane.add(txt_title);
		
		lbl_title = new JLabel("Title");
		lbl_title.setBounds(10, 73, 70, 19);
		contentPane.add(lbl_title);
		
		lbl_price = new JLabel("Price");
		lbl_price.setBounds(10, 104, 44, 19);
		contentPane.add(lbl_price);
		
		txt_price = new JTextField();
		txt_price.setColumns(10);
		txt_price.setBounds(84, 103, 55, 20);
		txt_price.setMargin(new Insets (3,3,3,3));
		contentPane.add(txt_price);
		
		lbl_numofpage = new JLabel("Number of pages");
		lbl_numofpage.setBounds(149, 103, 100, 19);
		contentPane.add(lbl_numofpage);
		
		txt_numofpage = new JTextField();
		txt_numofpage.setColumns(10);
		txt_numofpage.setBounds(259, 103, 55, 20);
		txt_numofpage.setMargin(new Insets (3,3,3,3));
		contentPane.add(txt_numofpage);
		
		lbl_stock = new JLabel("Stock");
		lbl_stock.setBounds(333, 104, 44, 19);
		contentPane.add(lbl_stock);
		
		txt_stock = new JTextField();
		txt_stock.setColumns(10);
		txt_stock.setBounds(377, 105, 55, 20);
		txt_stock.setMargin(new Insets (3,3,3,3));
		contentPane.add(txt_stock);
		
		lbl_version = new JLabel("Version");
		lbl_version.setBounds(312, 42, 44, 19);
		contentPane.add(lbl_version);
		
		txt_version = new JTextField();
		txt_version.setColumns(10);
		txt_version.setBounds(362, 41, 70, 20);
		contentPane.add(txt_version);
		
		lbl_name = new JLabel("Name");
		lbl_name.setBounds(10, 11, 70, 19);
		contentPane.add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(84, 11, 348, 20);
		txt_name.setMargin(new Insets (3,3,3,3));
		contentPane.add(txt_name);
		
		btn_save = new JButton("Save");
		btn_save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btn_save.setBounds(10, 172, 97, 25);
		contentPane.add(btn_save);
		
		btn_clear = new JButton("Clear");
		btn_clear.setBounds(169, 172, 97, 25);
		contentPane.add(btn_clear);
		
		btn_exit = new JButton("Exit");
		btn_exit.setBounds(335, 172, 97, 25);
		contentPane.add(btn_exit);
	}
}
