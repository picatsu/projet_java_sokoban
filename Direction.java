package projet;
import java.util.ArrayList;

public class Direction {
	private int dx;
	private int dy;
	
	
	public Direction( int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}
	
	public ArrayList<Direction> getDirections(){
		ArrayList<Direction> aa= new ArrayList<Direction>();
		aa.add(new Direction(0,-1));
		aa.add(new Direction(0,1));
		aa.add(new Direction(-1,0));
		aa.add(new Direction(1,0));
		return aa;
	}
	
	public int getdx() {
		return this.dx;
	}
	
	public int getdy() {
		return this.dy;
	}
	
	
}
