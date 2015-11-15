package com.yeonhooo.complete.tree;

class TreeNode1 {
	Object data;
	TreeNode1 left;
	TreeNode1 right;
}

class LinkedTree {
	private TreeNode1 root;

	/**
	 * 
	 * @param bt1 왼쪽 노드
	 * @param data 데이터
	 * @param bt2 오른쪽 노드
	 * @return 루트
	 */
	public TreeNode1 makeBT(TreeNode1 bt1, Object data, TreeNode1 bt2) {
		TreeNode1 root = new TreeNode1();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		return root;
	}

	/**
	 * 전위순회
	 * @param root
	 */
	public void preorder(TreeNode1 root) {
		if (root != null) {
			System.out.printf("%c", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}

	/**
	 * 중위순회
	 * @param root
	 */
	public void inorder(TreeNode1 root) {
		if (root != null) {
			inorder(root.left);
			System.out.printf("%c", root.data);
			inorder(root.right);
		}
	}

	/**
	 * 후위순회
	 * @param root
	 */
	public void postorder(TreeNode1 root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.printf("%c", root.data);
		}
	}
}

class LinkedTreeTestMain {
	public static void main(String args[]) {
		LinkedTree T = new LinkedTree();

		TreeNode1 n7 = T.makeBT(null, 'D', null);
		TreeNode1 n6 = T.makeBT(null, 'C', null);
		TreeNode1 n5 = T.makeBT(null, 'B', null);
		TreeNode1 n4 = T.makeBT(null, 'A', null);
		TreeNode1 n3 = T.makeBT(n6, '/', n7);
		TreeNode1 n2 = T.makeBT(n4, '*', n5);
		TreeNode1 n1 = T.makeBT(n2, '-', n3);

		System.out.printf("\n Preorder : ");
		T.preorder(n1);

		System.out.printf("\n Inorder : ");
		T.inorder(n1);

		System.out.printf("\n Postorder : ");
		T.postorder(n1);
	}
}