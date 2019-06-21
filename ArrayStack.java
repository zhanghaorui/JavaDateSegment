package com.briup.hsp.shujijiegou.stack;

public class ArrayStack {
	private int maxSize;//栈的大小
	private int[] stack;//数组模拟栈  数据放在该数组
	private int top = -1;//表示栈底
	
	public ArrayStack(int maxSize) {
		this.maxSize = maxSize;
		stack = new int[this.maxSize];
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	} 
	
	public boolean isEmpty() {
		return top == -1;
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("栈满");
			return;
		}
		top++;
		stack[top] = value;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("栈空");
		}
		int value = stack[top];
		top--;
		return value;
	}
	public void list() {
		if(isEmpty()) {
			System.out.println("栈空");
		}
		for(int i=top;i>=0;i--) {
			System.out.printf("stack[%d]=%d\n",i,stack[i]);
		}
	}
}
