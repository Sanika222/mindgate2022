package com.mindgate.Factory;
import com.paint.pojo.Circle;
import com.paint.pojo.Shapes;
import com.paint.pojo.Square;
import com.paint.pojo.Triangle;

public class ShapesFactory {

	public static Shapes getShapes(int choice) {
		Shapes shapes = null;
		switch (choice) {
		case 1:
			shapes = new Circle();
			break;

		case 2:
			shapes = new Triangle();
			break;

		case 3: 
			shapes = new Square();
			break;
			
//		default:
//			shapes=new Shapes();
		}
		return shapes;
	}}
