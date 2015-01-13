package com.yeonhooo.submit.nsuslab;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	/**
	 * ����Ʈ���� �����Ѵ�
	 * 
	 * @param leftNode	���� �ڽ� ���
	 * @param data		�ش� ����� ������
	 * @param rightNode	������ �ڽ� ���
	 * @return
	 */
	public Node makeTree(Node leftNode, char data, Node rightNode) {
		Node root = new Node();
		root.setNodeValue(data);
		root.setLeftNode(leftNode);
		root.setRightNode(rightNode);
		return root;
	}

	/**
	 * �������� ��ȸ
	 * 
	 * @param root
	 */
	public void printLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.printf("%c ", tempNode.getNodeValue());
			if (tempNode.getLeftNode() != null)
				queue.add(tempNode.getLeftNode());
			if (tempNode.getRightNode() != null)
				queue.add(tempNode.getRightNode());
		}
	}

	/**
	 * �������� ��ȸ
	 * 
	 * @param root
	 */
	public void printLevelOrderPretty(Node root) {
		Queue<Node> currentLevelQueue = new LinkedList<Node>();
		Queue<Node> nextLevelQueue = new LinkedList<Node>();
		currentLevelQueue.add(root);

		while (!currentLevelQueue.isEmpty()) {
			for (Node n : currentLevelQueue) {
				Node currNode = n;
				System.out.printf("%c ", currNode.getNodeValue());

				if (currNode.getLeftNode() != null) {
					nextLevelQueue.add(currNode.getLeftNode());
				}
				if (currNode.getRightNode() != null) {
					nextLevelQueue.add(currNode.getRightNode());
				}
			}
			System.out.println();
			currentLevelQueue = nextLevelQueue;
			nextLevelQueue = new LinkedList<Node>();
		}
	}

	/**
	 * ���� ��尡 ���ο� ��Ʈ��尡 �ǵ��� ���ο� Ʈ���� �ۼ��Ѵ�
	 * 
	 * @param root	��Ʈ���
	 * @param leaf	���ο� ��Ʈ���� �����ϰ��� �ϴ� ���ܳ��
	 * @return
	 */
	public Boolean makeNewRootByLeaf(Node root, Node leaf) {
		if (root == null) {
			return false;
		}
		if (root == leaf) {
			return true;
		}

		Node newParent;
		if (makeNewRootByLeaf(root.getLeftNode(), leaf)) {
			newParent = root.getLeftNode();
			root.setLeftNode(null);
		} else if (makeNewRootByLeaf(root.getRightNode(), leaf)) {
			newParent = root.getRightNode();
			root.setRightNode(null);
		} else {
			return false;
		}

		if (newParent.getLeftNode() == null) {
			newParent.setLeftNode(root);
		} else {
			newParent.setRightNode(root);
		}
		return true;
	}
}