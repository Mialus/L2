public class Rectangle{	
	int largeur;
	int longueur;
	
 public static double surface(int longueur,int largeur){
int r;

r=longueur*largeur;
return r;
}
public static double perimetre(int longueur, int largeur){
	int r;
	
	r=(longueur*2)+(largeur*2);
	return r;
}
public void setSize(int h, int l) {
		longueur=h;
		largeur=l;
	}
public static void dessinePlein(int longueur,int largeur){

int i,j;
	
for(i=0;i<largeur;i++) {
	for(j=0;j<longueur;j++){
		Ecran.afficher("*");
	}
	Ecran.afficher("\n");
}
}

public static void dessineCreux(int longueur,int largeur){
	int i,j;
	
for(i=0;i<largeur;i++) {
	for(j=0;j<longueur;j++){
		
		if((i==0)||(j==0)||(i==largeur-1)||(j==longueur-1)){
		Ecran.afficher("*");
		}
		else{
			Ecran.afficher(".");
		}
	}
	Ecran.afficher("\n");
}


}
}