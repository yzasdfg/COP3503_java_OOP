
public class ReadData {
	public static void main(String[] args) throws Exception{
		//Create a file instance
		java.io.File file = new java.io.File("C:\\Inclass\\src\\Score.txt");

		//Create a Scanner for the file
		java.util.Scanner input =new java.util.Scanner(file);

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
