package com.yeonhooo.training.tree.binary;

public class TestMain {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		Node n7 = tree.makeTree(null, '7', null);
		Node n6 = tree.makeTree(null, '6', null);
		Node n5 = tree.makeTree(null, '5', null);
		Node n4 = tree.makeTree(null, '4', null);
		Node n3 = tree.makeTree(n6, '3', n7);
		Node n2 = tree.makeTree(n4, '2', n5);
		Node n1 = tree.makeTree(n2, '1', n3);

		System.out.print("Pre-order\t: ");
		tree.preOrder(n1);

		System.out.print("\nIn-order\t: ");
		tree.inOrder(n1);

		System.out.print("\nPost-order\t: ");
		tree.postOrder(n1);

		System.out.print("\nLevel-order\t: ");
		tree.levelOrder(n1);

		System.out.print("\n\nMake a new root node by the leaf node.");
		tree.makeNewRootByLeaf(n1, n5);

		System.out.print("\nLevel-order\t: ");
		tree.levelOrder(n5);

		System.out.println("\nLevel-order(pretty) : ");
		tree.levelOrderPretty(n5);
	}

}
