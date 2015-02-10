#include<stdio.h> 
#include<stdlib.h>
#define BUFSIZE 1024

void main(int argc, char** argv){
char buf[BUFSIZE];
size_t sz = 0;
	
	if(argc<=1){
	exit(EXIT_FAILURE);
	}
	
	FILE *fp;
	fp = fopen(argv[1], "r");

	if (fp == NULL) {
	printf("Error while opening le fichier !\n");
	exit(EXIT_FAILURE);
	}
	else{
	printf("le fichier est ouvert !\n");
	}

	//size_t s =fread(buf,sizeof(char),BUFSIZE,fp);
	

	while (!feof(fp)) {
	sz = fread(buf, sizeof(char), BUFSIZE, fp);
	printf("I read %zu elements\n", sz);
	fwrite(buf, sizeof(char), sz, stdout);
	}

	fclose(fp);
}
