package com.briup.hsp.shujijiegou.Sorting;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {101,34,131,1};
		insertSort(arr);
	}
	
	public static void insertSort(int[] arr) {
		/*//定义带插入的数
		int	insertval = arr[1];
		int insertIndex = 0;//1-1 即 arr[1] 临近的下标
		
		//给insertval 找到合适的位置
		//insertval<arr[insertIndex]  待插入的数 还没找到适当的位置 
		//就需要arr[insertIndex]后移
		while(insertIndex>=0&&insertval<arr[insertIndex])//保证给insertval找插入位置时 数组不越界 
		{
			arr[insertIndex+1] = arr[insertIndex];
			insertIndex--;
		}
		//当退出while循环时 插入的位置找到   insertIndex+1
		if(insertIndex + 1 != 0) {
			arr[insertIndex + 1] = insertval;
			}
		
		System.out.println(Arrays.toString(arr));*/
		for (int i = 1; i < arr.length; i++) {
			int insertval = arr[i];
			int insertIndex = i - 1;// 1-1 即 arr[1] 临近的下标
			while (insertIndex >= 0 && insertval < arr[insertIndex]) {
				arr[insertIndex + 1] = arr[insertIndex];// arr[insertIndex]
				insertIndex--;
			}
			arr[insertIndex + 1] = insertval;
			System.out.println("第" + i + "轮插入");
			System.out.println(Arrays.toString(arr));

		}
	}

}
