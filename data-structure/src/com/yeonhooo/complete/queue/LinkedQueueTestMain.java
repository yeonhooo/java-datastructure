package com.yeonhooo.complete.queue;

class QueueNode {
	char data;
	QueueNode front;
	QueueNode rear;
}

class LinkedQueueTest implements Queue {

	int front;
	int rear;
	int queueSize;
	char itemArray[];

	public void printQueue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
		} else {
			for (int i = front + 1; i <= rear; i++) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enQueue(char item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		return 0;
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

public class LinkedQueueTestMain {
	public static void main(String[] args) {
		ArrayQueueTest arrayQueue = new ArrayQueueTest(5);
		arrayQueue.enQueue('A');
		arrayQueue.printQueue();
		arrayQueue.enQueue('B');
		arrayQueue.printQueue();
		arrayQueue.enQueue('C');
		arrayQueue.printQueue();
		arrayQueue.deQueue();
		arrayQueue.printQueue();
		System.out.println("complete...");
	}

}
