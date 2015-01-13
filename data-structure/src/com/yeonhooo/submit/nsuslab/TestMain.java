package com.yeonhooo.submit.nsuslab;

public class TestMain {

	public static void main(String[] args) {
		
		// step1. 이진트리를 생성한다.
		BinaryTree tree = new BinaryTree();
		Node n7 = tree.makeTree(null, '7', null);
		Node n6 = tree.makeTree(null, '6', null);
		Node n5 = tree.makeTree(null, '5', null);
		Node n4 = tree.makeTree(null, '4', null);
		Node n3 = tree.makeTree(n6, '3', n7);
		Node n2 = tree.makeTree(n4, '2', n5);
		Node n1 = tree.makeTree(n2, '1', n3);

		// step2. 작업 전 트리 확인: level-order 순회
		System.out.print("[DEFAULT] Level-order\t: ");
		tree.printLevelOrder(n1);

		// step3. 말단 노드가 새로운 루트노드가 되도록 새로운 트리를 작성한다.
		System.out.print("\n[PROCESSING] Make a new root node by the leaf node.");
		tree.makeNewRootByLeaf(n1, n5);

		// step4. 작업 후 트리 확인: level-order 순회
		System.out.print("\n[RESULT] Level-order\t: ");
		tree.printLevelOrder(n5);
	}
}