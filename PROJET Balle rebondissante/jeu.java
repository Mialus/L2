import java.awt.*;
import javax.swing.*;

public class jeu {
	

	public static void pause(int temps) {
		try {Thread.sleep(temps);
		}
		catch (Exception e) {
		}
	}
	
	
	//Selection des param�tre par l'utilisateur : Bouttons � implenter (Il coche les param�tres qu'il veut), et un boutton "jouer" � la fin. +un  bouton "param�tres par d�fault" (contructeurs vides etc).//
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
			//FenParameters est la classe qui permet d'ouvrir une fen�tre munie de boutons et de cases � cocher pour d�finir les param�tres et instancier les objets. //
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