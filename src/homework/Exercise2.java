package homework;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inputString = scanner.nextLine();
		int length =  inputString.length();
		System.out.println("The number of charaters in the given string is: " + length);
		scanner.close();
		
		
	}
	

}
