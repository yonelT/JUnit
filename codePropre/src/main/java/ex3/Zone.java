package ex3;

import java.util.List;

public abstract class Zone {

	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * getPoids();
	}
}
