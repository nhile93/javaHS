package chapter5_GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;

public class hardwareBookfrm extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name, txt_author,txt_price, txt_numofpage, txt_stock, txt_category, txt_publisher;
	private JLabel lbl_name, lbl_author, lbl_price, lbl_numofpage, lbl_stock, lbl_category, lbl_publisher;
	private JButton btn_save, btn_clear, btn_exit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hardwareBookfrm frame = new hardwareBookfrm();
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
	public hardwareBookfrm() {
		setTitle("Hard Ware Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_name = new JLabel("Name");
		lbl_name.setBounds(12, 13, 70, 19);
		contentPane.add(lbl_name);
		
		txt_name = new JTextField();
		txt_name.setBounds(86, 13, 348, 20);
		txt_name.setMargin(new Insets(3, 3, 3, 3));
		txt_name.setColumns(10);
		contentPane.add(txt_name);
		
		lbl_author = new JLabel("Author");
		lbl_author.setBounds(12, 46, 70, 19);
		contentPane.add(lbl_author);
		
		txt_author = new JTextField();
		txt_author.setBounds(86, 45, 194, 20);
		txt_author.setMargin(new Insets(3, 3, 3, 3));
		txt_author.setColumns(10);
		contentPane.add(txt_author);
		
		lbl_price = new JLabel("Price");
		lbl_price.setBounds(12, 79, 44, 19);
		contentPane.add(lbl_price);
		
		txt_price = new JTextField();
		txt_price.setBounds(86, 78, 55, 20);
		txt_price.setMargin(new Insets(3, 3, 3, 3));
		txt_price.setColumns(10);
		contentPane.add(txt_price);
		
		lbl_numofpage = new JLabel("Number of pages");
		lbl_numofpage.setBounds(151, 78, 100, 19);
		contentPane.add(lbl_numofpage);
		
		txt_numofpage = new JTextField();
		txt_numofpage.setBounds(261, 78, 55, 20);
		txt_numofpage.setMargin(new Insets(3, 3, 3, 3));
		txt_numofpage.setColumns(10);
		contentPane.add(txt_numofpage);
		
		lbl_stock = new JLabel("Stock");
		lbl_stock.setBounds(335, 79, 44, 19);
		contentPane.add(lbl_stock);
		
		txt_stock = new JTextField();
		txt_stock.setBounds(379, 80, 55, 20);
		txt_stock.setMargin(new Insets(3, 3, 3, 3));
		txt_stock.setColumns(10);
		contentPane.add(txt_stock);
		
		lbl_category = new JLabel("Category");
		lbl_category.setBounds(302, 46, 61, 19);
		contentPane.add(lbl_category);
		
		txt_category = new JTextField();
		txt_category.setBounds(364, 46, 70, 20);
		txt_category.setColumns(10);
		contentPane.add(txt_category);
		
		lbl_publisher = new JLabel("Publisher");
		lbl_publisher.setBounds(12, 112, 70, 19);
		contentPane.add(lbl_publisher);
		
		txt_publisher = new JTextField();
		txt_publisher.setBounds(86, 111, 100, 20);
		txt_publisher.setMargin(new Insets(3, 3, 3, 3));
		txt_publisher.setColumns(10);
		contentPane.add(txt_publisher);
		
		btn_save = new JButton("Save");
		btn_save.setBounds(12, 177, 97, 25);
		contentPane.add(btn_save);
		
		btn_clear = new JButton("Clear");
		btn_clear.setBounds(171, 177, 97, 25);
		contentPane.add(btn_clear);
		
		btn_exit = new JButton("Exit");
		btn_exit.setBounds(337, 177, 97, 25);
		contentPane.add(btn_exit);
	}
}
