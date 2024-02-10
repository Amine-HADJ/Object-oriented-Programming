package model.agents;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
//pour l'exemple détaillé de aggraverEtat
import java.util.List;
import java.util.ListIterator;

import model.comportements.Deplacable;
import model.comportements.Hebergeur;
import model.agents.Etat;
import model.agents.vegetaux.Vegetal;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 *
 */
/* 
 * abstract à partir du TP2 + déplacement des méthodes/attributs du TP1 concernant les agents dans la classe agent:
 * attributs de classe 
	private static int currentId = 0;
	
	attributs d'instance:
	private int id;
	protected int age;
	protected PointPositif coord; //question subsdiaire du tp2 + solution présentée au cours 4
	//protected Point coord;
	 
	méthodes:
	public Agent(Point coord)
	public Agent()
	
	equals, hascode,tostring (sans le sexe)
	getCoord, setAge, vieillir
	
	getUniqueId
	
	Attention: rencontrer(Agent a) devient abstrait 
 */
public abstract class Animal extends Agent implements Deplacable {
	/*
	 * SeDeplacer: soit abstract, soit encore mieux faire une interface Deplacable
	 */
	
	/** état de santé de l'animal */
	private Etat etat=Etat.Normal;
	/** sexe de l'animal */
	private Sexe sexe;
	/** hebergeur de l'animal */
	protected Hebergeur hebergeur;
	
	/* 
	 * constructeurs 
	 */
	public Animal(Sexe sexe, Point p) {
		super(p);
		this.sexe=sexe;
	}
	
	public Animal(Sexe sexe) {
		this(sexe,new Point(0,0));
		//TODO
		/* crée un animal avec le sexe passé en paramètre, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
	}
	
	public Animal() {
		this(Sexe.Femelle);
		//TODO
		/* crée un animal de sexe femelle, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
	}
	
	/*
	 *  Accesseurs et mutateurs
	 */
	public Sexe getSexe() {
		return sexe;
	}
	
	public Etat getNiveauSante() {return etat;}
	/**
	 * protected, car seul l'animal doit pouvoir changer son niveau de santé
	 * @return
	 */
	protected final void setNiveauSante(Etat e) {etat = e;}
	/*
	 * (non-Javadoc)
	 * @see complet.model.agents.Agent#toString()
	 */
	public String toString() {
		//bien penser à réutiliser l'existant de Agent avec le super.toString()
		return super.toString()+", "+sexe;
	}
	
	/* 
	 * comportements d'instance
	 */
	/*
	 * (non-Javadoc)
	 * @see complet.model.comportements.Deplacable#seDeplacer()
	 */
	/**
	 * déplacement aléatoire avec -1<=dx<=1 et  -1<=dy<=1
	 * @see model.comportements.Deplacable#seDeplacer()
	 */
	public void seDeplacer() {
		int aleaX = (int)(Math.random()*3)-1;
		int aleaY = (int)(Math.random()*3)-1;
		this.setCoord((int)(coord.getX()+aleaX),(int)(coord.getY()+aleaY));
	}
	
	/**
	 * condition d'installation d'un animal dans un hébergeur
	 * @param h
	 * @return
	 */
	protected final boolean sInstaller(Hebergeur h) {
		boolean ret=false;
		if(h!= null && h.accueillir(this)) {
			hebergeur = h;
			ret=true;
		}
		return ret;
	}
	
	protected final void ameliorerEtat() {
		if (!this.getNiveauSante().equals(Etat.PleineForme) && !this.getNiveauSante().equals(Etat.Mourant)){
			this.setNiveauSante(this.getNiveauSante().next()); 
		}
		
	}
	
	protected final void aggraverEtat() {
		if (!this.getNiveauSante().equals(Etat.Mourant)){
			this.setNiveauSante(this.getNiveauSante().prev()); 
		}
	}
	
	
	
}
