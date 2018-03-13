package projet;
import java.util.ArrayList;

public class Joueur extends Mobile{
	protected ArrayList<Direction> histo;
	
	public Joueur(Configuration configuration, Position position) {
		super(configuration,position);
		histo = new ArrayList<Direction>();
	}
	
	public Joueur(Configuration configuration, Joueur joeur) {
		this(configuration, joeur.position);
	}
}
