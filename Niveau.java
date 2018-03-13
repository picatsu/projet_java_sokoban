package projet;
import java.util.ArrayList;

public class Niveau {
	
	private Immobile[][] grille;
	private ArrayList<Position> cibles;

	private int x;
	private int y;
	
	public Niveau(int x, int y) {
		this.x=x;
		this.y=y;
		cibles = new ArrayList<Position>(x*y);
		grille = new Immobile[x][y];
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	public Immobile[][] getgrille(){
		return this.grille;
	}
	public ArrayList<Position> getcibles(){
		return this.cibles;
	}
	
	public boolean addMur(Position p) {
		grille[p.getx()][p.gety()] = (Immobile) new Element(Type.MUR);
		return true;
	}
	
	public boolean addCible(Position p) {
		cibles.add(p);
		return true;
	}
	

	public boolean estCible(Position p) {
		
		return cibles.contains(p);
		
	}
	
	public boolean estVide(Position p) {
		
    	return this.get(p).getType() == Type.MUR;
	}
	
	
	public Element get(Position p) {
	
		return grille[p.getx()][p.gety()];
	}
	
	

}
