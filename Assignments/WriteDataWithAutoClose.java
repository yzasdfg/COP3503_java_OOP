
public class WriteDataWithAutoClose {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		java.io.File file= new java.io.File("score4.txt");
	
		if(file.exists()){
			System.out.println("file exists!");
			System.exit(0);
		}
		try(java.io.PrintWriter output= new java.io.PrintWriter(file)){
			output.print("John T Smith ");
			output.println(90);
			output.println("JEric K Jones "+85);
			output.println(85);
		}
		
		//No close file statement
	}

}
