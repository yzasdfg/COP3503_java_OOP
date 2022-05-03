import java.util.Scanner;

public class ReadFileFromURL {
	public static void main(String[] args) {
		final int length=1000;
		double sumAssistant=0;
		double sumAssociate=0;
		double sumFull=0;
		double sum=0;
		int countAssistant=0;
		int countAssociate=0;
		int countFull=0;

		double avgAssistant=0;
		double avgAssociate=0;
		double avgFull=0;
		double avgFaculty=0;
		/*String[] firstName=new String[1000];
		String[] lastName=new String[1000];
		String[] rank=new String[1000];
		String[] salary=new String[1000];*/

		System.out.print("Enter a URL: ");   
		String URLString = new Scanner(System.in).next();

		try {
			java.net.URL url = new java.net.URL(URLString); 
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				//for(int i=0; i<length; i++){

				String firstName=input.next();

				String lastName=input.next();
				String rank=input.next();
				double salary= input.nextDouble();


				/*firstName[i]=input.next();		
					lastName[i]=input.next(); 
					rank[i]= input.next();
					salary[i]=(String)input.next();*/
				switch(rank){
				case "assistant":
					sumAssistant=sumAssistant+salary;
					countAssistant++;
					break;
				case "associate":
					sumAssociate=sumAssociate+salary;
					countAssociate++;
					break;
				case "full":
					sumFull=sumFull+salary;
					countFull++;
					break;					
				}
				/*
				if (rank=="assistant"){
					sumAssistant=+salary;
				}
				else if(rank=="associate"){
					sumAssociate=sumAssociate+salary;
				}
				else{
					sumFull=sumFull+salary;
				}
				 */
				sum=sumAssistant+sumAssociate+sumFull;

				avgAssistant=sumAssistant/countAssistant;
				avgAssociate=sumAssociate/countAssociate;
				avgFull=sumFull/countFull;
				avgFaculty=sum/length;
				System.out.println(rank+" "+salary+" "+countAssociate);


			}

			input.close();
			//} 
			System.out.println("The total salary for assistant professors is "+ sumAssistant);
			System.out.println("The total salary for associate professors is "+ sumAssociate);
			System.out.println("The total salary for full professors is "+ sumFull);
			System.out.println("The total salary for all faculty is "+ sum);
			System.out.println("The average salary for assistant professors is "+ avgAssistant);
			System.out.println("The average salary for associate professors is "+ avgAssociate);
			System.out.println("The average salary for full professors is "+ avgFull);
			System.out.println("The average salary for all faculty is "+ avgFaculty);

		}
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		}
		catch (java.io.IOException ex) {
			System.out.println("IO Errors");
		}
	}
}   

