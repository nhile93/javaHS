package layouts;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutTest_2 {
	
	JFrame fr_main;
	FlowLayout fl_left, fl_right;
	BorderLayout bd;
	JButton btn1, btn2, btn3;
	
	public BorderLayoutTest_2() {
		fr_main = new JFrame("Demo FlowLayout");
		
		bd = new BorderLayout();
		/*fl_left = new FlowLayout(FlowLayout.LEFT);
		fl_right = new FlowLayout(FlowLayout.RIGHT);*/
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		
		fr_main.setLayout(bd);
		fr_main.getContentPane().add(btn1, BorderLayout.NORTH);
		fr_main.getContentPane().add(btn2, BorderLayout.WEST);
		fr_main.getContentPane().add(btn3, BorderLayout.EAST);
		
		fr_main.setVisible(true);
		fr_main.setSize(300, 300);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest_2 fa = new BorderLayoutTest_2();
	}

}
