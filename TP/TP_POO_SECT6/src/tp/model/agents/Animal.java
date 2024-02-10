package tp.model.agents;

import java.awt.Point;
import java.util.Objects;
import tp.model.comportements.Hebergeur;
import tp.model.comportements.Deplacable;



/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 * 
 */
public abstract class Animal extends Agent implements Deplacable{
	
	public Hebergeur lieuHebergement;
	
	
	private Etat etat = Etat.Normal;
	private Sexe sexe;
	
	
	
	/* 
	 * constructeurs 
	 */
	
	public Animal(Sexe sexe, Point coord) {
		super(coord);
		this.sexe=sexe;
	}
	
	public Animal(Sexe sexe) {
		super();
		this.sexe=sexe;
	}
	
	public Animal() {
		super();
		
		this.sexe=Sexe.Femelle;
		;
	}
	
	
	
	/*
	 *  Accesseurs et mutateurs
	 */
	//TODO
	
	/*
	 * Redéfinitions de méthodes d'object
	 */
	//TODO
	public String toString() {
		String className = this.getClass().getSimpleName();
		int id = this.getId();
		Sexe sexe = this.sexe;
		Point coord = this.coord;
		
		return String.format("%s, %d,(%s (%d;%d)) ", className, id, sexe, coord.x, coord.y);
	}
	
	

	/* 
	 * comportements d'instance
	 */
	
	

	@Override
	public int hashCode() {
		return Objects.hash(this.getAge(), etat, sexe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return age == other.age && etat == other.etat && sexe == other.sexe;
	}

	public void seDeplacer() {

		//TODO utiliser Math.random() pour choisir une direction de déplacement
		int dx = (int) (3 * Math.random()) - 1;
		int dy = (int) (3 * Math.random()) - 1;
		this.setCoord(this.getCoord().x + dx, this.getCoord().y + dy);
		
	}
	
	public Sexe getSexe() {
		return this.sexe;
	}
	
	public Etat getNiveauSante() {
		return this.etat;
	}
	
	protected void setNiveauSante(Etat etat) {
		this.etat = etat;
	}
	
	public void ameliorerEtat() {
		if (!this.getNiveauSante().equals(Etat.PleineForme)){
			this.setNiveauSante(this.getNiveauSante().next()); 
		}
		
	}
	
	public void aggraverEtat() {
		if (!this.getNiveauSante().equals(Etat.Mourant)){
			this.setNiveauSante(this.getNiveauSante().prev()); 
		}
	}
	

	




}
