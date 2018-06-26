package excercise;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JFrame {

	JPanel p=new JPanel();
	JButton buts[] =new JButton [5];
			
     public Test() {
		
		
		
		for(int i=0;i<5;i++) {
			
			JButton b =new JButton("Button " +i);
			p.add(b);
			
	        buts[i] = b;
		}
		
		
		getContentPane().add(p);
		setSize(300,300);
		setVisible(true); 
	}
	public static void main(String[] args) {
		Test t=new Test();

	}

}
