package chapter4_GUI;
import java.awt.*;
import java.awt.Font;
import javax.swing.*;
public class sum_N_number {
	//variables
	JFrame mainFrame;
	JPanel centerPanel, upperPanel;
	JButton btn_cal;
	JLabel lb_header, lb_enterArray, lb_result;
	JTextField txt_enterArray, txt_result;
	
	public sum_N_number() {
		mainFrame = new JFrame("Sum N Program");
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setSize(800, 500);
		mainFrame.setVisible(true);
		
		upperPanel = new JPanel();
		centerPanel = new JPanel();
		mainFrame.add(upperPanel, BorderLayout.NORTH);
		mainFrame.add(centerPanel, BorderLayout.CENTER);
		
		lb_header = new JLabel("Sum N number from user enter data");
		lb_header.setFont(new Font("Arial", Font.BOLD, 18));
		upperPanel.add(lb_header);
		
		lb_enterArray = new JLabel("Enter list of number want to sum");
		txt_enterArray = new JTextField();
		txt_enterArray.setPreferredSize(new Dimension (280,30));
		
		btn_cal = new JButton("SUM");
		
		lb_result = new JLabel("Result:");
		txt_result = new JTextField();
		txt_result.setPreferredSize(new Dimension (100,30));
		
		centerPanel.add(lb_enterArray);
		centerPanel.add(txt_enterArray);
		centerPanel.add(btn_cal);
		centerPanel.add(lb_result);
		centerPanel.add(txt_result);
	}
	
	public static void main(String[] args) {
		sum_N_number sm = new sum_N_number();

	}

}
