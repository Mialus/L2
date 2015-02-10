#include<stdio.h> 
#include<stdlib.h>

void mafonction(int i, int* pj){
    i=i+1;
    *pj=*pj+1;
    printf("Dans la fonction, i = %d, j = %d\n",i,*pj);
    printf("Dans la fonction, pj = %p et l'adresse de i vaut %p\n",pj,&i);
}

int main(){
    int i=1;
    int j=1;
    printf("Dans main i = %d, j = %d, adr de i vaut %p et adr de j vaut %p \n\n",i,j,&i,&j);
    mafonction(i,&j);
    printf("Dans main i = %d, j = %d, adr de i vaut %p et adr de j vaut %p \n\n",i,j,&i,&j);
    mafonction(j,&j);
    printf("Dans main i = %d, j = %d, adr de i vaut %p et adr de j vaut %p \n\n",i,j,&i,&j);
}
