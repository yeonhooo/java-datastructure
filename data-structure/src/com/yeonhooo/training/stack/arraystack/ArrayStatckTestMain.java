package com.yeonhooo.training.stack.arraystack;

import com.yeonhooo.training.stack.StackIF;



class ArrayStack01 implements StackIF {

	private int top;
	private int stackSize;
	private char itemArray[];

	public ArrayStack01(int stackSize) {
		top = -1;
		this.stackSize = stackSize;
		itemArray = new char[stackSize];
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public void push(char item) {

		if (isFull()) {
			System.out.println("Stack is Full!");
		} else {
			top = top + 1;
			itemArray[top] = item;
		}

	}

	@Override
	public char pop() {
		char item = 0;
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			item = itemArray[top];
			top--;
		}
		return item;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isFull() {
		if (top == stackSize - 1) {
			return true;
		} else {
			return false;
		}
	}
}

public class ArrayStatckTestMain {
	public static void main(String[] args) {
		ArrayStack01 arrayStack = new ArrayStack01(5);
		arrayStack.push('A');
		arrayStack.push('B');
		arrayStack.push('C');
		arrayStack.pop();
		
		System.out.println("complete...");
	}
}