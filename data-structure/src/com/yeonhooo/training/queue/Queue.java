package com.yeonhooo.training.queue;

public interface Queue {
	boolean isEmpty();

	void enQueue(char item);

	char deQueue();

	void delete();

	char peek();

}