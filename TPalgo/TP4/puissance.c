#include<stdio.h>
#include<stdlib.h>
#include <math.h>

float puissance1 (float x, int n, int *c){
  if (n==0)
    return(1);
  else 
	(*c)++;
    return(x*puissance1(x,n-1,c));
}

float puissance2 (float x, int n, int *c){
  float p;
  if (n==0)
    return(1);
  else { 
	(*c)++;
    p=puissance2(x,n/2,c);
    if(n%2 == 0)
      return(p*p);
    else
	(*c)++;
      return(x*p*p);
  }
}
float puissance3 (float x, int n, int *c){
  float p;
  if (n==0)
    return(1);
  else { 
	(*c)++;
    if(n%2 == 0)
      return(puissance3(x,n/2,c)*puissance3(x,n/2,c));
    else
	(*c)++;
      return(x*puissance3(x,n/2,c)*puissance3(x,n/2,c));
  }
}
main(){
  int n,c;;
  float x;
c=0;
  printf("donnez la valeur de n : ");
  scanf("%d",&n);
  scanf("%*[^\n]s");
  getchar(); 
  printf("donnez la valeur de x : ");
  scanf("%f",&x);
  scanf("%*[^\n]s");
  getchar(); 
  printf("puissance1(%f,%d,%d)=%f \n", x, n,c,puissance1 (x,n,&c));
printf("%d \n",c);
c=0;  
printf("puissance1(%f,%d,%d)=%f \n", x, n,c,puissance1 (x,n,&c));
printf("%d \n",c);
c=0;  
printf("puissance1(%f,%d,%d)=%f \n", x, n,c,puissance1 (x,n,&c));
printf("%d \n",c);
}

