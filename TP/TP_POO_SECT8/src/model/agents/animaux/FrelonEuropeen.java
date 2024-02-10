package model.agents.animaux;

import java.awt.Point;

import model.agents.Sexe;

public class FrelonEuropeen extends Frelon {
	
	public FrelonEuropeen(Sexe s, Point p) {
		/*
		 * TODO
		 */
		super(s,p);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new FrelonEuropeen(getSexe(), new Point(getCoord().getX(), getCoord().getY()));
	}

	/* inutile avec la liste de proies à partir du TP3
	@Override
	public void rencontrer(Agent a) {
		//penser à réutiliser l'existant
		super.rencontrer(a);
		
		if(a instanceof FrelonAsiatique) {
			Animal b = (Animal)a;
			gestionProie(b);
		}

	}
	*/

}
