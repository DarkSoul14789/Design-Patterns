package singletonPattern;

public class Entity {
	
	private static Entity instance = new Entity();
	
	private Entity() {};
	
	public static synchronized Entity getInstance() {
		if(instance == null) {
			return new Entity();
		}
		return instance;
	}
}
