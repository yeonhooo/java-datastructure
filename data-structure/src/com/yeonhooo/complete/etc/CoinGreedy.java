package com.yeonhooo.complete.etc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CoinGreedy {
	private int mNumOfCoins;
	private PriorityQueue<Integer> mPQ;

	public CoinGreedy(int numOfCoin) {
		mNumOfCoins = numOfCoin;
//		mPQ = new PriorityQueue<Integer>(mNumOfCoins);
		// �켱����ť�� ���� ���� ���� ����ϵ��� �Ѵ�.
		mPQ = new PriorityQueue<Integer>(mNumOfCoins, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.intValue() - o1.intValue();
			}

		});
	}

	public void addCoin(int coinValue) {
		mPQ.add(new Integer(coinValue));
	}

	public void calculate(int value) {
		int coin = 0;
		int change = value;
		
		// ù��° ������ �����Ѵ�.
		if (!mPQ.isEmpty())
			coin = mPQ.remove();
		else
			return; // ������ ���
		
		while (true) {
			// ������ ���� ������ �ܵ����� ����. �� ���� 0���� ũ�� �ݺ��Ѵ�.
			if (change - coin >= 0) {
				System.out.println("���� �Ž�����: " + change + ", ������ ����: " + coin + ", ���� �Ž�����: " + (change - coin));
				change = change - coin;
			} else {
				// ������ ���� ������ �ܵ����� ����. �� ���� 0���� ������ ���� ������ ���� �ݺ��Ѵ�.
				if (!mPQ.isEmpty())
					coin = mPQ.remove();
				else
					return; // ������ ���
			}
			if (change == 0)
				return; // ������ ���
		}
	}

	public static void main(String[] args) {
		int numOfCoin = 5;

		CoinGreedy cg = new CoinGreedy(numOfCoin);
		cg.addCoin(500);
		cg.addCoin(100);
		cg.addCoin(50);
		cg.addCoin(10);
		cg.addCoin(1);
		
		cg.calculate(800);
	}

}