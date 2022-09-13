package tic_tac_toe_game;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class TicTacToeGame {
	
	static ArrayList<Integer> player_spaces = new ArrayList<Integer>();
	static ArrayList<Integer> cpu_spaces = new ArrayList<Integer>();
	static int total = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] gameBoard =  { { ' ' , '|' , ' ' , '|' , ' '} , 
								{ '-' , '+' , '-' , '+' , '-'} , 
								{ ' ' , '|' , ' ' , '|' , ' '} ,
								{ '-' , '+' , '-' , '+' , '-'} , 
								{ ' ' , '|' , ' ' , '|' , ' '}} ;
		printGameBoard(gameBoard);
		int csp = 0;
		int psp = 0;
		
		String result = "";
		while(result.equals("")) {
			
			result = checkWinner();
			
			System.out.println("Choose a space (1 -> 9) : ");
			
			Scanner sr = new Scanner(System.in);
			psp = sr.nextInt();
			
			while (cpu_spaces.contains(psp) | player_spaces.contains(psp)) {
				System.out.println("That space is taken!");
				psp = sr.nextInt();
			}
			
			
			
			enterPiece(gameBoard, psp, "player");
			
			Random rand = new Random();
			csp = rand.nextInt(9) + 1;
			
			while (player_spaces.contains(csp) | cpu_spaces.contains(csp)) {
				csp = rand.nextInt(9) + 1;
			}
			
			
			System.out.println(csp);
			enterPiece(gameBoard, csp, "cpu");
			
			
			printGameBoard(gameBoard);
			
			
		}
		System.out.println(result);
		

	}
	
	public static void printGameBoard(char[][] gameBoard) {
		for (char[] row : gameBoard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static void enterPiece(char[][] gameBoard, int sp , String user) {
		
		char symbol = ' ';
		
		if (user.equals("player")) {
			symbol = 'X';
			player_spaces.add(sp);
		}else if (user.equals("cpu")) {
			symbol = 'O';
			cpu_spaces.add(sp);
		}
		
		switch(sp) {
			case 1 : 
				gameBoard[0][0] = symbol;
				break;
			case 2 : 
				gameBoard[0][2] = symbol;
				break;
			case 3 : 
				gameBoard[0][4] = symbol;
				break;
			case 4 : 
				gameBoard[2][0] = symbol;
				break;
			case 5 : 
				gameBoard[2][2] = symbol;
				break;
			case 6 : 
				gameBoard[2][4] = symbol;
				break;
			case 7 : 
				gameBoard[4][0] = symbol;
				break;
			case 8 : 
				gameBoard[4][2] = symbol;
				break;
			case 9 : 
				gameBoard[4][4] = symbol;
				break;
			default :
				break;
	}
	}
	
	public static String checkWinner() {
		
		List toprow = Arrays.asList(1,2,3);
		List midrow = Arrays.asList(4,5,6);
		List botrow = Arrays.asList(7,8,9);
		List leftcol = Arrays.asList(1,4,7);
		List midcol = Arrays.asList(2,5,8);
		List rightcol = Arrays.asList(3,6,9);
		List diag1 = Arrays.asList(1,5,9);
		List diag2 = Arrays.asList(3,5,7);
		
		List<List> winning = new ArrayList<List>();
		
		winning.add(toprow);
		winning.add(midrow);
		winning.add(botrow);
		winning.add(leftcol);
		winning.add(midcol);
		winning.add(rightcol);
		winning.add(diag1);
		winning.add(diag2);
		
		total = player_spaces.size() + cpu_spaces.size();
		
		for (List l : winning) {
			if (player_spaces.containsAll(l)) {
				System.out.println(total);
				return "You won!";
			}
			else if(cpu_spaces.containsAll(l)) {
				return "Oh no, you lost!";
			} 
			
			else if(total == 9) {
				return "Its a tie!";
			}
			
		}
		return "";
		
	}
	
}
