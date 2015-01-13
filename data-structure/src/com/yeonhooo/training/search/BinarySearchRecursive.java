package com.yeonhooo.training.search;

/**
 * n ���� ������ ������ 1���� �迭�� ���� ���ĵǾ� ���� �� ������ �� x �� �˻��ϴ� binary search �˰����� ����� �Լ���
 * �����Ѵ�.
 */
public class BinarySearchRecursive {

	static int arraySize = 1000;
	static int array[] = new int[arraySize];
	static int loopCount = 1;

	static void init() {
		for (int i = 0; i < arraySize; i++) {
			array[i] = i;
		}
	}

	static void binarySearch(int findNumber, int left, int right) {
		System.out.print("Loop count[" + loopCount + "], ");
		loopCount++;

		System.out.print("left : " + left + ", right : " + right + ", ");

		int center = (left + right) / 2;
		System.out.println("center : " + center);

		if (array[center] == findNumber) {
			System.out.println("Found it " + center + ", array[" + center + "]");
		} else if (array[center] > findNumber) {
			binarySearch(findNumber, left, center - 1);
		} else if (array[center] < findNumber) {
			binarySearch(findNumber, center + 1, right);
		} else {
			return;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();

		int findNumber = 1629;
		binarySearch(findNumber, 0, 999);
	}

}