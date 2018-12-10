import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class southPanel extends JPanel{
	
	
	
	
	
	public southPanel(JButton hideMines,JButton hidePath, JButton giveUp, JButton newGame, TextField gameSize){
		
		Panel southPanel = new Panel();
		
		
		southPanel.add(hideMines);
		
		
		southPanel.add(hidePath);
		
		
		southPanel.add(giveUp);
		southPanel.add(newGame);
		
		
		southPanel.add(gameSize);
		
		add(southPanel);
		
		
	}
	


}
