package model.agents.animaux;

import java.awt.Point;

import model.agents.Sexe;
import model.agents.animaux.AbeilleSolitaire;

public class AbeilleSolitaire extends Abeille{

	public AbeilleSolitaire(Sexe s, Point p) {
		/*
		 * TODO
		 */
		super(s,p);
	}

	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new AbeilleSolitaire(getSexe(), new Point(getCoord().getX(), getCoord().getY()));
	}

}
