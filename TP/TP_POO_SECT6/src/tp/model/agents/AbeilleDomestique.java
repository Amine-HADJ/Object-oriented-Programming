package tp.model.agents;

import java.awt.Point;

public class AbeilleDomestique extends Abeille {

	public AbeilleDomestique(Sexe sexe, Point coord) {
		super(sexe, coord);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new AbeilleDomestique(this.getSexe(), this.getCoord());
	}

	
	

}
