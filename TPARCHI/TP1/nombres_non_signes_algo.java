import java.*;
public class nombres_non_signes_algo {
	static int bitCount(int i){
		int compt=0;
	while(i!=0){
		compt=compt+(i&0x01);
	i=i>>>1;
	}
	return compt;
	}
	static int numberOfLeadingZeros(int i){
		int compt=0;
	
		if(i==0){
		compt=0;
		}
		else{
			while((i&0x80000000)!=1){
				compt=compt<<1;
			}
		}
		return compt;
	}
	static int numberOfTrailingZeros(int i){
		int compt=0;
		
	if(i==0){
		compt=0;
	}
	else{
		while((i&0b1)!=1){
			compt=compt+1;
		}
	}
		return compt;
}
	
		
	}
	static int lowestOneBit(int i){
		int compt=0x8000 0000;
	if(i!=0){
		while((i&0x8000 0000)|0x8000 0000){
			i=i<<1;
			compt=compt>>>1;
		}
	}
	else{
		compt=0;
	}
	return compt;
	}
	static int highestOneBit(int i){
		int res=1;
	if((i==0){
		res=0;
	}
	else{
		while{(i&0x8000 0000)==0){
			res=res<<1;
			res=res&0b1;
			i=i<<1;
		}
		res&0b0;
		res=~res;
		}
	}
	return res
	}
	static int reverse(int i){
		int t;
		res=0;
		if(i!=0){
		for(t=0;i<=31){
			res=res<<1;
			res=res&(i&0b1);
			i=i>>>1;
		}
			
		}
		return res;
	}
	static int reverseBytes(int i) {
	}
	public static int fastBitCount(int n){ 
	}
	static char forDigit(int nombre){
	}
	static int digit(char caractere){
	}
	static String toString(int nombre,int base){
	}
	static String toHexString(int nombre){
	}
	static String toBinaryString(int nombre){
	}
	static int parseInt(String chaine,int base){
	}
	public static void main( String[] args ) {
		System.out.println("Manipulation des nombres 32 bits:");
		System.out.println("Integer.bitCount(0x7F000001): "+Integer.bitCount(0x7F000001));
		System.out.println("bitCount(0x7F000001): "+bitCount(0x7F000001));
		System.out.println("fastBitCount(0x7F000001)   : "+fastBitCount(0x7F000001));
		System.out.println("Integer.numberOfLeadingZeros(0x7F000001)  :"+Integer.numberOfLeadingZeros(0x7F000001));
		System.out.println("numberOfLeadingZeros(0x7F000001)  :"+numberOfLeadingZeros(0x7F000001));
		System.out.println("Integer.numberOfTrailingZeros(0x7F000001) :"+Integer.numberOfTrailingZeros(0x7F000001));		
		System.out.println("numberOfTrailingZeros(0x7F000001) :"+numberOfTrailingZeros(0x7F000001));		
		System.out.println("Integer.highestOneBit(0x7F000001) : "+toHexString(Integer.highestOneBit(0x7F000001)));
		System.out.println("highestOneBit(0x7F000001) : "+toHexString(highestOneBit(0x7F000001)));
		System.out.println("Integer.lowestOneBit(0x7F000001)   : "+toHexString(Integer.lowestOneBit(0x7F000001)));
		System.out.println("lowestOneBit(0x7F000001)   : "+toHexString(lowestOneBit(0x7F000001)));
		System.out.println("Integer.reverse(0x7F000001)     	:"+toBinaryString(Integer.reverse(0x7F000001)));
		System.out.println("reverse(0x7F000001)     	:"+toBinaryString(reverse(0x7F000001)));
		System.out.println("Integer.reverseBytes(0x7F000001)  :"+toHexString(Integer.reverseBytes(0x7F000001)));
		System.out.println("reverseBytes(0x7F000001)  :"+toHexString(reverseBytes(0x7F000001)));
		System.out.println("Test des fonctions forDigit et digit :");
		System.out.println("Character.forDigit(2)          :"+Character.forDigit(2,16));
		System.out.println("forDigit(2)                        :"+forDigit(2));
		System.out.println("Character.forDigit(11)       :"+Character.forDigit(11,16));
		System.out.println("forDigit(11)                      :"+forDigit(11));
		System.out.println("Character.digit('2')            :"+Character.digit('2',16));
		System.out.println("digit('2')                           :"+digit('2'));
		System.out.println("Character.digit('B')            :"+Character.digit('B',16));
		System.out.println("digit('B')                          :"+digit('B'));
		System.out.println("Test des fonctions to...String :");
		System.out.println("Integer.toString(127,10)    :"+Integer.toString(127,10));
		System.out.println("toString(127,10)               :"+toString(127,10));
		System.out.println("Integer.toString(127,16)    :"+"0x"+Integer.toString(127,16));
		System.out.println("toString(127,16)                :"+"0x"+toString(127,16));
		System.out.println("Integer.toBinaryString(127) :"+"0b"+Integer.toBinaryString(127));
		System.out.println("toBinaryString(127)            :"+"0b"+toBinaryString(127));
		System.out.println("Integer.toHexString(127)    :"+"0x"+Integer.toHexString(127));
		System.out.println("toHexString(127)                :"+"0x"+toHexString(127));
		System.out.println("Test des fonction parseInt :");
		System.out.println("Integer.parseInt(''1111111'',2):"+Integer.parseInt("1111111",2));
		System.out.println("parseInt(''1111111'',2)       :"+parseInt("1111111",2));
		System.out.println("Integer.parseInt(''7F'',16)   :"+Integer.parseInt("7F",16));
		System.out.println("parseInt(''7F'',16)               :"+parseInt("7F",16));	}
}