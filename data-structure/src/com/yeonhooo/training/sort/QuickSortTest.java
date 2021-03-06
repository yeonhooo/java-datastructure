package com.yeonhooo.training.sort;

class QuickSort {
	int i = 0;

	public int partition(int a[], int begin, int end) {
		// TODO 구현 코드 작성
		return 0;
	}
	
	public int partition2(int a[], int begin, int end) {

		int pivot, L, R;
		L = begin;
		R = end;
		pivot = (L + R) / 2; 
		
		while (L < R) {
			
			while (a[L] < a[pivot] && (L < R)) {
				L++;
			}
			while (a[R] >= a[pivot] && (L < R)) {
				R--;
			}
			
			if (L >= R) {
				// L, R 교환
				int temp = a[L];
				a[L] = a[R];
				a[R] = temp;
			}
			
		}
		
		int temp = 0;
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		
		return R;
		
	}

	public void quickSort(int a[], int begin, int end) {
		if (begin < end) {
			int p;
			p = partition(a, begin, end);
			quickSort(a, begin, p - 1);
			quickSort(a, p + 1, end);
		}
	}
}

class QuickSortTest {
	public static void main(String args[]) {
		int a[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		QuickSort S = new QuickSort();
		System.out.printf("\n정렬할 원소 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" %d", a[i]);
		}
		System.out.println();

		S.quickSort(a, 0, 7);
	}
}