import java.awt.* ;
import java.util.*;
import javax.swing.*;
public class FenHorloge{
public static void main(String[]args){
	JFrame fen = new JFrame() ;
	Horloge tes= new Horloge() ;
	JLabel hor = new JLabel();
	
	
	
	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	fen.setSize(30,50);	
	fen.setLocation(50,50);
	fen.setTitle("Horloge");
	fen.setVisible(true);
	fen.add(hor);

	
while (true){
	tes.update();
	hor.setText(tes.toString());
	fen.setVisible(true);
}
}
}