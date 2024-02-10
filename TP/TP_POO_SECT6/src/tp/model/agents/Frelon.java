package tp.model.agents;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Frelon extends Animal {
	
	protected ArrayList<Abeille> proies;

	public Frelon(Sexe sexe, Point coord) {
		super(sexe, coord);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	protected void seNourrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rencontrer(Agent a) {
	
		// TODO Auto-generated method stub
		if (a instanceof Abeille ) {
			((Animal) a).setNiveauSante(Etat.EnDetresse);
		}
		
		if (this instanceof FrelonAsiatique && a instanceof FrelonEuropeen) {
			((Animal) this).setNiveauSante(Etat.EnDetresse);
			
		}
		
	}
	
	protected void maj() {
		
	}
	
	protected void gestionProie() {
		
	}

}
