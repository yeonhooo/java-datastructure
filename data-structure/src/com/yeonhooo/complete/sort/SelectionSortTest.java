package com.yeonhooo.complete.sort;

class SelectionSort {
	/*
	 * 가장 작은 원소를 선택하여 교환
	 * Page.415
	 */
	public void selectionSort(int a[]) {
		int i, j, min;
		
		for (i = 0; i < a.length - 1; i++) {
			min = i;
			
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[min])
					min = j;	// 가장 작은 수를 선택
			}
			swap(a, min, i);
			
			System.out.printf("\n선택 정렬 %d 단계 : ", i + 1);
			for (j = 0; j < a.length - 1; j++) {
				System.out.printf("%3d ", a[j]);
			}
		}
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