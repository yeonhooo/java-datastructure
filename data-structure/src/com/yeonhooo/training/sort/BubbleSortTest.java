package com.yeonhooo.training.sort;

class BubbleSort {
	public void bubbleSort(int a[]) {
		// TODO ���� �ڵ� �ۼ�
	}
}

class BubbleSortTest {
	public static void main(String args[]) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		BubbleSort S = new BubbleSort();
		System.out.printf("\n������ ���� : ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.bubbleSort(a);
	}
}