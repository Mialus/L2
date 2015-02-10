import java.awt.* ;
import javax.swing.*;
public class VoirFenetre{
public static void main(String[]args){
JFrame fen = new JFrame() ;
fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
fen.setSize(300,500);	
fen.setLocation(50,50);
fen.setTitle("Premiere Fenetre");
fen.setVisible(true);
}
}