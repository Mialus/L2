#include<stdio.h> 
#include<stdlib.h>


struct lcg {
int a;
int xn;
int c;
int m;
};
/* initialize the parameters of self */
void lcg_param(struct lcg *self, int mult, int incr, int mod);
/* initialize self (similar to srand()) */
void lcg_seed(struct lcg *self, int n);
/* get the next random number (similar to rand()) */
int lcg_next(struct lcg *self);
/* get the max that self can return (similar to RAND_MAX) */
int lcg_max(struct lcg *self);

