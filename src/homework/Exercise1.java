package homework;

import java.util.Scanner;

public class Exercise1 {
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in); 
	   
	   System.out.print("Enter a number: ");
	   double number = scanner.nextDouble();
	   
	   double sineValue = Math.sin(number);
	   double cosineValue = Math.cos(number);
	   double squareRootValue = Math.sqrt(number);
	   
	   System.out.println("sin(" + number + ") = " + sineValue);
	   System.out.println("cos(" + number + ") = " + cosineValue);
	   System.out.println("sprt" + number +   " = " + squareRootValue);
	   
	   scanner.close();
			   
   }
}
   
