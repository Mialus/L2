import java.awt.*;
import javax.swing.*;

public class jeu {
	

	public static void pause(int temps) {
		try {Thread.sleep(temps);
		}
		catch (Exception e) {
		}
	}
	
	
	//Selection des paramètre par l'utilisateur : Bouttons à implenter (Il coche les paramètres qu'il veut), et un boutton "jouer" à la fin. +un  bouton "paramètres par défault" (contructeurs vides etc).//
	public static void affichageMenu () {
		int choix1;
		Ecran.afficherln(" \n  ----   MENU   ---- \n \n");
		Ecran.afficherln("1 - Parametres par default \n2 - choisir ses parametres \n");
		choix1=Clavier.saisirInt();
		if (choix1 ==1){
			Balle b1 = new Balle();
			Obstacle o1= new Obstacle();
			deroulementJeu(b1,o1);
		}
		else{
			//FenParameters est la classe qui permet d'ouvrir une fenètre munie de boutons et de cases à cocher pour définir les paramètres et instancier les objets. //
			//FenParameters parametre= new FenParameters();     NE MARCHE PAS ENCORE //
		}
	}
	
	
	public static void deroulementJeu(Balle b, Obstacle o) {
		boolean boucle = true;
		
		while (boucle == true) {

			pause(100);
		}
		
	}
	
	//programme principal//
	public static void main(String[]args){
		affichageMenu();
	}
}