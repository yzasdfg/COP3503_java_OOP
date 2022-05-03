
public class DriverExam {

	private static char correct[]= {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'}; 
	private static char student[]=new char[correct.length];
	private static int[] missed;
	private static int numIncorrect=0;
	private static int numCorrect=0;

	/** Get the student's answer */
	public DriverExam(char[] s){
		System.arraycopy(s, 0, student, 0, s.length);
	}


	/** Grade the student's exam and count the number of incorrect answers */
	private static void gradeExam(){
		numIncorrect=0;
		for (int i = 0; i < correct.length; i++){
			if (student[i] != correct[i]){
				numIncorrect++;
			}
		}
	}

	/** Construct the missed array */
	private static void makeMissedArray(){
		DriverExam.gradeExam();
		missed= new int[numIncorrect];
		numIncorrect=0;
		for (int i = 0; i < correct.length; i++){
			if (student[i] != correct[i]){
				missed[numIncorrect]=i+1;
				numIncorrect++;
			}
		}

	}



	/** Returns true if the student passed the exam, or false if the student failed */
	public boolean passed(){
		return totalCorrect() > 14;
	}


	/** Returns the total number of correctly answered questions */
	public int totalCorrect(){
		numCorrect=correct.length-totalIncorrect();
		return numCorrect;
	}


	/** Returns the total number of incorrectly answered questions */
	public int totalIncorrect(){
		DriverExam.gradeExam();
		return numIncorrect;
	}


	/** Returns the questions numbers of the questions that the student missed */
	public int[] questionsMissed(){
		DriverExam.makeMissedArray();
		return missed;
	}

}
