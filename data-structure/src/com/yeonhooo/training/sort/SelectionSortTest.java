package com.yeonhooo.training.sort;

class SelectionSort {
	/*
	 * 가장 작은 원소를 선택하여 교환
	 * Page.415
	 */
	public void selectionSort(int a[]) {
		// TODO 구현 연습
	}

	public void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

class SelectionSortTest {
	public static void main(String args[]) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		SelectionSort S = new SelectionSort();
		System.out.printf("\n정렬할 원소 : ");
		for (int i = 0; i < a.length; i++)
			System.out.printf(" %d", a[i]);
		System.out.println();
		S.selectionSort(a);
	}
}