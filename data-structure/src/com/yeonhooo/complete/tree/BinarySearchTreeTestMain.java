package com.yeonhooo.complete.tree;

class TreeNode {
	char data;
	TreeNode left;
	TreeNode right;
}

class BinarySearchTree {
	private TreeNode root = new TreeNode();

	public TreeNode insertKey(TreeNode root, char x) {
		TreeNode p = root;
		
		// 새로운 노드 생성
		TreeNode newNode = new TreeNode();
		newNode.data = x;
		newNode.left = null;
		newNode.right = null;
		
		if (p == null)
			return newNode;
		else if (newNode.data < p.data) {
			p.left = insertKey(p.left, x);
			return p;
		} else if (newNode.data > p.data) {
			p.right = insertKey(p.right, x);
			return p;
		} else
			return p;
	}

	public void insertBST(char x) {
		root = insertKey(root, x);
	}

	public TreeNode searchBST(char x) {
		TreeNode p = root;
		while (p != null) {
			if (x < p.data)
				p = p.left;
			else if (x > p.data)
				p = p.right;
			else
				return p;
		}
		return p;
	}
	
	public TreeNode searchBST2(char x) {
		return searchBST_by_yh(root, x);
	}
	
	/**
	 * 테스트로 내가 만듦
	 * @param p 부모 노드
	 * @param x 찾으려는 데이터
	 * @return
	 */
	public TreeNode searchBST_by_yh(TreeNode p, char x) {

		if (p == null) {
			return null;
		} else if (p.data == x) {
			return p;
		} else if (p.data > x) {
			return searchBST_by_yh(p.left, x);
		} else {
			return searchBST_by_yh(p.right, x);
		}

	}

	public void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			System.out.printf(" %c", root.data);
			inorder(root.right);
		}
	}

	public void printBST() {
		inorder(root);
		System.out.println();
	}
}

class BinarySearchTreeTestMain {
	public static void main(String args[]) {
		TreeNode tn = new TreeNode();
		if(tn.data == '\u0000' ){
			System.out.println("'\u0000'");
		} else {
			System.out.println("No");
		}
		
		BinarySearchTree bsT = new BinarySearchTree();
		bsT.insertBST('G');
		bsT.insertBST('I');
		bsT.insertBST('H');
		bsT.insertBST('D');
		bsT.insertBST('B');
		bsT.insertBST('M');
		bsT.insertBST('N');
		bsT.insertBST('A');
		bsT.insertBST('J');
		bsT.insertBST('E');
		bsT.insertBST('Q');

		System.out.printf("\nBinary Tree >>> ");
		bsT.printBST();

		System.out.printf("Is There \"A\" ? >>> ");
		TreeNode p1 = bsT.searchBST('A');
		if (p1 != null)
			System.out.printf("Searching Success! Searched key : %c \n", p1.data);
		else
			System.out.printf("Searching fail!!");

		System.out.printf("Is There \"Z\" ? >>> ");
		TreeNode p2 = bsT.searchBST('Z');
		if (p2 != null)
			System.out.printf("Searching Success! Searched key : %c \n", p2.data);
		else
			System.out.printf("Searching fail!! \n");
	}
}