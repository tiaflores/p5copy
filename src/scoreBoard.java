import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class scoreBoard extends JPanel{

	public scoreBoard(JLabel lives, JLabel score) {
		
		
		 JPanel scoreBoard = new JPanel(new GridLayout(2,1,0,40));
		    Border gray = BorderFactory.createLineBorder(Color.gray);
		    scoreBoard.setBorder(BorderFactory.createTitledBorder(gray, "ScoreBoard"));

		    scoreBoard.add(score);
		    scoreBoard.add(lives);
		    
		  
		    add(scoreBoard);
		
		
		
		
		
	}
	
}
