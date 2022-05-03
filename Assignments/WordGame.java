
/* 
 * 1.3 The program plays a word game with the user. It asks the user to enter:
 * his or her name, his or her age, the name of a city, the name of a college, a profession, 
 * a type of animal and a pet¡¯s name.
 * After the user has entered these items, the program display the following story by
 * inserting the user¡¯s input into the appropriate locations.
 */

/*
 * @author: Yinglun Zhan
 * Date: 5/17/2017
 */

import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter following information
		System.out.println("Enter your name: ");
		String name=input.nextLine();
		
		System.out.println("Enter your age: ");
		String age=input.nextLine();
		
		System.out.println("Enter the name of a city: ");
	    String city=input.nextLine();
		
		System.out.println("Enter the name of a college: ");
		String college=input.nextLine();
		
		System.out.println("Enter a profession: ");
		String profession=input.nextLine();
	
		System.out.println("Enter a type of animal: ");
		String animal=input.nextLine();
		
		System.out.println("Enter a pet's name: ");
		String petname=input.nextLine();
		
		//display result
		System.out.println("There once was a person named " + name + " who lived in " + city + 
				           ". At the age of " + age + ", " + name + " went to college at " 
				           +college + ". " + name + " graduated and went to work as a " + profession+
				           ". Then, " + name +" adopted a(n) " + animal +" named " +petname+ 
				           ". They both lived happily ever after!");
	}

}
