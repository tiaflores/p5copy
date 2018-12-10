import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class RandomWalk implements RandomWalkInterface{

	private int gridSize;
	private boolean done;
	private Random rand;
	
	public ArrayList<Point> path = new ArrayList<Point>();
	
	private Point START;
	private Point END;
	private Point CURRENT;
	

	public RandomWalk(int Size) {
		
		gridSize = Size;
		done = false;
		rand = new Random();
		
		
		START = new Point(0, gridSize-1);
		END = new Point(gridSize -1 , 0);
		CURRENT = START;
		
		path.add(START);
		
		
	}
	public RandomWalk(int Size, long seed) {
		gridSize = Size;
		rand = new Random(seed);
		done = false;

		
		START = new Point(0, gridSize-1);
		END = new Point(gridSize -1 , 0);
		CURRENT = START;
		
		path.add(START);
	}
	public void step() {
		if(CURRENT.getLocation().x == END.getLocation().x  && CURRENT.getLocation().y == END.getLocation().y) {
			done = true;
		}
		
		else {
			
		
		int x = CURRENT.x, y = CURRENT.y;
		
		if(rand.nextInt(2) == 1) {
			if(x+1 <= gridSize - 1) {
				x++;
			}
			else {
				y--;
			}
		}
		else {
			if(y-1 >= 0) {
				y--;
			}
			else {
				x++;
			}
		}
		
		CURRENT = new Point(x,y);
		path.add(CURRENT);
		
		}
		
	}
	public void createWalk(){
		while(!done) {
			step();
		}
		
	}

	
	public boolean isDone() {
		return done;
	}

	public int getGridSize() {
		return gridSize;
	}

	public Point getStartPoint() {
		return START;
	}


	public Point getEndPoint() {
		return END;
	}

	
	public Point getCurrentPoint() {
		return CURRENT;
	}

	
	public ArrayList<Point> getPath(){
		ArrayList<Point> pathCopy = new ArrayList<Point>();
		
		for(Point c: path) {
			pathCopy.add(c);
		}
		return pathCopy;
	}
	
	public String toString() {
		String str = "";
		
		for(Point c: path) {
			str += " [" + c.x + ", " + c.y +"]";
		}
		return str;
	}

public void stepEC() {
		
	}
	public void createWalkEC() {
		
	}
	
	
	
}
