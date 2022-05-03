

/*
 * 1.1 GtA car¡¯s miles-per-gallon (MPG) can be calculated with the following formula:
 * MPG = Miles driven/ Gallons of gas used
 * The program asks the user for the number of miles driven and the gallons of gas used. 
 * Then alculate the car¡¯s MPG and display the result on the screen.
*/

/*
 * @author: Yinglun Zhan 
 * Date: 5/17/2017
 */

import java.util.Scanner;
public class CalculateMPG {

	public static void main(String[] args) {
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter the number of miles driven and the gallons of gas used
	    System.out.println("Enter the number of miles driven: ");
	    double mile = input.nextDouble();
	    
	    System.out.println("Enter the number of gallons of gas used: ");
	    double galon = input.nextDouble();
	    
	    //Compute MPG
	    double MPG = mile/ galon;
	    
	   //display result
	    System.out.println("The car¡¯s MPG is " + MPG);
	    
	}

}
