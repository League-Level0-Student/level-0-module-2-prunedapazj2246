d//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

public static void main(String[] args) {
	
	// 1. Make a main method that includes all the steps below….

Random rand = new Random();
 int r =rand.nextInt(4);// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	System.out.println(r);// 3. Print out this variable

	JOptionPane.showInputDialog("enter a question for the magic 8 ball.");// 4. Get the user to enter a question for the 8 ball

	if(r==0) {
	JOptionPane.showMessageDialog(null, "YES!!");	// 5. If the random number is 0
	}

	// -- tell the user "Yes"

	else if(r==1) {
		JOptionPane.showMessageDialog(null, "NO!!");// 6. If the random number is 1
	}

	// -- tell the user "No"

	else if(r==2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");// 7. If the random number is 2
	}
	// -- tell the user "Maybe you should ask Google?"

	else{
		JOptionPane.showMessageDialog(null, "MAYBE YOU SHOULD WRITE YOUR OWN AWNSER!!!");// 8. If the random number is 3
	}

	// -- write your own answer

}
}
