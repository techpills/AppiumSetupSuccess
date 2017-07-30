package javatutorial;

import java.util.Scanner;

public class InputProgram {
	
	public static void main(String args[])
	{
		int n1, n2;
		double typecast=7.5;
		
		Scanner keyboard = new Scanner(System.in);
		
		//n1 = keyboard.nextInt();
		//n2 = keyboard.nextInt();
		
		//System.out.println(n1+ n2);
		
		n1 = (int)typecast;
		
		System.out.println(n1);
		System.out.println(typecast);
		
		String s1 = keyboard.nextLine();
		String s2 = keyboard.nextLine();
		
		System.out.println(s1+ s2);
		
		s1 = keyboard.nextLine(); //To get rid of '\n'
		System.out.println("Next enter a line of text:");
		s1 = keyboard.nextLine();
		System.out.println("You entered: \"" + s1 + "\"");
		
		
		
		
		
	}

}
