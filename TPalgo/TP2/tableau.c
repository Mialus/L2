#include<stdio.h>
#include<stdlib.h>

int main(){
  int i;
  int tab[6];
  int max;

  for (i=0; i< 6; i++){
      printf("donnez la valeur de l'element %d\n",i+1);
      scanf("%d",&tab[i]);
    } 
  max = tab[0];
  for (i=1; i< 6; i++){
    if(max<tab[i]){
     max=tab[i];

       }
    }
  printf("La valeur maximun du tableau est %d\n",max);
}
