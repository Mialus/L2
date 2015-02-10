#include<stdio.h> 
#include<stdlib.h>

int main(){
  int n,i,j;
printf("Entrer la valeur entiére de la variable n : \n");
 scanf("%d",&n);

  if(n>0){

    for(i=1;i<n+1;i++){
      for(j=1;j<i+1;j++){
	printf("%d",j);
    }
      printf("\n");
    }
  }
}
