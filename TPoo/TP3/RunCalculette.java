public class RunCalculette{
public static void main(String[]args){

	Calculette cal=new Calculette();
	double x,y;
	char c;
	String ch="";
	boolean error=false;
	
	while (error==false){
	Ecran.afficher("Veuillez saisir votre premier nombre : ");
	ch=Clavier.saisirString();
	error=testReel(ch);
		if (error == false){
			Ecran.afficher("\nErreur !\n");
		}
		}
	x=converse(ch);
	error=false;
	while (error==false){
	Ecran.afficher("Veuillez saisir votre deuxiéme nombre : ");
	ch=Clavier.saisirString();
	error=testReel(ch);
		if (error == false){
			Ecran.afficher("\nErreur !\n");
		}
		}
	y=converse(ch);
	cal.setOperands(x,y);
	error=false;
	while (error == false ){
	Ecran.afficher("Veuillez saisir l'operation a saisir sur ces nombres : ");
	ch=Clavier.saisirString();
	error=testChar(ch);
		if (error == false){
			Ecran.afficher("\nErreur !\n");
		}
		}
	error=false;
	c=converseChar(ch);
	cal.setOperation(c);
	
	
	cal.compute(x,y,c);
	Ecran.afficher(cal.toString());
	
	
}


public static boolean testReel(String ch){
	int i,p=0;
	boolean test=true;
	
	for(i=0;i<ch.length();i++){
		
		if(((ch.charAt(i)==0)||(ch.charAt(i)==1)||(ch.charAt(i)==2)||(ch.charAt(i)==3)||(ch.charAt(i)==4)||(ch.charAt(i)==5)||(ch.charAt(i)==6)||(ch.charAt(i)==7)||(ch.charAt(i)==8)||(ch.charAt(i)==9)||(ch.charAt(i)=='.'))&&(test==true)){
			test=true;
			if(ch.charAt(i)=='.'){
			p=p+1;
				if(p>1){
					test=false;
				}
				
				}
		else {
		test=false;
	}				
	}
	}

	
return test;	
}

public static boolean testChar(String ch){
	int i;
	boolean test=true;
	
	for(i=0;i<1;i++){
		
	if(((ch.charAt(i)=='+')||(ch.charAt(i)=='r')||(ch.charAt(i)=='-')||(ch.charAt(i)=='*')||(ch.charAt(i)=='/')||(ch.charAt(i)=='m')||(ch.charAt(i)=='M')||(ch.charAt(i)=='p'))&&(test==true)){
			test=true;
}
	else {
		test=false;
	}	
	}
return test;
}


public static double converse(String ch){
double d=0;
int k;
	if(testReel(ch)){
		
		k=ch.length();
		d=Double.parseDouble(ch);
		
		}
	
	
	return d;
	}
	
public static char converseChar(String ch){
	char d;
	
	d=' ';
	if(testChar(ch)){
	
		d=ch.charAt(0);
		
		}
	
	
	return d;
	
	
	
	
}
}