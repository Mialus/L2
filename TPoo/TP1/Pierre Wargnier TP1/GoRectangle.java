public class GoRectangle{
public static void main(String[]args){
	Rectangle r = new Rectangle();
	int h,l;
	
	Ecran.afficher("Veuillez entrer la largeur du rectangle  ");
	h=Clavier.saisirInt();
	Ecran.afficher("Veuillez entrer la longueur du rectangle  ");
	l=Clavier.saisirInt();
	
	Rectangle.dessinePlein(h,l);
	Ecran.afficher("\n");
	Rectangle.dessineCreux(h,l);
	}
}