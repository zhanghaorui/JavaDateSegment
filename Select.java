package com.briup.hsp.shujijiegou.Sorting;

public class Select {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	static void select(int[] arr) {
		int minIndex = 0;
		int min = arr[0];
		for(int j =1; j<arr.length;j++) {
			if(min>arr[j]) {
				min = arr[j];
				minIndex = j;
			}
		}
		arr[minIndex] = arr[0];
		arr[0] = min;
	}

}
