import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class westPanel extends JPanel{
	
	public westPanel(){
		
		Panel westPanel = new Panel();
		
		westPanel.setLayout(new GridLayout(7,1,0,0));
		
		Button green = new Button("0 Nearby Mines");
		Button yellow = new Button("1 Nearby Mines");
		Button orange = new Button("2 Nearby mines");
		Button red = new Button("3 Nearby Mines");
		Button black = new Button("Exploded Mine");
		
		Button start = new Button("Start");
		Button destination = new Button("Destination");
		
		green.setBackground(Color.green);
		westPanel.add(green);
		green.setPreferredSize(new Dimension(100,100));
		green.setEnabled(false);
		
		yellow.setBackground(Color.yellow);
		westPanel.add(yellow);
		yellow.setPreferredSize(new Dimension(100,100));
		yellow.setEnabled(false);
		
		orange.setBackground(Color.orange);
		westPanel.add(orange);
		orange.setPreferredSize(new Dimension(100,100));
		orange.setEnabled(false);
		
		red.setBackground(Color.red);
		westPanel.add(red);
		red.setPreferredSize(new Dimension(100,100));
		red.setEnabled(false);
		
		black.setBackground(Color.black);
		westPanel.add(black);
		black.setForeground(Color.white);
		black.setPreferredSize(new Dimension(100,100));
		black.setEnabled(false);
		
		start.setBackground(Color.cyan);
		westPanel.add(start);
		start.setPreferredSize(new Dimension(100,100));
		start.setEnabled(false);
		
		destination.setBackground(Color.magenta);
		westPanel.add(destination);
		destination.setPreferredSize(new Dimension(100,100));
		destination.setEnabled(false);
		
		
		
		
		add(westPanel);
		
	}

}
