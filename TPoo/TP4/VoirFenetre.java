import java.awt.* ;
import javax.swing.*;
public class VoirFenetre{
public static void main(String[]args){
	JFrame fen = new JFrame() ;
	Container contFen = fen.getContentPane();
	JButton bQuitter = new JButton("Quitter");
	JButton bSauve = new JButton("Sauvegarder");
	JCheckBox ccChoix1 = new JCheckBox("Java est génial") ;
	JCheckBox ccChoix2 = new JCheckBox("J’aime la Programmation Objet") ;
	JCheckBox ccChoix3 = new JCheckBox("J’aime aussi les jeux vidéo") ;
	JCheckBox ccChoix4 = new JCheckBox("J’aime aussi les jeux vidéo") ;
	JRadioButton ccChoix5 = new JRadioButton("J'accepte les termes du contrat");
	JRadioButton ccChoix6 = new JRadioButton("Je refuse les termes du contrat");
	ButtonGroup group1 = new ButtonGroup();
	
	fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	fen.setSize(300,500);	
	fen.setLocation(50,50);
	fen.setTitle("Premiere Fenetre");
	fen.setVisible(true);
	contFen.setLayout(new FlowLayout());
	contFen.add(bQuitter);
	bQuitter.setEnabled(true);;
	contFen.add(bSauve);
	bSauve.setEnabled(false);;
	contFen.add(ccChoix1);
	contFen.add(ccChoix2);
	contFen.add(ccChoix3);
	contFen.add(ccChoix4);
	group1.add(ccChoix5);
	group1.add(ccChoix6);
	contFen.add(ccChoix6);
	contFen.add(ccChoix5);
	fen.setVisible(true);
	
	}
}