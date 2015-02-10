#include"lcg.h"
#include<stdio.h> 
#include<stdlib.h>

int lcg_next(lcg *self){

return((self->a*self->xn+self->c)%self->m);

}
