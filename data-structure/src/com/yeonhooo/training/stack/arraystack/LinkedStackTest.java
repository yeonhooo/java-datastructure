package com.yeonhooo.training.stack.arraystack;

import com.yeonhooo.training.stack.StackIF;


class StackNode01 {
	char data;
	StackNode01 link;
}

class LinkedStack01 implements StackIF {

	StackNode01 top = null;
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(char item) {
		StackNode01 newNode = new StackNode01();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
	}

	@Override
	public char pop() {
		char data = top.data;
		top = top.link;
		return data;
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

}

public class LinkedStackTest {
	public static void main(String[] args) {
		LinkedStack01 linkedStack = new LinkedStack01();
		linkedStack.push('A');
		linkedStack.push('B');
		linkedStack.push('C');
		linkedStack.pop();
		System.out.println("complete...");
	}
}
