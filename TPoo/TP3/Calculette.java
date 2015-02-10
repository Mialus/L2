public class Calculette{
	double x1,x2,result;
	boolean error;
	char op;
	
public double addition(double x,double y){
	
	return (x+y);
}
public double resteDivision(double x,double y){
	
	return ((int)x % (int)y);
}

public double soustraction(double x,double y){
	
	return (x-y);
}

public double multiplication(double x,double y){
	
	return (x*y);
}

public double division(double x,double y){
	
	return (x/y);
}

public double minimun(double x,double y){
	
	if (x<=y) {
		
		return x;
	}
	
	else{
		
		return y;
	}
}

public double maximun(double x,double y){
	
	if (y<=x){
		
		return x;
	}
	else{
		return y;
	}
}

public double puissance(double x,double y){
	
	if (y>0){
		
		return x*puissance(x,y-1);
	}
	else {
		return 1;
	}
	
}

public void setOperands(double x,double y){
	
	x1=x;
	x2=y;
}

public void setOperation(char c){
	
	op=c;
}

public double compute(double x1,double x2, char op){
	error = false;
	
	if ( (op=='+')||(op=='-')||(op=='*')||(op=='/')||(op=='m')||(op=='M')||(op=='P')){
	switch (op) {
		case ('+') : {
			result=addition(x1,x2);
		}
		break;
		
		case ('-') : {
			result=soustraction(x1,x2);
		}
		break;
		
		case ('*') : {
			result=multiplication(x1,x2);
		}
		break;
		
		case ('/') : {
			result=division(x1,x2);
		}
		break;
		
		case ('m') : {
			result=minimun(x1,x2);
		}
		break;
		
		case ('M') : {
			result=maximun(x1,x2);
		}
		break;
		
		case ('P') : {
			result=puissance(x1,x2);
		}
		break;
		case ('%') : {
			result=resteDivision(x1,x2);
		}
		break;
	}
}
	else {
		error = true;
	}
	
	
	
	return result;
}

public String toString(){
	String cha="";
	
	
	if (error==true){
		cha="Error !";
	}
	else{
		switch  (op){
			case '+' : {
				cha= Entier(x1)+" + "+Entier(x2)+" = "+Entier(result);
	
			}
			break;
				case '*' : {
				cha= Entier(x1)+" * "+Entier(x2)+" = "+Entier(result);
	
			}
			break;
			case '/' : {
				cha= Entier(x1)+" / "+Entier(x2)+" = "+Entier(result);
	
			}
			break;
			case '-' : {
				cha= Entier(x1)+" - "+Entier(x2)+" = "+Entier(result);
	
			}
			break;
			case 'm' : {
				cha="Le minimun entre "+Entier(x1)+" et "+Entier(x2)+" est "+Entier(result);
	
			}
			break;
			case 'M' : {
				cha= "Le maximun entre "+Entier(x1)+" et "+Entier(x2)+" est "+Entier(result);
	
			}
			break;
			case 'r' : {
				cha= "Le reste de la division de "+Entier(x1)+" par "+Entier(x2)+" est "+Entier(result);
	
			}
			break;
			case 'p' : {
				cha= Entier(x1)+" Puissance "+Entier(x2)+" = "+Entier(result);
	
			}
			break;
				}
	

}
	return cha;
}

public Calculette() {
	
	error=true;
}
public Calculette(double x_1,double x_2,char o_p){

	x1=x_1;
	x2=x_2;
	op=o_p;
	
}
public String Entier(double x){
	
	String ch;
	
	if( (x % 1)==0){
		
	ch= (int)x+"";
	}
	else{
		ch = x + "";
	}
	return ch;
}
}
