package model.agents.animaux;

import java.awt.Point;

import model.agents.Sexe;

public class FrelonAsiatique extends Frelon{

	public FrelonAsiatique(Sexe s, Point p) {
		/*
		 * TODO
		 */
		super(s,p);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new FrelonAsiatique(getSexe(), new Point(getCoord().getX(), getCoord().getY()));
	}

	

}
