package projet;

public abstract class Mobile  extends Element {
	
	protected Position position;
	protected Configuration configuration;
	
	
	public Mobile(Type type, Configuration configuration, Position position) {
		super(type);
		this.configuration=configuration;
		this.position=position;
	}
	
	public Mobile(Configuration configuration, Position position) {
		super(null);
		this.configuration=configuration;
		this.position=position;
	}
	
	public boolean setPosition(Position p) {
		this.position=p;
		return true;
	}
	
	
	public Position getPosition() {
		return position;
	}
	
	
}
