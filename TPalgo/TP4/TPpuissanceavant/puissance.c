#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <math.h>

///////////////////////////////////////////////////////////////////////////////
/// FONCTIONS A NE PAS MODIFIER
///////////////////////////////////////////////////////////////////////////////

void viderTampon(){
	scanf("%*[^\n]s");
	getchar();
}

int creerFichierVide(){
	FILE* fichier = NULL;
	fichier = fopen("./donnee.dat","w");
	if(fichier == NULL){
		printf("Erreur impossible d'ouvrir le fichier donnee.dat");
		return 1;
	}
	
	fprintf(fichier,"#n puissance1 puissance2 puissance3 \n");
	fclose(fichier);
	return 0;
}

int ecrireLigneEnFin(int n, float puis1, float puis2, float puis3){
	FILE* fichier = NULL;
	fichier = fopen("./donnee.dat","a");
	if(fichier == NULL){
		printf("Erreur impossible d'ouvrir le fichier donnee.dat");
		return 1;
	}
	
	fprintf(fichier,"%d\t %f\t %f\t %f\t \t \n", n, puis1, puis2, puis3);
	fclose(fichier);
	return 0;
}


///////////////////////////////////////////////////////////////////////////////
/// PARTIE A MODIFIER
///////////////////////////////////////////////////////////////////////////////

//MODIFIEZ LES FONCTIONS PUISSANCES

float puissance1 (float x, int n, int * pcompt){ // FONCTION A MODIFIER
  return n;
}

float puissance2 (float x, int n, int * pcompt){ // FONCTION A MODIFIER
  return (n* (log (n)));
}

float puissance3 (float x, int n, int * pcompt){ // FONCTION A MODIFIER
  return (pow(n,2));
}

int main(){
  int n,i;
  int comp1, comp2, comp3;
  float res1, res2, res3;
  int choix=0;
  printf("valeur maximale? ");
  scanf("%d",&n);
  viderTampon();
  creerFichierVide();
  for(i=1;i<=n;i++){
    comp1=0;
    comp2=0;
    comp3=0;
    res1=puissance1 (1,i,&comp1);
    res2=puissance2 (1,i,&comp2);
    res3=puissance3 (1,i,&comp3);
    ecrireLigneEnFin(i,res1,res2,res3); // LIGNE A MODIFIER
  }
  return 0;
}
