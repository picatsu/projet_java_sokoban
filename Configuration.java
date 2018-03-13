package projet;
import java.util.ArrayList;

public class Configuration {

	private ArrayList<Caisse> ar;
	private Joueur joueur;
	private Niveau niveau;
	private Position position;
	public Configuration(Niveau niveau ,Position position) {
		this.position=position;
		this.niveau=niveau;
	}
	public Configuration(Configuration c) {
		this(c.niveau, c.position);
		
	}
	
	public int getx() {
		return position.getx();
	}
	
	public int gety() {
		return position.gety();
	}
	public Niveau getNiveau() {
		return this.niveau;
	}
	
	public ArrayList<Caisse> getCaisses(){
		return this.ar;
	}
	
	// fin des ascesseurs 
	
	public boolean addCaisse(Position p) {
		
		return ar.add(new Caisse(this,p));
	}
	
	public boolean estCible(Position p) {
		
		return this.niveau.estCible(p);
	}
	
	
	public boolean estVide(Position p) {
		return this.niveau.estVide(p);
	}
	
	
	public Element getPosition(Position p) {
		
		return this.niveau.get(p);
	
	}
	
	
	public boolean bougerJoueurVers(Direction d) {
		
		return joueur.bougerVers(d);
		
	}
	
	
	public Joueur getJoeur() {
		return this.joueur;
	}
	
	
	
	
	public boolean victoire() {
		
		if (this.niveau.getcibles().contains(null) == true)
			return false;
		Immobile[][] tab = new Immobile[niveau.getX()][niveau.getY()];
		tab = niveau.getgrille();
		for(int i=0; i<niveau.getX();i++)
			for(int j=0;i<niveau.getY();j++)
				if(tab[i][j] == null ) return false;
		
		return true;
	}
	
	
	public String toString() {
		
		String mur =         "#";
		String cible =       ".";
		String casee =       " ";
		String Joeur =       "@";
		String joeurcible =  "+";
		String caisse =      "$";
		String ciassecible = "*";
	
		
		Object[][] o = new String[niveau.getX()][niveau.getY()];
		
		Immobile[][] tab = new Immobile[niveau.getX()][niveau.getY()];
		tab = niveau.getgrille();
		o[this.joueur.getPosition().getx()][this.joueur.getPosition().gety()] = Joeur;
		
		for(int i=0; i<niveau.getX();i++) {
			for(int j=0;i<niveau.getY();j++) {
				if(tab[i][j].getType() == Type.MUR)
					o[i][j] = mur ;
				if(tab[i][j].getType() == Type.CASE)
					o[i][j] = casee ;
			     }
		}	
		
		for(Caisse a : ar) {
			o[a.getPosition().getx()][a.getPosition().gety()] = caisse;
		}
		
		
		ArrayList<Position> pp = new ArrayList<Position>();
		pp = niveau.getcibles();
		for(Position a : pp) {
			if(o[a.getx()][a.gety()] == null) 
				o[a.getx()][a.gety()] = cible;
			
			if(o[a.getx()][a.gety()] == Joeur) {
				o[a.getx()][a.gety()] = joeurcible;
			}
				
			if(o[a.getx()][a.gety()] == caisse) {
				o[a.getx()][a.gety()] = ciassecible;
			}
		}
	
	
	
	
	
	}
	
	
	
	



}

