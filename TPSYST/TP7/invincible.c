#include <stdio.h>
#include <stdlib.h>
#include <signal.h>

static int c = 1;
static int t = 1;

void siginthandler(){
  
  if(c<t){
  printf(" Boom!\n");
  c++;
  }

  if(t==c){
  printf(" KABOOM!\n");
  exit(1);
  }
}

int main(int argc, char** argv){

  if(argc>1){
    t=atoi(argv[1]);
  }
      signal(SIGINT, siginthandler);
      while(1);
      return 0;
}
