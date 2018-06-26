package concepts;
import javax.swing.*;

public class JMenu_Demo extends JFrame{
	JMenu fileMenu, editMenu, exitMenu;
	JMenuBar menuBar;
	
	public JMenu_Demo() {
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		exitMenu = new JMenu("Exit");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(exitMenu);
		
		//extends class JFrame already, so shouldn't create and call JFrame any once.
		setJMenuBar(menuBar);
		setTitle("JMenu Demo");
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		JMenu_Demo jm = new JMenu_Demo();

	}

}
