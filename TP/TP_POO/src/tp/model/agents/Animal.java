package tp.model.agents;

import java.awt.Point;
import java.util.Objects;

/**
 * Cette classe modélise un Animal dans la simulation
 * @author bruno
 * 
 */
public class Animal {
	/* attributs de classe */
	private static int currentId = 0;
	
	/* attributs d'instance*/
	/** identifiant unique de l'animal*/
	private int id;
	/** age en unité de temps*/
	private int age;
	/** position sur la carte*/
	private Point coord;
	/** état de santé de l'animal */
	private Etat etat=Etat.Normal;
	private Sexe sexe;
	
	/* 
	 * constructeurs 
	 */
	
	public Animal(Sexe sexe, Point coord) {
		age = 0;
		id = Animal.getUniqueId();
		this.sexe=sexe;
		//this.coord=coord;
		this.coord=new Point(coord);
	}
	
	public Animal(Sexe sexe) {
		//TODO
		/* crée un animal avec le sexe passé en paramètre, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		age = 0;
		id = Animal.getUniqueId();
		this.sexe=sexe;
		this.coord=new Point(0,0);
	}
	
	public Animal() {
		//TODO
		/* crée un animal de sexe femelle, à la position (0;0), d'âge 0 et lui attribue un id unique
		 * une bonne manière de faire 
		 * en utilisant ce qui existe déjà, une moins bonne
		 */
		age = 0;
		id = Animal.getUniqueId();
		this.sexe=Sexe.Femelle;
		this.coord=new Point(0,0);
	}
	
	
	
	/*
	 *  Accesseurs et mutateurs
	 */
	//TODO
	
	public int getAge() {
		return this.age;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Sexe getSexe() {
		return this.sexe;
	}
	
	public void setAge(int age) {
		if (age > this.age) {
			this.age = age;
		}
	}
	
	public Point getCoord() {
		return new Point(this.coord);
	}
	
	public Etat getEtat() {
		return this.etat;
	}
	
	
	/*
	 * Redéfinitions de méthodes d'object
	 */
	//TODO
	public String toString() {
		String className = this.getClass().getSimpleName();
		int id = this.id;
		Sexe sexe = this.sexe;
		Point coord = this.coord;
		
		return String.format("%s, %d,(%s (%d;%d)) ", className, id, sexe, coord.x, coord.y);
	}
	
	

	/* 
	 * comportements d'instance
	 */
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, etat, sexe);
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
		this.coord = new Point(this.coord.x + dx, this.coord.y + dy);
		
	}
	
	public void vieillir() {
		//TODO fait vieillir l'animal d'une unité de temps
		//une bonne manière de faire, une moins bonne...
		++this.age;
	}
	
	public void rencontrer(Animal a) {
		//TODO
	}
	
	/* comportements de classe */ 
	/**
	 * Renvoie un identifiant unique non encore utilisé
	 * @return un identifiant entier unique d'animal
	 */
	private static int getUniqueId() {
		//TODO 
		
		return ++currentId;
	}
	

	public static void main(String args[]) {
		//tests unitaires de la classe Animal
		//TODO décommentez les lignes pour approfondir le test unitaire
		//complétez la méthode pour tester les nouvelles fonctionnalités que vous allez implémenter
		Animal a = new Animal();
		Animal b = new Animal(Sexe.Male);
		Animal c = new Animal(Sexe.Assexue);
		Animal d = new Animal(Sexe.Femelle,new Point(25,30));
		Animal e = new Animal(Sexe.Femelle,new Point(25,30));
		
		/*
		 * les lignes suivantes doivent afficher à terme: NomDeLaClasse n° id_animal(sexe, (position x; position y)).
		 * ex: 28 (FEMELLE, (25;30))
		 */
		System.out.println("*** Animaux créés: **********");
		System.out.println(a);
		System.out.println(a.toString()); // inutile car println appelle automatiquement toString()
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("*** Getters et setters **********");
		
		System.out.println(d.getSexe());
		Sexe ss = d.getSexe();
		ss=Sexe.Male; // Ne fait rien car on peut pas changer de sexe
		System.out.println(d.getSexe());
		
		//les lignes suivantes devraient afficher la même chose....
		
		System.out.println(d.getCoord());
		Point pt = d.getCoord();
		pt.x=50; //on ne peut pas changer les coordonnees
		System.out.println(d.getCoord());
		
		
		//TODO ajoutez vos propres tests de getters et setters
		
		//TODO test vieillir
		
		System.out.println("Test viellir()");
		System.out.println(a.getAge());
		a.vieillir();
		System.out.println(a.getAge());
		System.out.println("Fin test viellir()\n");
		
		//TODO test seDeplacer
		
		System.out.println("Test seDeplacer()");
		System.out.println(a.getCoord());
		a.seDeplacer();
		System.out.println(a.getCoord());
		System.out.println("Fin test seDeplacer()\n");
		
		
		
		//TODO test id
		
		System.out.println("Test id");
		System.out.println(a.getId());
		System.out.println(b.getId());
		System.out.println("Fin test id\n");
		
		//TODO test age
		
		System.out.println("Test age");
		a.setAge(10);
		System.out.println(a.getAge());
		System.out.println("Fin test age\n");
		
		
		
		/*
		 * Test comparaison
		 */
		System.out.println("Test equals");
		System.out.println(d==e);
		System.out.println(d.equals(e));
		System.out.println("Bonjour"=="Bonjour");
		System.out.println("Bonjour".equals("Bonjour"));
		System.out.println("Fin test equals");
	
	}

}
