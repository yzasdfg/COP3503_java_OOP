import java.util.Scanner;
public class BabyName {


	public static void main(String[] args) throws Exception{
		String s="babynameranking";
		System.out.print("Enter the year: ");
		Scanner input=new Scanner(System.in);
		String year=input.nextLine();
		String filename=s.concat(year);
		//Create a file instance
		java.io.File file = new java.io.File("filename.txt");



		//Read data from a file
		while(input.hasNext()){
			String firstName=input.next();
			String mi=input.next();
			String lastName=input.next();
			String score= input.next();

			System.out.println(firstName+ " "+ mi+ " " +lastName+ " " + score);

		}

		input.close();


	}
}

}
