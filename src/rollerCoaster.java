import javax.swing.JOptionPane;

public class rollerCoaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = JOptionPane.showInputDialog("How tall are you in inches?");
		int tall = Integer.parseInt(str);
		if (tall > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the roller coaster.");
		} else {
			JOptionPane.showMessageDialog(null, "YOU CAN'T GO ON THIS RIDE!!");
		}
	}

}
