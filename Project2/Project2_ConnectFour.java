import java.util.Scanner;

/**
 *  Connect four is a two-player board game in which the players alternately drop colored disks 
 *  into a seven-column, six-row vertically suspended grid.
 *  The objective of the game is to connect four same-colored disks in a row, a column, or a diagonal 
 *  before your opponent can do likewise. 
 *  The program prompts two players to drop a red or yellow disk alternately. 
 *  Whenever a disk is dropped, the program redisplays the board on the console
 *   and determines the status of the game (win, draw, or continue). 
 */

/**
 * @author Y.Z.
 * Date: 5/27/2017
 *
 */
public class Project2_ConnectFour {



	/** main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare and initialize variables
		boolean isPlayer1Turn=true;
		boolean win=false;
		boolean draw=false;

		// Create and display the board 
		
		String board[][]=createBoard(6, 8);
		displayMatrix(board);

		// Two player drop the disk alternately until a win or draw is reached
		while (!win && !draw){
			isPlayer1Turn=dropTheDisk(board, isPlayer1Turn);
			displayMatrix(board);

			win = checkWin(board, win);
			draw = checkDraw(board, win, draw);
		}

		// Show game result
		displayGameResult(win, draw, isPlayer1Turn);
	}


	/** Create a board with specific number of rows and columns */
	public static String[][] createBoard(int row, int column){

		String[][] matrix=new String[row][column];
		for (int i=0; i<matrix.length; i++){

			for (int j=0; j<matrix[0].length; j++){
				if (j==0)
					matrix[i][j]="|";
				else
					matrix[i][j]=" |";
			}

		}
		return matrix;
	}

	/** Display the current board on the console */
	public static void displayMatrix(String[][] matrix){
		for ( int row=0; row<matrix.length; row++){
			for (int col=0; col<matrix[0].length; col++){
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println("---------------");
	}


	/** Two players drop a red or yellow disk alternately */
	public static boolean dropTheDisk(String[][] matrix, boolean Player1Play){

		Scanner input = new Scanner(System.in);


		String color;
		String diskColor;
		color=(Player1Play)? "red" : "yellow";                //determine who plays the game
		diskColor=(Player1Play)? "R|" : "Y|";

		System.out.print("Drop a " + color + " disk at column (0-6): ");
		int columnNumber = input.nextInt();

		columnNumber=checkInput(columnNumber);
		System.out.println();

		for (int i=matrix.length-1; i>=0; i--){

			if (matrix[0][columnNumber+1]!=" |"){                              //check if the column has space to drop a new disk
				System.out.println("Column is full, please try again.");
				System.out.println();
				break;
			}

			if (matrix[i][columnNumber+1]==" |"){
				matrix[i][columnNumber+1]=diskColor;
				Player1Play=!Player1Play;
				break;
			}
		}
		return Player1Play;
	}





	/** Check if the input column number outside the bound (0-6) */
	public static int checkInput(int input){

		// Create a scanner object
		Scanner newInput = new Scanner(System.in);

		while (input < 0 || input > 6){
			System.out.print("Invalid column number, enter again (0-6): ");
			input= newInput.nextInt();
		}
		return input;
	}


	/** Check if red or yellow win the game */
	public static boolean checkWin(String[][] matrix, boolean win){

		// check if the row has four consecutive same-colored disks
		for (int i=0; i<matrix.length; i++){
			for (int j=1; j<matrix[0].length-3; j++){
				if (matrix[i][j]==matrix[i][j+1] && matrix[i][j+1]==matrix[i][j+2] && matrix[i][j+2]==matrix[i][j+3]
						&& matrix[i][j]!=" |"){
					win=true;
					break;
				}
			}
		}

		// check if the column has four consecutive same-colored disks
		for (int i=matrix.length-1; i>3; i--){
			for (int j=1; j<matrix[0].length; j++){
				if (matrix[i][j]==matrix[i-1][j] && matrix[i-1][j]==matrix[i-2][j] && matrix[i-2][j]==matrix[i-3][j]
						&& matrix[i][j]!=" |"){
					win=true;
					break;
				}
			}
		}

		// check if the diagonal has four consecutive same-colored disks, from top left to bottom right
		for (int i=0; i<matrix.length-3; i++){
			for (int j=1; j<matrix[0].length-3; j++){
				if (matrix[i][j]==matrix[i+1][j+1] && matrix[i+1][j+1]==matrix[i+2][j+2] && matrix[i+2][j+2]==matrix[i+3][j+3]
						&& matrix[i][j]!=" |"){
					win=true;
					break;
				}
			}
		}

		// check if the diagonal has four consecutive same-colored disks, from top right to bottom left
		for (int i=0; i<matrix.length-3; i++){
			for (int j=matrix[0].length-1; j>3; j--){
				if (matrix[i][j]==matrix[i+1][j-1] && matrix[i+1][j-1]==matrix[i+2][j-2] && matrix[i+2][j-2]==matrix[i+3][j-3]
						&& matrix[i][j]!=" |"){
					win=true;
					break;
				}
			}
		}
		return win;
	}

	/** Check if red and yellow draw */
	public static boolean checkDraw(String[][] matrix, boolean win, boolean draw){  

		if (!win){
			outerloop:
				for (int i=0; i<matrix.length && !draw; i++){
					for (int j=1; j<matrix[0].length; j++){

						if (matrix[i][j]==" |"){              // check if the board is full
							draw=false;
							break outerloop;

						}
						else{                               // the board is full, two players draw
							draw=true;
						}
					}
				}
		}
		return draw;
	}

	/** Display the game results, win or draw */
	public static void displayGameResult(boolean win, boolean draw, boolean Player1Play){
		String color;
		color = Player1Play? "yellow":"red";              // determine who wins
		if (win){
			System.out.println("The " +color+ " player won.");

		}else{
			System.out.println("It is a draw.");
		}
	}

}
