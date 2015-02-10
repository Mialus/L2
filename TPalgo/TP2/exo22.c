#include<stdio.h>
#include<stdlib.h>
const int n=10;

void remplit(int tab[n]){
  int i;
  for(i=0,i<n,i++){
    printf("Entrez la valeur de l'élément %d\n",i);
    scanf("%d",tab[i]);
  }
}

void affichage(int tab[n]){
  int i;
  for(i=0,i<n,i++){
    printf(" %d",tab[i]);
  }
  printf("\n");
}

int main(){
}
