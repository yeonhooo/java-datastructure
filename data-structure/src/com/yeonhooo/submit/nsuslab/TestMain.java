package com.yeonhooo.submit.nsuslab;

public class TestMain {

	public static void main(String[] args) {
		
		// step1. ����Ʈ���� �����Ѵ�.
		BinaryTree tree = new BinaryTree();
		Node n7 = tree.makeTree(null, '7', null);
		Node n6 = tree.makeTree(null, '6', null);
		Node n5 = tree.makeTree(null, '5', null);
		Node n4 = tree.makeTree(null, '4', null);
		Node n3 = tree.makeTree(n6, '3', n7);
		Node n2 = tree.makeTree(n4, '2', n5);
		Node n1 = tree.makeTree(n2, '1', n3);

		// step2. �۾� �� Ʈ�� Ȯ��: level-order ��ȸ
		System.out.print("[DEFAULT] Level-order\t: ");
		tree.printLevelOrder(n1);

		// step3. ���� ��尡 ���ο� ��Ʈ��尡 �ǵ��� ���ο� Ʈ���� �ۼ��Ѵ�.
		System.out.print("\n[PROCESSING] Make a new root node by the leaf node.");
		tree.makeNewRootByLeaf(n1, n5);

		// step4. �۾� �� Ʈ�� Ȯ��: level-order ��ȸ
		System.out.print("\n[RESULT] Level-order\t: ");
		tree.printLevelOrder(n5);
	}
}