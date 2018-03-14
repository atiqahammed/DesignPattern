package allShapes;

public class Flag extends CompositShape{

	@Override
	public void buildShap() {
		shapes.add(new Rectangle());
		shapes.add(new Circle(new Point(5, 5), 10));
	}

}
