package com.yeonhooo.training.tree.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public Node makeTree(Node leftNode, char data, Node rightNode) {
		Node root = new Node();
		root.setNodeValue(data);
		root.setLeftNode(leftNode);
		root.setRightNode(rightNode);
		return root;
	}

	/**
	 * 전위 순회
	 * 
	 * @param root
	 */
	public void preOrder(Node root) {
		if (root != null) {
			System.out.printf("%c ", root.getNodeValue());
			preOrder(root.getLeftNode());
			preOrder(root.getRightNode());
		}
	}

	/**
	 * 중위 순회
	 * 
	 * @param root
	 */
	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.getLeftNode());
			System.out.printf("%c ", root.getNodeValue());
			inOrder(root.getRightNode());
		}
	}

	/**
	 * 후위 순회
	 * 
	 * @param root
	 */
	public void postOrder(Node root) {
		if (root != null) {
			postOrder(root.getLeftNode());
			postOrder(root.getRightNode());
			System.out.printf("%c ", root.getNodeValue());
		}
	}

	/**
	 * 레벨순서 순회
	 * 
	 * @param root
	 */
	public void levelOrder(Node root) {
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

	// prints in level order
	public void levelOrderPretty(Node root) {
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
	 * Make a new root node by the leaf node.
	 * 
	 * @param node
	 * @param leaf 새로운 뿌리노드로 설정하고자 하는 말단노드
	 * @return
	 */
	public Boolean makeNewRootByLeaf(Node node, Node leaf) {
		if (node == null) {
			return false;
		}
		if (node == leaf) {
			return true;
		}

		Node newParent;
		if (makeNewRootByLeaf(node.getLeftNode(), leaf)) {
			newParent = node.getLeftNode();
			node.setLeftNode(null);
		} else if (makeNewRootByLeaf(node.getRightNode(), leaf)) {
			newParent = node.getRightNode();
			node.setRightNode(null);
		} else {
			return false;
		}

		if (newParent.getLeftNode() == null) {
			newParent.setLeftNode(node);
		} else {
			newParent.setRightNode(node);
		}
		return true;
	}

}
