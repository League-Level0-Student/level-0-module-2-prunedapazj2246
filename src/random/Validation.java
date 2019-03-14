//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i = 0; i<10;i++)	{
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
	
		System.out.println(randomNumber);

		if(randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "You are very good at coding");// 1. Use each value of randomNumber to give the user a random compliment.
		}
		else if(randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "You are a really nice person");
		}
		else if(randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You are really good at drawing");	
		}
		else if(randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You are a really helpful person");	
		}
		else {
		JOptionPane.showMessageDialog(null, "You are very smart");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
}
