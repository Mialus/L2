import java.awt.* ;
import java.util.*;
import javax.swing.*;
public class Horloge{
	int h,m,s;

public Horloge(){
	h=GregorianCalendar.getInstance().get(GregorianCalendar.HOUR_OF_DAY);
	m=GregorianCalendar.getInstance().get(GregorianCalendar.MINUTE);
	s=GregorianCalendar.getInstance().get(GregorianCalendar.SECOND);
}

public void update(){
		h = GregorianCalendar.getInstance().get(GregorianCalendar.HOUR_OF_DAY);
		m = GregorianCalendar.getInstance().get(GregorianCalendar.MINUTE);
		s = GregorianCalendar.getInstance().get(GregorianCalendar.SECOND);
	}
	
public String toString(){
	String cha;
	if(h<10){
		
		cha= "0"+h+":";
	}
	else{
		cha=h+":";
	}
	if(m<10){
		
		cha= cha+"0"+m+":";
	}
	else{
		cha=cha+m+":";
	}
	if(s<10){
		
		cha= cha+"0"+s;
	}
	else{
		cha=cha+s;
	}
	return cha;
}
	
	
}