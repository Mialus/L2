import java.awt.*;
import javax.swing.*;

public class FenParameters {
	
	private JFrame afficheFenetre () {
		
		JFrame fen = new JFrame();
		fen.setSize(300,300);
		fen.setLocation(550,550);
		fen.setTitle("Choisissez vos param�tres");
		Container intFen = fen.getContentPane();
		intFen.setLayout(new FlowLayout());
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fen.setVisible(true);
		
		JButton b1 = new JButton("Quitter");
		//a chaque fois que l'on va cliquer sur le bouton, la fontion actionPerformed sera appell�e //
		b1.addActionListener(this);
		intFen.add(b1);
		fen.setVisible(true);
		
		return fen ;
	}
	
	public void actionPerformed(ActionEvent e) {
		fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}