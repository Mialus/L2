import java.util.*;
public class Hasard{

public static int entier(int n){
	Random rand=new Random();
	
	return (rand.nextInt(n));
	}	
public static int entierRel(int n){
Random rand=new Random();
	int i =entier(2);
	if(i==1){
		i=rand.nextInt(n);
	}
	else {
		i=(rand.nextInt(n))*-1;
	}
	return i;
	}

public static void main(String[]args){

	int x;
	
	x=Clavier.saisirInt();
	Ecran.afficher(entier(x));
	
	}
}