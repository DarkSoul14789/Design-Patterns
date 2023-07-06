package prototypePattern;

public class PrototypePattern {

	public static void main(String[] args) {
		
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape) ShapeCache.getShape("Circle");
		System.out.println("Shape: "+clonedShape.getType());
		
		Shape clonedShape1 = (Shape) ShapeCache.getShape("Rectangle");
		System.out.println("Shape: "+clonedShape1.getType());

	}

}
