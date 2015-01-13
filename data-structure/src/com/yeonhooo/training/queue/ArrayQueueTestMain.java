package com.yeonhooo.training.queue;

class ArrayQueueTest implements Queue {

	int front;
	int rear;
	int queueSize;
	char itemArray[];

	public ArrayQueueTest(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[queueSize];
	}

	private boolean isFull() {
		return rear == queueSize - 1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front == rear;
	}

	@Override
	public void enQueue(char item) {
		if (isFull()) {
			System.out.println("queue is full...");
		} else {
			rear++;
			itemArray[rear] = item;
		}
	}

	@Override
	public char deQueue() {
		if (isEmpty()) {
			System.out.println("queue is empty...");
			return 0;
		} else {
			front++;
			return itemArray[front];
		}
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

}

public class ArrayQueueTestMain {
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
