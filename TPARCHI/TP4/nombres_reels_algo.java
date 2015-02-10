public class nombres_reels_algo{
	static int getSigne(float reel){
		return ( Float.floatToIntBits(reel)>>>31);
	}
	static int getExposant(float reel){
		
	return(((Float.floatToIntBits(reel)<<1)>>>24)-127);
		
	}
	static int getMantisse(float reel){
		return ( (Float.floatToIntBits(reel)& 0x7FFFFFFF)|80000000);

	}
	static float setSigne(float reel,int signe){
		return(Float.intBitsToFloat(((Float.floatToIntBits(reel)<<1)>>>1)|(signe<<31)));
		
	}
	static float setExposant(float reel,int exposant){
		return(Float.intBitsToFloat((Float.floatToIntBits(reel)&0x7FFFFFFF)|((exposant+127)<<24)));
		
	}
	static float setMantisse(float reel,int mantisse){
		return(Float.intBitsToFloat((Float.floatToIntBits(reel)&0x007FFFFF)|(mantisse & 0x7FFFFFFF)));
		
		
	}
	static String toHexString(float reel){
		String chane =" ";
		int mantisse,exposant;
		
		if (getSigne(reel)==1){
			chane = "-0x1";
		}
		else {
			chane = "+0x1";
		}
		mantisse = getMantisse(reel)& 0x7FFFFF;
		do  {
			chane = chane + forDigit((mantisse & 0x007800000)>>>19));
			mantisse = mantisse<<4;
		}
		while ( mantisse == 0);
		
		exposant = getExposant(reel);
		chane = chane +'p'+ exposant ;
		return(chane);
	
		
	}
	static float parseFloat(String chaine){
		String ls;
		int position, dcalage, mantisse, exposant;
		float reel;
		
		nombre =0;
		dcalage=19;
		position=5;
		mantisse=0;
		
		if( char(chane,0)!='-'){
			nombre =...;
		}
		
		While(char(chane,position)!='p'){
			mantisse = ...;
			position=position+1;
			dcalage=dcalage-4;
		}
		nombre=setMantisse(nombre,mantisse);
		position = position +...;
		ls =String.stringpos(chane,position);
		exposant = parseInt(...,10);
		nombre = setExposant(nombre,exposant);
		return nombre;
	}
	static float maximum(){
		
	}
	public static void main( String[] args ) {	
		
		float f=0;
		System.out.println("Test get...");
		System.out.println("getSigne(125.25f)         ="+getSigne(125.25f));
		System.out.println("getMantisse(125.25f)     ="+Integer.toHexString(getMantisse(125.25f)));
		System.out.println("getExposant(125.25f)     ="+getExposant(125.25f));
		System.out.println("Test set...");
		f=setSigne(f,0); f=setExposant(f,6); f=setMantisse(f,0xFA8000);
		System.out.println("125.25=" +f);
		System.out.println("Test toHexString et parseFloat");
		System.out.println("Float.toHexString(125.25f)      ="+Float.toHexString(+125.25f));
		System.out.println("toHexString(125.25f)      ="+toHexString(+125.25f));
		System.out.println("Float.toHexString(-0.375f)      ="+Float.toHexString(-0.375f));
		System.out.println("toHexString(-0.375f)      ="+toHexString(-0.375f));
		System.out.println("Float.parseFloat(+0x1.f5p6)    ="+Float.parseFloat("+0x1.f5p6"));
		System.out.println("parseFloat(+0x1.f5p6)    ="+parseFloat("+0x1.f5p6"));
		System.out.println("Float.parseFloat(-0x1.8p-2)    ="+Float.parseFloat("-0x1.8p-2"));
		System.out.println("parseFloat(-0x1.8p-2)    ="+parseFloat("-0x1.8p-2"));
		System.out.println("Test Maximum");		
		System.out.println("Maximum      ="+Float.toHexString(maximum()));
	}
} 

