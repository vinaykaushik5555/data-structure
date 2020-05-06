package com.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	
	public static int[] buubleSort(int[] items) {
		
		for(int i=0;i<items.length;i++) {// pass loop 
			for (int j = 0; j < items.length-1; j++) {
				if (items[j]>items[j+1]) {
					int temp=items[j];
					items[j]=items[j+1];
					items[j+1]=temp;
				}
				
			}
			
		}
		
		return items;
	}

	public static void main(String[] args) {
		
		Random random= new Random();
		int[] items= new int[1000];// Random array of 10 items to be sorted
		
		for (int i = 0; i < items.length; i++) {
			items[i]=random.nextInt(100);
		}
		System.out.println("Random array to be sorted : "+Arrays.toString(items));
		
		
		System.out.println("Sorted Array using Bubble Sort: "+Arrays.toString(buubleSort(items)));
	}

}
