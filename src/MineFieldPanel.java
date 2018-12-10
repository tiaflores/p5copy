import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MineFieldPanel extends JPanel {

	public MineFieldButton[][] grid;
	private MineFieldButton button;
	private MineFieldButton end;
	private MineFieldButton start;
	private MineFieldButton pathway;
	private MineFieldButton bomb;
	public RandomWalk walk;

	
	
	public MineFieldPanel(int width, int height) {
		
		
		
		grid = new MineFieldButton[width][height];
				
		
		this.setLayout(new GridLayout(width,height));
		
				for(int row=0; row < grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
				button = new MineFieldButton(row, col);
				grid[row][col] = button;
				this.add(button);
				button.setPreferredSize(new Dimension (75,75));
				button.setBackground(Color.white);
				
				button.setEnabled(false);	
				
				Random rand = new Random();
				int b = rand.nextInt(5)+1;
				
				if(b <= 2) {
					grid[row][col].setBomb();
				}
				
				button.addActionListener(new MineFieldListener());
					
			}
			
		}
				
				walk = new RandomWalk(width);
				
				walk.createWalk();
				System.out.println(walk.toString());
				
				
				for(Point c : walk.getPath()) {
					pathway = grid[(int) c.getX()][(int) c.getY()];
					pathway.setNotBomb();
				}
		
				end = grid[0][grid.length-1];
				end.setBackground(Color.magenta);
				
				start = grid[grid.length-1][0];
				start.setBackground(Color.cyan);
				start.setEnabled(true);
								
	}
	
	
	public class MineFieldListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			MineFieldButton clicked = (MineFieldButton) e.getSource();
			
			
			System.out.println("(" + clicked.getRow() +  ","  + clicked.getCol() + ")");
			
			if(clicked.getRow() - 1 >= 0) {
				grid[clicked.getRow() - 1][clicked.getCol()].setEnabled(true);
			}
			
			if(clicked.getRow() + 1 < grid.length) {
				grid[clicked.getRow() + 1][clicked.getCol()].setEnabled(true);
				
			}
			
			
			if(clicked.getCol() - 1 >= 0) {
				grid[clicked.getRow()][clicked.getCol() - 1].setEnabled(true);
				
			}
			
			if(clicked.getCol() + 1 < grid.length) {
				grid[clicked.getRow()][clicked.getCol() + 1].setEnabled(true);
				
			}

			
		}}
	

	
	public void hideMines() {
		
		for(int row=0; row < grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
				
				if(grid[row][col].checkIsBomb() == true) {
					grid[row][col].hideMines();
					
				}
			}
		}
	}
	
	
	public void showMines() {
		for(int row=0; row < grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
				
				if(grid[row][col].checkIsBomb() == true) {
					grid[row][col].showMines();
					
				}
			}
		}
	}
	
	
	public void hidePath() {
		for(int row=0; row < grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
		
				for(Point c : walk.getPath()) {
					pathway = grid[(int) c.getX()][(int) c.getY()];
					
					if(grid[row][col] == pathway) {
						
						grid[row][col].hidePath();
						
					}
					
				}
				
				end = grid[0][grid.length-1];
				end.setBackground(Color.magenta);
				
				start = grid[grid.length-1][0];
				start.setBackground(Color.cyan);
				start.setEnabled(true);
				
			}
		}
	}
	
	public void showPath() {
		for(int row=0; row < grid.length; row++) {
			for(int col=0; col < grid[row].length; col++) {
		
				for(Point c : walk.getPath()) {
					pathway = grid[(int) c.getX()][(int) c.getY()];
					
					if(grid[row][col] == pathway) {
						
						grid[row][col].showPath();
						
					}
				}
				
				end = grid[0][grid.length-1];
				end.setBackground(Color.magenta);
				
				start = grid[grid.length-1][0];
				start.setBackground(Color.cyan);
				start.setEnabled(true);
				
			}
		}
	}
	
	
}
