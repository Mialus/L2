public class testtableaux {
	
static boolean testdiagoHaut(int c1,int [][] tab){
	int i,j,comp,aux;
	boolean res;
	res=false;
// Partie bas-droite du tableau.
	for ( j = 0 ; j < 7 ; j++ ) {
		aux=j;
		i=5;
		while((i>-1)&&(j<7)){
			comp=0;
			while((tab[i][j]==c1)&&(i>-1)&&(j<7)){
				comp++;
         
				i--;
				j++;
			}
			if(tab[i][j]!=c1){
				i--;
				j++;
			}
			if(comp==4){
				res=true;
			}         
		}
		j=aux;
	}
// Partie haut-gauche du tableau.
	for ( i = 0 ; i < 6 ; i++ ) {
		aux=i;
		j=6;
		while((i<6)&&(j>-1)){
			comp=0;
			while(tab[i][j]==c1){
				comp++;
         
				i++;
				j--;
			}
			if(tab[i][j]!=c1){
				i++;
				j--;
			}
			if(comp==4){
				res=true;
			}         
		}
		i=aux;
	}
return res;
}

public static void main(String[]args){
  int choix, c1, c2, cj1, cj2, nbTour,i,j,boucle;
  String j1, j2;
  int [][] tab = new int[6][7];
  int [][] tabTest = new int[6][7];
  boucle=0;
  c1=4;

for ( i = 0 ; i < 6 ; i = i+1 ) {
    for ( j = 0 ; j < 7 ; j = j+1 ) {
      tab[i][j] = -1; 
      tabTest[i][j] = -1;
    } 
  }
tab[5][1]=4;
tab[4][2]=4;
tab[3][3]=4;
tab[2][4]=4;

for ( i = 0 ; i < 6 ; i = i+1 ) {
  Ecran.afficher("\n");
    for ( j = 0 ; j < 7 ; j = j+1 ) {
      Ecran.afficher(tab[i][j]);
    
 }
}
if (testdiagoHaut(c1,tab)) {
Ecran.afficher("ça marche !");
}
}


}
