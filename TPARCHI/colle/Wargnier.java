import java.*;
public class Wargnier{
    static void Aff(int n){ System.out.println("0b"+Integer.toBinaryString(n) );}
    static void question(String s) {System.out.println(s);}
    public static void main( String[] args ) {
//Exercice 1
//Question 1
	    int val32=0xFEFEF000;
	    Aff(val32);
//Question 2

//Question 3
	    System.out.println(0x3F800000);
//Exercie 2
//Question 1
	    int n;
	    Ecran.afficher("\nEntrer un entier positif\n");
	    n=Clavier.saisirInt();
	    Ecran.afficher("\n");
	    n=Float.floatToIntBits(n);
	    Aff(n | 0x00000000);
//Question2
	    int reel = Clavier.saisirInt();
	    int signe =(((Float.floatToIntBits(reel)<<1)>>>24)-127);
}
}