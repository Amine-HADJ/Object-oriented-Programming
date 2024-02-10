package tp.model.agents;

import java.awt.Point;

public class Varroa extends Animal{

	public Varroa(Sexe sexe, Point coord) {
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
		
	}

	@Override
	protected void maj() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void seDeplacer() {
		super.seDeplacer();
	}
	
	@Override
	public Object clone() {
		// TODO Auto-generated method stub
		return new Varroa(this.getSexe(), this.getCoord());
	}
}
	

