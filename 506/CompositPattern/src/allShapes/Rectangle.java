package allShapes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.util.ArrayList;

public class Rectangle extends CompositShape{

	private Point startPoint;
	private Point endPoint;
	
	public Rectangle() {}
	
	public Rectangle(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	
	@Override
	public void buildShap(Graphics2D graphics) {
		shapes.add(new Line(startPoint, new Point(endPoint.getxCoOrdinate(), startPoint.getyCoOrdinate())));
		shapes.add(new Line(startPoint, new Point(startPoint.getxCoOrdinate(), endPoint.getyCoOrdinate())));
		shapes.add(new Line(new Point(startPoint.getxCoOrdinate(), endPoint.getyCoOrdinate()), endPoint));
		shapes.add(new Line(endPoint, new Point(endPoint.getxCoOrdinate(), startPoint.getyCoOrdinate())));
	}
	



	@Override
	public void buildShap() {
		shapes.add(new Line(new Point(0, 0), new Point(50, 0)));
		shapes.add(new Line(new Point(50, 0), new Point(50, 50)));
		shapes.add(new Line(new Point(0, 0), new Point(0, 50)));
		shapes.add(new Line(new Point(0, 50), new Point(50, 50)));
	}

	@Override
	public IShap copy() {
		try {
			return (IShap)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
