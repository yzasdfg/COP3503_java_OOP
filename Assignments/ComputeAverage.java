

/*
 * 1.2 The program asks the user to enter the three test scores, 
 *  display each test score, as well as the average of the scores.
 */

/*
 * @author: Yinglun Zhan
 * Date: 5/17/2017
 */


import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter three numbers		
		System.out.println("Enter the three test scores: ");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();

		//Compute average
		double average=(number1+ number2+ number3)/3;
		//display result
		System.out.println("The average of the three test scores " + number1+ " "+ number2 + " and " + number3+ " is " + average);
	}

}
