/* 
 * Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with:
 * 4 for Visa cards
 * 5 for Master cards
 * 37 for American Express cards
 * 6 for Discover cards
 * 
 * Almost all credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check,
 *  which can be described as follows (for illustration, consider the card number 4388576018402626):
 *  
 * 1. Double every second digit from right to left. If doubling of a digit results in a two-digit number, 
 * add up the two digits to get a single-digit number.
 * 2 * 2 = 4
 * 2 * 2 = 4
 * 4 * 2 = 8
 * 1 * 2 = 2
 * 6 * 2 = 12 (1 + 2 = 3)
 * 5 * 2 = 10 (1 + 0 = 1)
 * 8 * 2 = 16 (1 + 6 = 7)
 * 4 * 2 = 8
 * 
 * 2. Now add all single-digit numbers from Step 1. 
 * 4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37
 * 
 * 3. Add all digits in the odd places from right to left in the card number.
 * 6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 * 
 * 4. Sum the results from Step 2 and Step 3.
 * 37 + 38 = 75
 * 
 * 5. If the result from Step 4 is divisible by 10, the card number is valid; 
 * otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.
 * 
 * 
 * The program prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. 
 */

/* 
 * @Author: Yinglun Zhan
 * Date: 5/20/2017
 * 
 */

import java.util.Scanner;

public class Project1_CreditCard {
	public static void main(String[] args) {

		// Create a scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a credit card number
		System.out.println("Enter a credit card number as a long integer: ");
		long creditCardNumber = input.nextLong();

		// Display the card number is valid or invalid
		if (isValid(creditCardNumber)) 
			System.out.println(creditCardNumber + " is valid.");
		else 
			System.out.println(creditCardNumber + " is invalid");
	}


	/**Return the number of digits in d */
	public static int getSize(long d) {
		String size = Long.toString(d);
		return size.length();
	}


	/**Return this number if it is a single digit, otherwise, return the sum of the two digits */
	public static int getDigit(int number) {
		if (number<10)
			return number;

		else
			return number/10 + number%10;
	}


	/**Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sumEven = 0;
		//start from the even digit
		number=number/10; 

		while(number>0){
			int even=(int)(number%10);
			sumEven=sumEven+getDigit((int)even*2);
			number=number / 100;
		}
		return sumEven;
	}



	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {

		int sumOdd = 0;
		while (number > 0) {
			int odd=(int)(number % 10);
			sumOdd=sumOdd+odd;
			number=number / 100;
		}
		return sumOdd;
	}


	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}


	/** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k) {
		long  first_k = number;
		if (getSize(number)>=k){

			for (int i = 0; i < getSize(number) - k; i++)
				first_k /= 10;
			return first_k;
		}
		else 
			return number;
	}


	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		boolean valid=(getSize(number) >= 13) && (getSize(number) <= 16) && 
				(prefixMatched(number, 4) || prefixMatched(number, 5) ||prefixMatched(number, 6) || prefixMatched(number, 37))&& 
				(sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
		return valid;
	}
}