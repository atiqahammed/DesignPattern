package allShapes;

public class Circle implements IShap{
	private Point center;
	private int redius;
	
	
	
	public Circle(Point center, int redius) {
		super();
		this.center = center;
		this.redius = redius;
	}



	@Override
	public void drow() {
		System.out.println("drow circle at the point (" +center.getxCoOrdinate()+", "+ center.getyCoOrdinate()+") and redius = " + redius +" unit");
	}

}
