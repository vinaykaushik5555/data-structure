package com.ds.problems;

public class ChessBoardGrains {
	
	public  static int  BLOCKS_IN_CHESS=64;
	public static double  number_of_grain=1;

	public static void main(String[] args) {
		for(int i=1;i<=64;i++)
			number_of_grain=2*number_of_grain;
		
		System.out.println(number_of_grain);

	}
	
	
}
