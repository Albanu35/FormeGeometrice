import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// create 6 object, 2 types of shapes each
		Shape sphere = new Shape();
		Shape square = new Shape("it's a square form", "titan");
		Triangle triangle = new Triangle(20, 25);
		Triangle triangleIsoscel = new Triangle("I'm a isosceles!", "gold", 15, 10);
		Rectangle rectangle = new Rectangle(25, 35);
		Rectangle parallelepiped = new Rectangle("I'm a paralel", "silver", 50, 30);

		// create a shape arrayList
		ArrayList<Shape> geometricalShapes = new ArrayList<Shape>();
		geometricalShapes.add(sphere);
		geometricalShapes.add(square);
		geometricalShapes.add(triangle);
		geometricalShapes.add(triangleIsoscel);
		geometricalShapes.add(rectangle);
		geometricalShapes.add(parallelepiped);

		// method of toString class Shape
		System.out.println(sphere.toString());
		System.out.println(square.toString());
		System.out.println();

		// method of toString class Triangle
		System.out.println(triangle.toString());
		System.out.println(triangleIsoscel.toString());
		System.out.println();

		// method of toString class Rectangle
		System.out.println(rectangle.toString());
		System.out.println(parallelepiped.toString());
		System.out.println();

		// method getSize() for each object
		System.out.println(sphere.getSize());
		System.out.println(square.getSize());
		System.out.println(triangle.getSize());
		System.out.println(triangleIsoscel.getSize());
		System.out.println(rectangle.getSize());
		System.out.println(parallelepiped.getSize());
		System.out.println();

		// display object's height
		for (int i = 0; i < geometricalShapes.size(); i++) {
			if (geometricalShapes.get(i) instanceof Triangle) {
				Triangle triangleRef = (Triangle) geometricalShapes.get(i);
				triangleRef.displayTriangleHeight();
			} else if (geometricalShapes.get(i) instanceof Rectangle) {
				Rectangle rectangleRef = (Rectangle) geometricalShapes.get(i);
				rectangleRef.displayRectangleHeight();
			} else {
				System.out.println("Error: unknown kind of shape");
			}

		}
	}
}
