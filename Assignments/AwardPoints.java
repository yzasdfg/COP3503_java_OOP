/* 
 * 1.5  Serendipity Booksellers has a book club that awards points to its customers 
 * based on the number of books purchased each month. 
 * The program asks the user to enter the number of books that he or she has purchased this month 
 * and then displays the number of points awarded.
 */

/*
 * @author: Yinglun Zhan
 * Date: 5/17/2017
 */

import java.util.Scanner;

public class AwardPoints {
	
	public static void main(String[] args) {
		int point;
		
	// Create a scanner object
	Scanner input=new Scanner(System.in);
    
	// Prompt the user to enter the number of books purchased each month
	System.out.println("Enter the number of books(starts from 0) purchased each month: ");
	int book=input.nextInt();
	
	//get points by using switch statement
	switch(book)
	{
	case 0:	
	    point=0;
	    break;
	
	case 1:
		point=5;
	    break;

	case 2:
		point=15;
		break;

	case 3:
		point=30;
		break;
		
		default:
			point=60;
	 }
  
	// Display the result
	System.out.println("You purchased " +book+ " books this month, you earn " +point+ " points.");
	}
}
