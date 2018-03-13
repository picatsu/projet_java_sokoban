package projet;

public class Position {
	private int x;
	private int y;
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Position add(Direction d) {
		
		int xx = this.x  +  d.getdx();
		int yy  = this.y + d.getdy();
		Position a = new Position(xx , yy);
		return a;
	}
	public Position sub(Direction d) {
 
		int xx = this.x  -  d.getdx();
		int yy  = this.y - d.getdy();
		Position a = new Position(xx , yy);
		return a;
	}
	
	public int getx() {
		return this.x;
	}
	
	public int gety() {
		return this.y;
	}
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if(o == null)
			return false;
		if(this.getClass() != o.getClass())
			return false;
		Position a = (Position) o;
		if(a.getx() != this.getx() )
			return false;
		if(a.gety() != this.gety())
			return false;
		return true ;
		
	}
	
	
}
