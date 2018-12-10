
import java.awt.*;
import javax.swing.*;

public class MineWalker {

	public static void main(String[] args) {

		
		
			JFrame frame = new JFrame("Mine Walker");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


			frame.getContentPane().add(new MineWalkerPanel(10,10));
			frame.pack();
			frame.setVisible(true);
	}

}