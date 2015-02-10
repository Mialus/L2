import java.util.*;
public class Hasard{

public int entier(int n){
	Random rand=new Random();
	
	return (rand.nextInt(n));
	}	
public int entierRel(int n){
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

}