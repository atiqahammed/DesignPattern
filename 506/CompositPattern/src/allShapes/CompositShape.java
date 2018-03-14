package allShapes;

import java.awt.Shape;
import java.util.ArrayList;

public abstract class CompositShape implements IShap{

	protected ArrayList<IShap> shapes;
	
	public CompositShape() {
		shapes = new ArrayList<>();
	}
	
	@Override
	public void drow() {
		
		buildShap();
		for(IShap shap: shapes)
			shap.drow();
	}
	
	public abstract void buildShap(); 

}