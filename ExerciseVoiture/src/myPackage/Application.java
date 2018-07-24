package myPackage;

public class Application {
	
	// Création d'une instance de Voiture
	static Voiture voitureDeGreg = new Voiture();
	static Owner Greg = new Owner();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// La method .setMaVariable est appelée pour donner la valeur "Volkswagen" à ma variable VoitureDeGreg.marque
		voitureDeGreg.setMarque("Volkswagen");
		
		// La method .getMaVariable est appelée et returned 
		String myCarsBrand = voitureDeGreg.getMarque();
		
		// le résultat est affiché
		System.out.println("La marque de votre voiture est : " + "***" + myCarsBrand + "***");
		
		voitureDeGreg.setModel("Nardo W12 Coupe Concept");
		String myCarsModel = voitureDeGreg.getModel();
		System.out.println("Le modèle de votre voiture est : " +  "***" + myCarsModel + "***");
		
		
		voitureDeGreg.setCouleur("Grise");
		String myCarsColor = voitureDeGreg.getCouleur();
		System.out.println("Sa couleur est : " + myCarsColor);
		
		voitureDeGreg.setImmatriculation("101221-OOP");
		String myCarsImmatriculation = voitureDeGreg.getImmatriculation();
		System.out.println("Votre plaque d'immatriculation est : " +  "***" + myCarsImmatriculation + "***");
		
		voitureDeGreg.setPrice(99100.00);
		Double myCarsPrice = voitureDeGreg.getPrice();
		System.out.println("Le prix de votre voiture est : " + "***" + myCarsPrice  + "\u20AC" + "***" );
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		Greg.setNom("Mr.Thersiquel");
		String myFirstName = Greg.getNom();
		Greg.setPrénom("Greg");
		String mySecondName = Greg.getPrénom();
		System.out.println("La voiture immatruclée " +  "***" + myCarsImmatriculation + "***" + " appartient à " + myFirstName + "."  + mySecondName);
		
		
		
		
		}
}
