#include<stdio.h> 
#include<stdlib.h>

int main(int argc, char** argv){
long i,j;

j=0;
	for(i=0;i<argc;i++){
		 j=j+atoi(argv[i]);
}
printf("%ld \n",j);
}
