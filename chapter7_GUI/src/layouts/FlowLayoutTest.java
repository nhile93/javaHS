package layouts;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutTest {
	
	JFrame fr_main;
	FlowLayout fl_left, fl_right;
	JButton btn1, btn2, btn3;
	
	public FlowLayoutTest() {
		fr_main = new JFrame("Demo FlowLayout");
		
		fl_left = new FlowLayout(FlowLayout.LEFT);
		fl_right = new FlowLayout(FlowLayout.RIGHT);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		
		fr_main.setLayout(fl_right);
		fr_main.getContentPane().add(btn1);
		fr_main.getContentPane().add(btn2);
		fr_main.getContentPane().add(btn3);
		
		fr_main.setVisible(true);
		fr_main.setSize(300, 300);
	}
	
	public static void main(String[] args) {
		FlowLayoutTest fa = new FlowLayoutTest();
	}

}
