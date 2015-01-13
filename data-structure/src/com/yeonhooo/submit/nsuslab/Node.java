package com.yeonhooo.submit.nsuslab;

public class Node {

	private char nodeValue;
	private Node rightNode;
	private Node leftNode;

	public char getNodeValue() {
		return nodeValue;
	}

	public void setNodeValue(char nodeValue) {
		this.nodeValue = nodeValue;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
}