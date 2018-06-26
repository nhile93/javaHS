package layouts;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GridLayoutTest extends JFrame{
	
	JLabel lbl_a, lbl_b, lbl_result;
	JTextField txt_a, txt_b;
	JTextArea txt_result;
	JButton btn_solve, btn_exit;
	
	GridLayout gridLayout;
	
	public GridLayoutTest() {
		gridLayout = new GridLayout(4, 2, 5, 5);
		this.setLayout(gridLayout);
		
		lbl_a = new JLabel("He so A");
		lbl_b = new JLabel("He so B");
		lbl_result = new JLabel("Ket wa:");
		
		txt_a = new JTextField();
		txt_b = new JTextField();
		txt_result = new JTextArea(5,20);
		
		btn_solve = new JButton("Giai PT");
		btn_exit = new JButton("Thoat");
		
		btn_solve.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = txt_a.getText();
				String b = txt_b.getText();
				
				int hs_a = Integer.parseInt(a);
				int hs_b = Integer.parseInt(b);
				
				if(hs_a == 0 && hs_b == 0) {
					txt_result.setText("pt vo so nghiem");
				}
				else{
					if(hs_a == 0 && hs_b != 0) {
						txt_result.setText("pt co vo nghiem");
					}
					else {
						float x =(float)hs_b/hs_a;
						Float f = new Float(x);
						
						String x_print = f.toString();
						txt_result.setText(x_print);
					}
				}
			}
		});
		
		this.getContentPane().add(lbl_a);
		this.getContentPane().add(txt_a);
		
		this.getContentPane().add(lbl_b);
		this.getContentPane().add(txt_b);
		
		this.getContentPane().add(lbl_result);
		this.getContentPane().add(txt_result);
		
		this.getContentPane().add(btn_solve);
		this.getContentPane().add(btn_exit);
		
		setTitle("Giai Pt");
		setSize(300,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		GridLayoutTest gr = new GridLayoutTest();

	}

}
