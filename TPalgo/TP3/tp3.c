#include<stdio.h>
#include<stdlib.h>

int initTab(){

  int tab[100];
  int i;
  
  for(i=0;i<100;i++){
    tab[i]=1;
    printf("%d",tab[i]);
}
}

int crible(int t[100]){
  int i,j,max,k;

  max=t[0];
    for(i=1;i<max;i++){
    if(max<t[i]){
      max=t[i];
    }
  }
 int tab[max];
 for(i=0;i<max;i++){
   tab[i]=1+i;
 }
 for(i=0;i<max;i++){
     j=tab[i];
     if((tab[i]%2==0)||(tab[i]%3==0)||(tab[i]%5==0)||(tab[i]%7==0)){
       tab[i]=1;
     }
     if((j==2)||(j==3)||(j==5)||(j==7)){
       tab[i]=j;
    }   
  }

 for(i=0;i<max;i++){
   for(j=0;j<100;j++){
     k=t[j];
     if((tab[i]=!1)&&(t[j]%tab[i]==0)){
       tab[i]=1;
     }
     if((k==tab[i]){
       t[j]=k;
    }  
 }
}
}

int main(){}
