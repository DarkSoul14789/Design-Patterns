package prototypePattern;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeName) {
		Shape cachedShape = shapeMap.get(shapeName);
		return (Shape) cachedShape.clone();
	}
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setName("Circle");
		shapeMap.put(circle.getName(), circle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setName("Rectangle");
		shapeMap.put(rectangle.getName(), rectangle);
	}
	
}
