import java.awt.* ;
import java.util.*;
import javax.swing.*;

public class De{
	int nbrface;
	
	
public De(){
	nbrface=6;
}
public De(int x){
	nbrface=x;
}

public String toString(){
	String cha;
	
	cha= "["+getter()+"]";
return cha;

}
public int getter(){
	
Hasard h=new Hasard();
	
	
return h.entier(nbrface-1)+1;
	
	}
public void main(String[]args){

	nbrface=Clavier.saisirInt();
	Ecran.afficher(toString(nbrface));
	
	
	}
	}