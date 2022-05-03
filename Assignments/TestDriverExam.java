/* 
 * A student must correctly answer 15 of the 20 multiple choice questions to pass the driver license exam.
 * Write a class named DriverExam that holds the correct answers to the exam in an array field. 
 * The class have the following methods:
 * an array field that holds the student's answers. The class
 * should have the following methods:
 *  1. passed. Returns true if the student passed the exam, or false if the student failed
 *  2. totalCorrect. Returns the total number of correctly answered questions
 *  3. totalIncorrect. Returns the total number of incorrectly answered questions
 *  4. questionsMissed. An int array containing the question numbers of the questions that the student missed
 *
 * Demonstrate the class in a complete program that asks the user to enter a student's answers, 
 * and then displays the results returned from the DriverExam class's methods.
 *
 * Input Validation: Only accept the letters A, B, C, or D as answers.
 *
 */

/* 
 * @Author: Yinglun Zhan
 * Date: 5/29/2017
 * 
 */
import java.util.Scanner;

public class TestDriverExam {


	/** Main method*/ 
	public static void main(String[] args) {

		char[] studentAnswer=getStudentInput();
		DriverExam exam1= new DriverExam(studentAnswer);

		// Display the number of correct and incorrect answers
		System.out.println("Correct answer: " + exam1.totalCorrect());
		System.out.println("Incorrect answer: " + exam1.totalIncorrect());

		// Display if the student passed the exam or not
		String result = exam1.passed()?  "passed": "failed";			
		System.out.println("You " +result+ " the exam");

		// Display the question numbers that the student missed
		System.out.println("You missed the following questions: ");
		exam1.questionsMissed();
		for (int value:exam1.questionsMissed())
			System.out.print(value+ " ");

	}		


	/** Get student's written portion of the driver's license exam */
	public static char[] getStudentInput(){

		// Create a scanner object
		Scanner scan= new Scanner(System.in);

		// Students' answers to the questions, stored in a array
		char studentAnswer[]= new char[20];
		String input;

		System.out.println("Enter your answers to the exam questions. (Make sure Caps Lock is ON!)" );

		for (int i = 0; i<studentAnswer.length; i++){
			System.out.print("Question " + (i+1) + ": ");
			input=scan.nextLine();
			studentAnswer[i]=input.charAt(0);

			// Check if the input is valid
			if (studentAnswer[i]!='A'&&studentAnswer[i]!='B'&&studentAnswer[i]!='C'&&studentAnswer[i]!='D'){
				System.out.println("ERROR: Valid answers are A, B, C, or D" );
				i=i-1;
				continue;
			}			
		}
		return studentAnswer;
	}

}
