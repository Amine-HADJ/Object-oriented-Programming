package tp.model.agents;

import java.awt.Point;

public class AbeilleSolitaire extends Abeille {

	public AbeilleSolitaire(Sexe sexe, Point coord) {
		super(sexe, coord);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new AbeilleSolitaire(this.getSexe(), this.getCoord());
	}
}
