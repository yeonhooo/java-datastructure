package com.yeonhooo.complete.sort;

class QuickSort {
	int i = 0;

	public int partition(int a[], int begin, int end) {
		int pivot, temp, L, R, t;

		L = begin;
		R = end;
		pivot = (begin + end) / 2;
		System.out.printf("\n [������ %d �ܰ� : pivot=%d ]\n", ++i, a[pivot]);

		while (L < R) {
			while ((a[L] < a[pivot]) && (L < R)) {
				L++;
			}
			while ((a[R] >= a[pivot]) && (L < R)) {
				R--;
			}
			if (L < R) {
				temp = a[L];
				a[L] = a[R];
				a[R] = temp;

				if (L == pivot) {// L�� R ���Ҹ� ��ȯ�Ͽ�, ��������� �Ǻ������� ��ġ�� ����� ���
					for (t = 0; t < a.length; t++) {
						System.out.printf("%3d  ", a[t]);
					}
					System.out.println();

					return R;
				}
			}
		}

		// (L == R)�� �� ���
		temp = a[pivot];
		a[pivot] = a[R];
		a[R] = temp;
		for (t = 0; t < a.length; t++) {
			System.out.printf("%3d  ", a[t]);
		}
		System.out.println();

		return R;
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
				// L, R ��ȯ
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
		System.out.printf("\n������ ���� : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" %d", a[i]);
		}
		System.out.println();

		S.quickSort(a, 0, 7);
	}
}