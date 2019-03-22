package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rand = new Random();
int r = rand.nextInt(10);
int r2 = rand.nextInt(10);
int r3 = rand.nextInt(10);
int r4 = rand.nextInt(10);
int r5 = rand.nextInt(10);

JOptionPane.showMessageDialog(null, r + "" + r2 + r3 + r4 + r5);

}
}
