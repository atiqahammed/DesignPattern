package allShapes;

import java.awt.Shape;
import java.util.ArrayList;

public class Rectangle extends CompositShape{

	@Override
	public void buildShap() {
		shapes.add(new Line(new Point(0, 0), new Point(50, 0)));
		shapes.add(new Line(new Point(50, 0), new Point(50, 50)));
		shapes.add(new Line(new Point(0, 0), new Point(0, 50)));
		shapes.add(new Line(new Point(0, 50), new Point(50, 50)));
	}

}
