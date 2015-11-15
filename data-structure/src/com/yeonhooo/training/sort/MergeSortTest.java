package com.yeonhooo.training.sort;

class MergeSort {
	private int sorted[] = new int[30];

	public void merge(int a[], int m, int middle, int n) {
		// TODO 구현 코드 작성
	}

	public void mergeSort(int a[], int m, int n) {
		// TODO 구현 코드 작성
	}
}

class MergeSortTest {
	public static void main(String args[]) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		MergeSort S = new MergeSort();
		System.out.printf("\n정렬할 원소 : ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.mergeSort(a, 0, size - 1);
	}
}