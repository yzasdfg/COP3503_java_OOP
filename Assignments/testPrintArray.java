
public class testPrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] correct={'A', 'B', 'C', 'D', 'E'};
		char[] student={'A', 'A', 'C', 'C', 'E'};
		int j=0;
		int[] missed= new int[2];
		while (j<2){
			for (int i = 0; i < correct.length; i++){

				if (student[i] != correct[i]){
					missed[j]=i+1;
					j++;
					continue;

				}
			}
		}
		for (int value:missed)
		System.out.println(value);
	}

}
