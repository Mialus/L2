#include"lcg.h"
#include<stdio.h> 
#include<stdlib.h>

void lcg_param(lcg *self, int mult, int incr, int mod){
	*self.a=mult;
	*self.m=mod;
	*self.c=incr;

}
