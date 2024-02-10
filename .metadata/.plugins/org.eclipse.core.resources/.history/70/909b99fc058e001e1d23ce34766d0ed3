package tp.model.agents;

import java.awt.Point;
import tp.model.comportements.Clonable;

public class PointPositif implements Clonable{
	
	private Point p = new Point();
	
	
	public PointPositif(Point p) {
		this.p.x = (int) Math.abs(p.x);
		this.p.y = (int) Math.abs(p.y);
		
		
	}
	
	public int getX() {
		return this.p.x;
		
	}
	
	public int getY() {
		return this.p.y;
		
	}
	
	public boolean setX(int X) {

		this.p.x = Math.abs(X);
		return true;

	}
		
	public boolean setY(int Y) {
			
		this.p.y = Math.abs(Y);
		return true;

	}

	@Override
	public String toString() {
		return String.format("(%d; %d)", this.p.x, this.p.y);
	}
	
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o;

	}
	

		
		

}
