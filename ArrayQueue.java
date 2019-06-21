package com.briup.hsp.shujijiegou.day1.quene;

import java.util.Scanner;

public class ArrayQueue {
	public static void main(String[] args) {
	ArrayQ	arrq  =new ArrayQ(3);
	char key = ' ';//接受用户输入
	Scanner scanner = new Scanner(System.in);
	boolean loop = true;
	while(loop) {
		System.out.println("s(show):显示队列");
		System.out.println("e(exit):退出程序");
		System.out.println("a(add):往队列里添加数据");
		System.out.println("g(get):从数列取出数据");
		System.out.println("h(head):显示队列的头数据");
		key = scanner.next().charAt(0);
		switch (key) {
		case 's':
			arrq.showQuene();
			break;
		case 'a':
			System.out.println("输入一个数");
			int value = scanner.nextInt();
			arrq.addQuene(value);
			break;
		case 'g':
			try {
				int result = arrq.getQuene();
				System.out.printf("取出的数据是%d\n",result);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			break;
		case 'h':
			try {
				int hResult = arrq.headQuene();
				System.out.printf("队列头的数据是%d\n",hResult);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			break;
		case 'e':
			scanner.close();
			loop = false;
			break;

		default:
			break;
		}
	}
	 System.out.println("程序退出");
	}
}

//编写ArrayQ类 数组模拟队列

class ArrayQ{
	private int maxSize;//表示数组最大容量
	private int front;//指向队列头
	private int rare;//指向队列尾
	private int[] arr;//该数组用于存放数据，模拟队列
	
	//创建对象的构造器
	public ArrayQ(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
		front = -1;//指向对象头部的前一个位置
		rare = -1;//指向队列尾的数据  和位置  
		}
	//判断队列是否满
	public boolean isFull() {
		return rare == maxSize-1 ;
	}
	//判断队列是否为空
	public boolean isEmpty() {
		return front == rare;
	}
	
	//给队列添加数据
	public void addQuene(int n) {
		//判断队列是否满
		if(isFull()) {
			System.out.println("队列已满");
			return;
		}
		rare++;
		arr[rare] = n;
	}
	
	
	 //出队列
	
	public int getQuene() {
		if(isEmpty()) {
			throw new RuntimeException("队列空， 不能取数据");
		}
		front++;
		return arr[front];
	}
	
	
	//显示队列的所有数据
	
	public void showQuene() {
		//队列为空 无法遍历
		if(isEmpty()) {
			System.out.println("队列为空 无法展示");
			 return;
		}
		
		for(int i =0; i<arr.length;i++) {
			System.out.printf("arr[%d] = %d\n",i,arr[i]);
		}
	}
	
	//显示队列的头数据  并不是取出数据
	
	public int headQuene() {
		if(isEmpty()) {
			throw new RuntimeException("为空");
		}
		return arr[front+1];
	}

}