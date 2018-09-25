package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
	public static void main(String[] args) {
		String ts = JOptionPane.showInputDialog("What is your test scores?");
		double s =Double.parseDouble(ts);
		if (s >= 80) {JOptionPane.showMessageDialog(null, "Nice!");}
		else if (s >= 60 && s < 80) {JOptionPane.showMessageDialog(null, "That's okay.");}
		else if (s < 60) {JOptionPane.showMessageDialog(null, "Oh man! I'm sorry!");}
		else {JOptionPane.showMessageDialog(null, "I'm sorry, what?");}

	}

}
