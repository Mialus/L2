#include <stdio.h> 
#include <stdlib.h> 
#include <unistd.h> 
#include <dirent.h> 
#include <string.h>
#include <sys/types.h> 
#include <sys/stat.h> 
//int ty=0;

void updatedb (int argc, const char ** argv) { 
struct dirent **list; 
int i,n,nombre1,nombre2; 
int tot=0,size; 
FILE *fp; 
const char *name; 
const char *nom[2];
char fullname[256]; 
struct stat buf;

 if ( argc != 2 ) { 
	fprintf(stderr,"need one arg. Exiting.\n"); 
	exit(1); 
	} 


	n = scandir ( argv[1], &list, NULL, alphasort);
	
 	if ( n >= 0 ) { 
	/*for(i=0;i<ty;i++){
	printf(" ");
	}*/
	printf("we are in %s -> it's a folder \n",argv[1]); 
	while(n--) { 
	name = list[n]->d_name;	
	nombre1=strlen("./projet2.c");
	nombre2=strlen(name);
	sprintf(fullname,"%s/%s",argv[1],name); 
	if ( ! lstat(fullname,&buf) ) if ( S_ISREG(buf.st_mode) ) { 
	tot += (size = buf.st_size); 
	printf("%s -> it's a file\n",name); 
	} 

	else {
	printf("%s -> it's a folder\n",name); 
		if((strcmp(name,".")!=0)&&(strcmp(name,"..")!=0)){
		/*nom[0]= malloc(nombre1+1);
		nom[1]= malloc(nombre2+1);
		nom[0]=" ";		
		nom[1]=("%s/%s",argv[1],name);*/
		chdir(list[n]->d_name);
		updatedb (2,name);
		chdir("..");
	}
	free(list[n]);
	}
	}
	 free(list); 
	} 
	else{
	printf("we are in %s -> it's a file \n",argv[1]);
	}
	//ty++;
	} 
	
int main (int argc, const char ** argv) { 
	updatedb(argc,argv); 
	return 0;
	 }
