package StacjaPogodowaExercise.Obserwatorzy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrzykladObserwatoraSwing {
	JFrame frame;

	public static void main(String[] args) {
		PrzykladObserwatoraSwing przyklad = new PrzykladObserwatoraSwing();
		przyklad.uruchom();
	}

	private void uruchom() {
		frame = new JFrame();
		JButton button = new JButton("Czy powinienem to zrobić?");
		button.addActionListener(new AniolSluchacz());
		button.addActionListener(new DiabelSluchacz());
		frame.getContentPane().add(BorderLayout.CENTER, button);

		//parametry okienka
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
class AniolSluchacz implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("Nie rób tego! Możesz później żałować!!!");
	}
}

class DiabelSluchacz implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		System.out.println("Tak! Zrób to!!!");
	}
}
