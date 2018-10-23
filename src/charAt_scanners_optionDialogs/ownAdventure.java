package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class ownAdventure {
	public static void main(String[] args) {
		String ayh =JOptionPane.showInputDialog("Do you want to hear a story?");
		if(ayh.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You're missing out man!");
		}
		else if (ayh.equalsIgnoreCase("yes")) {
			int task = JOptionPane.showOptionDialog(null, "Your hanging out with your friend and he steps on your shoe,\n what do you do?", "Awesome story", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cry", "Run away", "Call mom" }, null);
			if(task == 0) {JOptionPane.showMessageDialog(null, "Your friend feels weird and runs away.");}
			else if(task == 1) {JOptionPane.showMessageDialog(null, "A dog sees you and runs after you for no reason.");}
			else if(task == 2) {JOptionPane.showMessageDialog(null, "Your mom says you're stupid and hangs up.");}
		}
	}

}
