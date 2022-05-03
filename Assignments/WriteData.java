
public class WriteData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		java.io.File file= new java.io.File("scores.txt");
		if(file.exists()){
			System.out.println("file already exists!");
			System.exit(0);
		}

		//create a file
		java.io.PrintWriter output= new java.io.PrintWriter(file);
		
		//write formatted output to the file
		
		output.print("John T Smith ");
		output.println(90);
		output.println("JEric K Jones "+85);
		output.println(85);
		
		//close file
		output.close();
	}

}
