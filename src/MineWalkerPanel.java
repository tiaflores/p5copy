
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class MineWalkerPanel extends JPanel {


	
	
	private MineFieldPanel board;
	//private MineFieldPanel board2;
	private JButton hideMines  = new JButton();
	private JButton hidePath  = new JButton();
	private JButton giveUp  = new JButton("Give Up?");
	private JButton newGame = new JButton("New Game");
	private TextField gameSize = new TextField();
	private final String[] hideMinesText = {"Show Mines", "Hide Mines"};
	private final String[] hidePathText = {"Show Path", "Hide Path"};
	private int hideMinesIndex;
	private int hidePathIndex;
	private JLabel score = new JLabel("Score: ");
	private JLabel lives = new JLabel("Lives: ");

	
	public MineWalkerPanel(int width, int height)
	{
		
		board = new MineFieldPanel(width, height);
		setLayout(new BorderLayout());
		
		
		
		this.add(board);
		
		
		this.add(new southPanel(hideMines, hidePath, giveUp, newGame, gameSize), BorderLayout.SOUTH);
		
		
		hideMines.setText(hideMinesText[hideMinesIndex]);
		hidePath.setText(hidePathText[hidePathIndex]);
		
		giveUp.addActionListener(new giveUpListener());
		hidePath.addActionListener( new hidePathListener());
		hideMines.addActionListener(new hideMinesListener());
		newGame.addActionListener(new newGameListener());
		
		this.add(new westPanel(), BorderLayout.WEST);
		this.add(new scoreBoard(score, lives), BorderLayout.EAST);
		
		
	}
	

	
	
	
	private class hideMinesListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			hideMinesIndex = (hideMinesIndex + 1) % hideMinesText.length;
			hideMines.setText(hideMinesText[hideMinesIndex]);
			
			
			if(hideMines.getText() == hideMinesText[0]) {
				board.hideMines();
			}
			
			else if(hideMines.getText() == hideMinesText[1]) {
				board.showMines();
			}
			
			
		}
		
	}
	
	private class hidePathListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			hidePathIndex = (hidePathIndex + 1) % hidePathText.length;
			hidePath.setText(hidePathText[hidePathIndex]);
			
			if(hidePath.getText() == hidePathText[0]) {
				board.hidePath();
			}
			
			if(hidePath.getText() == hidePathText[1]) {
				board.showPath();
			}
			
		}
	}
	
	
	private class giveUpListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
			
		}
		
	}
	
	private class newGameListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	
			String textsize = gameSize.getText();
			int size = Integer.parseInt(textsize);
			
			remove(board);
			revalidate();
			
			board = new MineFieldPanel(size,size);
			add(board, BorderLayout.CENTER);
			board.repaint();
			
			
			
			
			
		}
		
	}
	
	
	
	
	
	
}