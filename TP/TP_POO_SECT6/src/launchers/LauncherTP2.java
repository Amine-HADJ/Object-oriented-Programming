package launchers;

import java.awt.Point;


import tp.model.agents.*;
	


public class LauncherTP2 {
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		//TODO
		//tester la hiérarchie d'agent
		
		AbeilleSolitaire a = new AbeilleSolitaire(Sexe.Femelle,new Point(25,30));
		Arbre arb = new Arbre();
		FrelonAsiatique f = new FrelonAsiatique(Sexe.Male, new Point(20,20));
		FrelonEuropeen fe = new FrelonEuropeen(Sexe.Femelle, new Point(40,40));
		
		Ruche ruche = new Ruche(new Point(25,50));
		
//		System.out.println(ruche.peutAccueillir(a));
//		ruche.accueillir(a);
//		System.out.println(a.lieuHebergement);
		
		System.out.println(arb.getAge());
		System.out.println(arb.getCoord());
		arb.cycle();
		System.out.println(arb.getAge());
		System.out.println(arb.getCoord());
		
		System.out.println(a.getAge());
		System.out.println(a.getCoord());
		a.cycle();
		System.out.println(a.getAge());
		System.out.println(a.getCoord());
		
		
		System.out.println(f.getNiveauSante());
		f.rencontrer(fe);
		System.out.println(f.getNiveauSante());
		
		
		
		
		
		
	
		
	}

}
