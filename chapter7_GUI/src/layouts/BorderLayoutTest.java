package layouts;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutTest {
	
	JFrame fr_main;
	FlowLayout fl;
	BorderLayout bd;
	JButton btn1, btn2, btn3;
	JPanel bottomCommwnd, centerPanel;
	
	public BorderLayoutTest() {
		fr_main = new JFrame("Demo FlowLayout");
		fl = new FlowLayout();
		bd = new BorderLayout();
		
		bottomCommwnd = new JPanel();
		bottomCommwnd.setLayout(fl);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(fl);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		
		bottomCommwnd.add(btn1);
		bottomCommwnd.add(btn2);
		bottomCommwnd.add(btn3);
		
		fr_main.setLayout(bd);
		fr_main.getContentPane().add(centerPanel, BorderLayout.NORTH);
		fr_main.getContentPane().add(bottomCommwnd, BorderLayout.SOUTH);
		
		fr_main.setVisible(true);
		fr_main.setSize(300, 300);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest fa = new BorderLayoutTest();
	}

}
