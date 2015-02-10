public class Rectangle{	
	double largeur;
	double longueur;
	
 public static double surface(double longueur,double largeur){
double r;

r=longueur*largeur;
return r;
}
public static double perimetre(double longueur, double largeur){
	double r;
	
	r=(longueur*2)+(largeur*2);
	return r;
}
public static void setSize(double longueur,double largeur){

}
public static void dessinePlein(double longueur,double largeur){

int i,j;
	
for(i=0;i<largeur;i++) {
	for(j=0;j<longueur;j++){
		Ecran.afficher("*");
	}
	Ecran.afficher("\n");
}
}

public static void dessineCreux(double longueur,double largeur){
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