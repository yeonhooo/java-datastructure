package com.yeonhooo.complete.etc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CoinGreedy {
	private int mNumOfCoins;
	private PriorityQueue<Integer> mPQ;

	public CoinGreedy(int numOfCoin) {
		mNumOfCoins = numOfCoin;
//		mPQ = new PriorityQueue<Integer>(mNumOfCoins);
		// 우선순위큐가 높은 동전 먼져 출력하도록 한다.
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
		
		// 첫번째 동전을 선택한다.
		if (!mPQ.isEmpty())
			coin = mPQ.remove();
		else
			return; // 실패한 경우
		
		while (true) {
			// 선택한 동전 단위를 잔돈에서 뺀다. 이 값이 0보다 크면 반복한다.
			if (change - coin >= 0) {
				System.out.println("현재 거스름돈: " + change + ", 선택한 동전: " + coin + ", 남은 거스름돈: " + (change - coin));
				change = change - coin;
			} else {
				// 선택한 동전 단위를 잔돈에서 뺀다. 이 값이 0보다 작으면 다음 동전을 고르고 반복한다.
				if (!mPQ.isEmpty())
					coin = mPQ.remove();
				else
					return; // 실패한 경우
			}
			if (change == 0)
				return; // 성공한 경우
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