package com.briup.hsp.shujijiegou.day1.sparseArray;

public class SpaseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建原始的二维数组 
		//0 表示没有旗子  1 表示黑子 2表示蓝子
		int chessArr1[][] = new int[11][11];
		chessArr1[1][2] = 1;
		chessArr1[2][3] = 2;
		chessArr1[5][6] = 2;
		System.out.println("这是原始的二维数组");
		//输出原始的二维数组
		for(int[] row: chessArr1) {
			for(int data:row) {
				System.out.printf("%d\t",data);
			}
			System.out.println();
		}
		
		//遍历二维数组 得到非0数据的个数
		int sum = 0;
		for(int i =0;i<11;i++) {
			for(int j =0; j<11;j++) {
				if(chessArr1[i][j] !=0) {
					sum++;
				} 
			}
		}
		System.out.println("原二维数组中不为0的数:"+sum);
	
		//创建对应的稀疏数组
		int spareArr[][] = new int [sum+1][3];
		//给稀疏数组赋值
		spareArr[0][0] = 11;
		spareArr[0][1] = 11;
		spareArr[0][2] = sum;
		
		//遍历二维数组 将非0的值存放到稀疏数组中
		int count = 0; //用于记录第几个非0数据
		for(int i =0;i<chessArr1.length;i++) {
			for(int j =0; j<chessArr1.length;j++) {
				if(chessArr1[i][j] !=0) {
					count++;
					spareArr[count][0] = i;
					spareArr[count][1] = j;
					spareArr[count][2] = chessArr1[i][j];
				} 
			}
		}
		
		//输出稀疏数组的形式
		System.out.println("得到稀疏数组为~");
		for(int i = 0; i<spareArr.length;i++) {
			System.out.printf("%d\t%d\t%d\t\n",spareArr[i][0],spareArr[i][1],spareArr[i][2]);
		}
		System.out.println();
		
		
		//将稀疏数组 恢复成原始的二维数组
		//1.先读取
		//
		int chessArr2[][] = new int[spareArr[0][0]][spareArr[0][1]];
		
		for(int i=1;i<spareArr.length;i++) {
			chessArr2[spareArr[i][0]][spareArr[i][1]] = spareArr[i][2];
		}
		
		//输出回复后的二维数组
		System.out.println();
		System.out.println("恢复后的二维数组");
		for(int[] row: chessArr2) {
			for(int data:row) {
				System.out.printf("%d\t",data);
			}
			System.out.println();
		}
		
		
	}

}
