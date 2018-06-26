package concepts;
import javax.swing.*;
import java.awt.*;
public class JFrame_Game {
	//variables
	JFrame fr;
	JPanel mainPanel, upperPanel;
	JButton btn_play, btn_instruction, btn_exit;
	JLabel lb_header;
	
	public JFrame_Game(){
		fr = new JFrame("Game Demo");
		//fr.setTitle("Game demo");
		fr.setLayout(new BorderLayout());
		fr.setSize(500, 300);
		fr.setVisible(true);
		
		upperPanel = new JPanel();
		mainPanel = new JPanel();
		fr.add(upperPanel, BorderLayout.NORTH);
		fr.add(mainPanel, BorderLayout.CENTER);
		
		lb_header = new JLabel("CLASSIC JUMBLE WORD");
		lb_header.setFont(new Font("Arial", Font.BOLD, 28));
		
		btn_play = new JButton("PLay Game");
		btn_play.setPreferredSize(new Dimension (280,40));
		btn_instruction = new JButton("View Instruction");
		btn_instruction.setPreferredSize(new Dimension (280,40));
		btn_exit = new JButton("Exit");
		btn_exit.setPreferredSize(new Dimension (280,40));
		
		upperPanel.add(lb_header);
		
		mainPanel.add(btn_play);
		mainPanel.add(btn_instruction);
		mainPanel.add(btn_exit);
		
		
	}
	
	public static void main(String[] args) {
		JFrame_Game game_new = new JFrame_Game();

	}

}
