package com.briup.hsp.shujijiegou.Sorting;

import java.util.Arrays;

//冒泡排序
/**
 *1. 一共要进行数组的大小-1次大的循环
 *2.每一趟排序的次数在逐渐的减少
 *3.在某趟排序中，没有发生一次交换 可以提前结束冒泡排序
 * 
 * 
 * */

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,9,-1,-10,2};
		//为了容易理解  冒泡排序的演变过程
		// 第一趟排序:将最大的数排在最后
		int temp = 0;
		for (int i = 0; i < arr.length-1; i++) {
			//前面的数比后面的数大  则交换   不大  不处理
			for (int j = 0; j < arr.length-1-i; j++) {	
			if(arr[i]>arr[i+1]) {
				 temp = arr[i];
				 arr[i]=arr[i+1];
				 arr[i+1] = temp;
			}
		}
	}
		System.out.println(Arrays.toString(arr));
	}

}
