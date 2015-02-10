public class GoRectangle{
public static void main(String[]args){
	Rectangle r = new Rectangle();
	
	Ecran.afficher("Veuillez entrer la largeur du rectangle  ");
	r.largeur=Clavier.saisirDouble();
	Ecran.afficher("Veuillez entrer la longueur du rectangle  ");
	r.longueur=Clavier.saisirDouble();
	
	Rectangle.dessinePlein(r.largeur,r.longueur);
	Ecran.afficher("\n");
	Rectangle.dessineCreux(r.largeur,r.longueur);
	}
}