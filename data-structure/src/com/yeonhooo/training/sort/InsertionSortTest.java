package com.yeonhooo.training.sort;

class InsertionSort {
	public void insertionSort(int a[], int size) {
		// TODO 구현 코드 작성
	}
}

class InsertionSortTest {
	public static void main(String args[]) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		int size = a.length;
		InsertionSort S = new InsertionSort();
		System.out.printf("\n정렬할 원소 : ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.insertionSort(a, size);
	}
}