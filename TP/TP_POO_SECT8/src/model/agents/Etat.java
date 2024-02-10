package model.agents;

import model.agents.Etat;

public enum Etat {
	PleineForme, EnForme, Normal, EnDifficulte, EnDetresse, Mourant;
	
	private static final Etat[] vals = values();
	    
	public Etat prev() {
	    	
	    	
	      return vals[(this.ordinal() + 1) % vals.length];
	    }
	    
	    public Etat next() {
	        return vals[(this.ordinal() - 1 + vals.length) % vals.length];
	    }
	}
