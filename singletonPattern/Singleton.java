package singletonPattern;

public class Singleton {

	public static void main(String[] args) {
		
		Entity instance1 = Entity.getInstance();
		System.out.println("Hashcode of instance 1: "+instance1.hashCode());
		Entity instance2 = Entity.getInstance();
		System.out.println("Hashcode of instance 2: "+instance2.hashCode());

	}

}
