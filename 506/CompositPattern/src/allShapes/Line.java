package allShapes;

public class Line implements IShap{
	private Point start;
	private Point end;
	
	@Override
	public void drow() {
		System.out.println("drow a line start from ("+start.getxCoOrdinate()+", "+ start.getyCoOrdinate()+") to (" + end.getxCoOrdinate()+", "+ end.getyCoOrdinate()+")");
	}

	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}

}
