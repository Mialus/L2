import java.*;
public class nombres_non_signes_expression {
    static void Aff(int n){ System.out.println("0x"+Integer.toHexString(n)+"  0b"+Integer.toBinaryString(n) );}
    static void question(String s) {System.out.println(s);}
    public static void main( String[] args ) {
        int x = 0xFF00FF00  , y  = 0x12FF34FF;
        int a = Integer.parseInt("10010001",2);int b = Integer.parseInt("111100",2);int m = Integer.parseInt("11110000",2);
        question("question 1");
        System.out.println(0xC6);//Affiche en d?cimal
	System.out.println(0b1);
	System.out.println(0011);
	System.out.println(067);
        question("question 2");
        Aff(1);//Affiche en hexad?cimal et binaire
	Aff(0);
	Aff(127);
	Aff(128);
	Aff(129);
        question("question 3");
        Aff(x & y);
	Aff(x | y);
	Aff(x ^ y);
	Aff(x <<4);
	Aff(x >>>4);
        question("question 4 - Effacer MSB");
        Aff(x | 0x80000000);
	Aff((x<<1)>>>1);
	Aff(x & 0x7FFFFFFF);
        question("question 5 - Positionner MSB");
	Aff(x | 0x80000000);
        question("question 6 - Transferer MSB -> LSB");
	Aff((x>>>1)|(y>>>31));
        question("question 7 - Transferer LSB -> MSB");
	Aff(((x>>>23)<<23)|(y<<9)>>>9);
        question("question 8 - Effacer b30 a b23 ");
	Aff(x&0x807FFFFF);
        question("question 9 - Transferer b30 a b23 dans bits poids faibles");
	Aff((x>>23)&0xFF);
        question("question 10 - Transferer bits poids faibles dans b30 a b23");
	Aff((x&0x807FFFF)|(y<<24)>>>1);
        question("question 11 - Effacer b22 a b0");
	Aff((x>>>23)<<23);
        question("question 12 - Transferer b22 a b0");
	Aff(((x>>>23)<<23)|((y<<9)>>>9));
        question("question 13 - Transferer b22 a b0 avec b23=1");
	Aff(((y<<9)>>>9)|(1<<23));
        question("question 14 - Donnee taille inconnue");
	Aff(x&~(0xC));
        question("question 15 - Rotation droite 1 rang");
	Aff(Integer.rotateRight(y,1));
        question("question 16 - Rotation gauche 1 rang");
	Aff(Integer.rotateLeft(y,1));
        question("question 17 - Rotation droite /gauche n rangs (n=3)");
	Aff(Integer.rotateRight(y,3));
        Aff(Integer.rotateLeft(y,3));
        question("question 18 - Fusion");

    }
}