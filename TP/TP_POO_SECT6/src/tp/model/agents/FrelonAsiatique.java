package tp.model.agents;

import java.awt.Point;

public class FrelonAsiatique extends Frelon {

	public FrelonAsiatique(Sexe sexe, Point coord) {
		super(sexe, coord);
		// TODO Auto-generated constructor stub
	}

	
	
	public void rencontrer (Animal a) {
		super.rencontrer(a);
		if (a instanceof FrelonEuropeen) {
			this.setNiveauSante(Etat.EnDetresse);
		}
		
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new FrelonAsiatique(this.getSexe(), this.getCoord());
	}
}
