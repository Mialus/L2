#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <dirent.h>
#include <sys/types.h>
#include <sys/stat.h>

void updatedb (int argc, const char ** argv) {

        struct dirent **list;
        int i,n;
        int tot=0,size;
        FILE *fp;
        char *name;
        char fullname[256];
        struct stat buf;

        if ( argc != 2 ) {
                fprintf(stderr,"need one arg. Exiting.\n");
                exit(1);
        }

        printf("we are in %s\n",argv[1]);

        n = scandir   ( argv[1], &list, NULL, alphasort);

        if ( n >= 0 ) {
        while(n--) {
                  name = list[n]->d_name;
                  printf("%s\n",name);
                  sprintf(fullname,"%s/%s",argv[1],name);
                  if ( ! lstat(fullname,&buf) ) 
                  if ( S_ISREG(buf.st_mode) ) {
                                tot += (size = buf.st_size);
                                printf("%s -> it's a file\n",name);
                   }
                   else
                        printf("%s : it's a folder\n",name);
                        free(list[n]);
                }
                free(list);
        }
}

int main (int argc, const char ** argv) {
updatedb(argc,argv);
return 0;
}
