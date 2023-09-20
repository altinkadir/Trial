package com.neotech.oh071223;

import java.util.Arrays;

public class TwoDChessBoard {

	public static void main(String[] args) {

		
	//	Given a 8x8 two-dimensional array of strings named chessboard. 
	//	Initialize values inside an array accordingly to the chess board. 
	//	So first element in the array, 
	//	chessboard[0] should have a value "1a", 
	//	and last element in the array, 
	//	chessboard[7] should have a value "8h".

		String[][] chessboard = new String[8][8];
		
		String[] rows = {"1", "2", "3", "4", "5", "6", "7", "8"};
		String[] cols = {"a", "b", "c", "d", "e", "f", "g", "h"};
		
		
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
			chessboard[i][j] = rows[i] + cols[j];
				
			}
	}
		
		
		System.out.println(Arrays.deepToString(chessboard));
		
//		System.out.println(chessboard[7][7]);		
		
		
		/*
		 * for (int i = 0; i < 8; i++) { for (int j = 0; j < 8; j++) {
		 * System.out.println(chessboard[i][j]); } }
		 */	
		
		
		
		
		
		//
		
	}

}
