package projet;

public class Element {
	protected Type type;
	
		public Element(Type type) {
			this.type =type;
		}
		
		public Type getType() {
			return type;
		}
		
		public boolean bougerVers(Direction d) {
			if(this instanceof Mur)
				return false;
				
			
			if (this instanceof Case) {
				System.out.println("deplacer une case ? really nigga ?");
				return true;
			}
			if (this instanceof Caisse) {
				Position p = new Position(this.getPosition().getx() + d.getdx(), this.getPosition().gety() +d.getdy());
				if(p.estVide()) {
					this.setPosition(p);
					return true;
				}
				else {
					return false;
				}
			if (this instanceof Joueur) {
				Position p = new Position(this.getx() + d.getdx(), this.gety() +d.getdy());
				if(p.estVide() == true || (this.add(d)) instanceof Caisse && (this.add(d)).estVide()) {
					(this.add(d)).setPosition((this.add(d)).add(d));
					this.setPosition(d);
					return true;
					
					}
				else {
					return false;
					}
				}
			}
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
