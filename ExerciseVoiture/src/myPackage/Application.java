package myPackage;

public class Application {
	
	// Cr�ation d'une instance de Voiture
	static Voiture voitureDeGreg = new Voiture();
	static Owner Greg = new Owner();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// La method .setMaVariable est appel�e pour donner la valeur "Volkswagen" � ma variable VoitureDeGreg.marque
		voitureDeGreg.setMarque("Volkswagen");
		
		// La method .getMaVariable est appel�e et returned 
		String myCarsBrand = voitureDeGreg.getMarque();
		
		// le r�sultat est affich�
		System.out.println("La marque de votre voiture est : " + "***" + myCarsBrand + "***");
		
		voitureDeGreg.setModel("Nardo W12 Coupe Concept");
		String myCarsModel = voitureDeGreg.getModel();
		System.out.println("Le mod�le de votre voiture est : " +  "***" + myCarsModel + "***");
		
		
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
		Greg.setPr�nom("Greg");
		String mySecondName = Greg.getPr�nom();
		System.out.println("La voiture immatrucl�e " +  "***" + myCarsImmatriculation + "***" + " appartient � " + myFirstName + "."  + mySecondName);
		
		
		
		
		}
}
