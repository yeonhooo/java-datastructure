package com.yeonhooo.training.sort;

class IntervalSort {
	public void intervalSort(int a[], int begin, int end, int interval) {
		// TODO ���� �ڵ� �ۼ�
	}

	public void shellSort(int a[], int size) {
		// TODO ���� �ڵ� �ۼ�
	}
}

class IntervalSortTest {
	public static void main(String args[]) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		IntervalSort S = new IntervalSort();
		System.out.printf("\n������ ���� : ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.shellSort(a, size);
	}
}