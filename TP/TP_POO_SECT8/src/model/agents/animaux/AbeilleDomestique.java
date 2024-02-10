package model.agents.animaux;

import java.awt.Point;

import model.decor.Ruche;
import model.agents.Sexe;

public class AbeilleDomestique extends Abeille {

	public AbeilleDomestique(Sexe s, Point p, Ruche r) {
		/*
		 * TODO
		 */
		super(s,p);
		
	}
	
	@Override
	public Object clone() {
		return new AbeilleDomestique(getSexe(), new Point(getCoord().getX(),getCoord().getY()), (Ruche)hebergeur);
	}

	
	

}
