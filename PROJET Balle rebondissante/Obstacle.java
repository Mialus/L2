public class Obstacle {
	Position p ;
	
/* Pas de constructeur vide : l'instantiation d'un obstacle aléatoire se fera dans la classe Damier, en fonction de la taille du tableau. */
	public Obstacle () {
		p = new Position (1,1);
	}
	
	public Obstacle (int x , int y) {
		p = new Position (x,y);
	}
	
	
}