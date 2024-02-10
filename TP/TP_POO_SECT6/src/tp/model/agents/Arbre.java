package tp.model.agents;

import java.awt.Point;

import tp.model.comportements.Hebergeur;


public class Arbre extends Vegetal implements Hebergeur{

	
	private double taille;
	private int nbHeberges;
	
	
	public Arbre(Point coord) {
		super(coord);
		// TODO Auto-generated constructor stub
	}

	public Arbre() {
		// TODO Auto-generated constructor stub
	}

	

	
	 

	

	@Override
	public void produire() {
		// TODO Auto-generated method stub
		
	}
	

	private int getMaxHeberges() {
		return nbHeberges;
	}
	
	@Override
	public boolean peutAccueillir(Animal a) {
		String supclassName = a.getClass().getSuperclass().getSimpleName().toString();
		
		if (supclassName.equals("Frelon")) {
			System.out.println(supclassName);
			return true;
		}
			
		return false;
	}
	
	public boolean accueillir(Animal a) {
		// TODO Auto-generated method stub
		if (this.peutAccueillir(a)) {
			a.lieuHebergement = this;
			return true;
		}
		return false;
	}
	
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new Arbre(this.getCoord());
	}

	
	

	
	

	
	

	



}
