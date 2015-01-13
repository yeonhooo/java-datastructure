package com.yeonhooo.training.queue;

class ArrayCQueueTest implements Queue {

	int front;
	int rear;
	int queueSize;
	char itemArray[];

	public ArrayCQueueTest(int queueSize) {
		front = 0;
		rear = 0;
		this.queueSize = queueSize;
		itemArray = new char[queueSize];
	}

	private boolean isFull() {
		return front == ((rear + 1) % queueSize);
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
			rear = rear % queueSize;
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
			front = front % queueSize;
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

public class ArrayCQueueTestMain {
	public static void main(String[] args) {
		ArrayCQueueTest arrayCQueue = new ArrayCQueueTest(5);
		arrayCQueue.enQueue('A');
		arrayCQueue.printQueue();
		arrayCQueue.enQueue('B');
		arrayCQueue.printQueue();
		arrayCQueue.enQueue('C');
		arrayCQueue.printQueue();
		arrayCQueue.deQueue();
		arrayCQueue.printQueue();
		System.out.println("complete...");
	}

}
