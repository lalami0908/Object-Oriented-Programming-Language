package hw7;

public class ShapeFactory {
	

	//	enum Type, contains 3 kinds of shapes as values.
	public enum Type{
		Triangle, Square, Circle
	}
	 /** create a object in specific type of Shape
	 * @param ShapeFactory.Type shapeType, double length
	 * @return Shape object
	 */
	
	public Shape createShape(ShapeFactory.Type shapeType, double length) {

		switch(shapeType) {
			case Triangle:
				return new Triangle(length);
			case Square:
				return new Square(length);
			case Circle:
				return new Circle(length);
			default:
				System.out.println("shapeType value error");
				return null;
		}
		
	}

}
