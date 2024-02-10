package tp.model.agents;

import java.awt.Point;

public class FrelonEuropeen extends Frelon {

	public FrelonEuropeen(Sexe sexe, Point coord) {
		super(sexe, coord);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new FrelonEuropeen(this.getSexe(), this.getCoord());
	}
}
