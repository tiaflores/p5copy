import javax.swing.*;
import java.awt.*;


public class MineFieldButton extends JButton {

	public boolean isBomb;
	public int row;
	public int col;
	public int lives = 5;
	public int score;
	
	public MineFieldButton(int x, int y) {
		
		isBomb = false;
		
		row = x;
		col = y;
		
	}
	
	public void hideMines() {
		this.setBackground(Color.white);
	}
	
	public void showMines() {
		this.setBackground(Color.black);
	}
	
	public void showPath() {
		this.setBackground(Color.pink);
	}
	
	public void hidePath() {
		this.setBackground(Color.white);
	}
	
	public void setBomb() {
		isBomb = true;
	}
	public void setNotBomb() {
		isBomb = false;
	}
	
	public boolean checkIsBomb() {
		return isBomb;
	}
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	
	
	
	
}

