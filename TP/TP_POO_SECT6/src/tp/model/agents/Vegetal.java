package tp.model.agents;

import java.awt.Point;

public abstract class Vegetal extends Agent {

		
		protected int qteNectar;
		public Vegetal(Point coord) {
			super(coord);
		}
		
		
		
		public Vegetal() {
			super();
			
		}
		
		public void rencontrer(Agent a) {
			
		}
		
		protected void maj() {
			
		}
		
		public abstract void produire();
		
		protected void seNourrir() {
			
		}
		
		public int getPortionNectar() {
			return this.qteNectar;
		}
		
		



		



		



	}

