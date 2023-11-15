import java.util.Scanner;

/**
 * Copyright 2023 All rights reserved. No Copy!!
 * 
 * Tic-Tac-Toe
 * 
 */

public class ttt {
/**
 * drawBoard draws the current board
 * @param boxes which is a 2d array
 */
Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		char[][] boxes = {
				{'1','2','3'},
				{'4','5','6'},
				{'7','8','9'}
		};
 
		
		
		drawBoard(boxes);
//		boxes[2][0] = 'x';
		
		
	}
	public static void drawBoard(char[][] boxes) {
		System.out.println("*************");
		System.out.println("* " + boxes[0][0] + " * " + boxes[0][1] + " * " + boxes[0][2] + " *");
		System.out.println("* " + boxes[1][0] + " * " + boxes[1][1] + " * " + boxes[1][2] + " *");
		System.out.println("* " + boxes[2][0] + " * " + boxes[2][1] + " * " + boxes[2][2] + " *");
		System.out.println("*************");
	}
	
	public boolean threeInARow(char[][] boxes) {
		//x top line
		if (boxes[0][0] == 'x' && boxes[0][1] == 'x' && boxes[0][2] == 'x') {
			return true; 
		}
		//o top line
		else if (boxes[0][0] == 'o' && boxes[0][1] == 'o' && boxes[0][2] == 'o'){
			return true;
		}
		// x mid line
		else if (boxes[1][0] == 'x' && boxes[1][1] == 'x' && boxes[1][2] == 'x'){
			return true;
		}
		// o mid line
		else if (boxes[1][0] == 'o' && boxes[1][1] == 'o' && boxes[1][2] == 'o'){
			return true;
		}
		// x bottom line
		else if (boxes[2][0] == 'x' && boxes[2][1] == 'x' && boxes[2][2] == 'x'){
			return true;
		}
		// o bottom line
		else if (boxes[2][0] == 'o' && boxes[2][1] == 'o' && boxes[2][2] == 'o'){
			return true;
		}
		// x first col
		else if (boxes[0][0] == 'x' && boxes[1][0] == 'x' && boxes[2][0] == 'x'){
			return true;
		}
		// o first col
		else if (boxes[0][0] == 'o' && boxes[1][0] == 'o' && boxes[2][0] == 'o'){
			return true;
		}
		// x second col
		else if (boxes[0][1] == 'x' && boxes[1][1] == 'x' && boxes[2][1] == 'x'){
			return true;
		}
		// o second col
		else if (boxes[0][1] == 'o' && boxes[1][1] == 'o' && boxes[2][1] == 'o'){
			return true;
		}
		// x third col
		else if (boxes[0][2] == 'x' && boxes[1][2] == 'x' && boxes[2][2] == 'x'){
			return true;
		}
		// o third col
		else if (boxes[0][2] == 'o' && boxes[1][2] == 'o' && boxes[2][2] == 'o'){
			return true;
		}
		// x first diag
		else if (boxes[0][0] == 'x' && boxes[1][1] == 'x' && boxes[2][2] == 'x'){
			return true;
		}
		// o first diag
		else if (boxes[0][0] == 'o' && boxes[1][1] == 'o' && boxes[2][2] == 'o'){
			return true;
		}		
		// x second diag
		else if (boxes[0][2] == 'x' && boxes[1][1] == 'x' && boxes[2][0] == 'x'){
			return true;
		}
		// o second diag
		else if (boxes[0][2] == 'o' && boxes[1][1] == 'o' && boxes[2][0] == 'o'){
			return true;
		}
		else {
			return false; 
		}

	}
}
