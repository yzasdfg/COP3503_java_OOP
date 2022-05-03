import java.lang.Math;
import java.util.Random;
import java.text.DecimalFormat;

public class CreateDataset_24{
	public static void main(String[] args) throws Exception{
		
		String rank="assistant";
		double salary=0;
		
		//for ( int i=0; i<1000; i++){
		//int rank=(int) Math.ceil(Math.random() *3);
		Random random=new Random();
		//int rank=random.nextInt(3);
		java.io.File file= new java.io.File("Salary.txt");
		//System.out.println(Math.floor(Math.random()*3));
		/*if(file.exists()){
			System.out.println("file exists!");
			System.exit(0);
		}*/
		try(java.io.PrintWriter output= new java.io.PrintWriter(file)){

			for( int i=0; i<1000; i++){
				String result=getRankAndSalary(rank, salary);
				
				output.println("FirstName" +(i+1)+ " LastName"+(i+1)+" "+result);
	
			
			}
		//	output.println(result);

		}

		//No close file statement
	}
	public static String getRankAndSalary(String rank, double salary){
		
		/* double angle = 20.3034;

		    DecimalFormat df = new DecimalFormat("#.00");
		    String angleFormated = df.format(angle);*/
		int rankNumber=(int) Math.ceil(Math.random() *3);
		switch(rankNumber){
		case 1:
			salary=Math.random()*30000+50000;
			
			break;
		case 2:
			rank="associate";
			salary=Math.random()*50000+60000;
			break;
		case 3:
			rank="full";
			salary=Math.random()*55000+75000;
			break;
		}
		 DecimalFormat salaryFormat = new DecimalFormat("#.00");
		 String salaryTwoDecimal = salaryFormat.format(salary);

		return rank+ " " +salaryTwoDecimal;
	}
}




