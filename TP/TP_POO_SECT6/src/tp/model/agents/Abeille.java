package tp.model.agents;

import java.awt.Point;
import tp.model.comportements.Hebergeur;

public abstract class Abeille extends Animal implements Hebergeur {
	
	
	int qteMiel;
	int qteMax;
	private boolean parasite = false;
	

	public Abeille(Sexe sexe, Point coord) {
		super(sexe, coord);
		
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean peutAccueillir(Animal a) {
		String className = a.getClass().getSimpleName().toString();
		
		if (className.equals("Varroa")) {
			System.out.println(className);
			return true;
		}
			
		return false;
	}

	@Override
	public boolean accueillir(Animal a) {
		// TODO Auto-generated method stub
		if (this.peutAccueillir(a)) {
			a.lieuHebergement = this;
			return true;
		}
		return false;
	}
	
	
	@Override
	protected void seNourrir() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void rencontrer(Agent a) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void maj() {
		// TODO Auto-generated method stub
		
	}
	
}
