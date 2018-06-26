package layouts;
import javax.swing.*;
import java.awt.*;
public class FlowLayoutTest_inhirit extends JFrame {
	
	FlowLayout fl_left, fl_right;
	JButton btn1, btn2, btn3;
	
	public FlowLayoutTest_inhirit() {
		this.setTitle("Demo FlowLayout");
		
		fl_left = new FlowLayout(FlowLayout.LEFT);
		fl_right = new FlowLayout(FlowLayout.RIGHT);
		
		btn1 = new JButton("Button 1");
		btn2 = new JButton("Button 2");
		btn3 = new JButton("Button 3");
		
		this.setLayout(fl_left);
		this.getContentPane().add(btn1);
		this.getContentPane().add(btn2);
		this.getContentPane().add(btn3);
		
		this.setVisible(true);
		this.setSize(300, 300);
	}
	
	public static void main(String[] args) {
		FlowLayoutTest_inhirit fa = new FlowLayoutTest_inhirit();
	}

}
