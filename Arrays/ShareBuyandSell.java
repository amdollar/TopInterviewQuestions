package io.test.Arrays;

public class ShareBuyandSell {

	public static void main(String[] args) {
		int[] price = new int[] { 1, 2, 3, 4, 5 };
		for (int i : price)
			System.out.print(i + " ");
		int profit = maxProfit(price);
		System.out.println("\n" + profit);

	}

	public static int maxProfit(int[] prices) {

		if (prices.length == 0 || prices == null) {
			return 0;
		}
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				profit += prices[i + 1] - prices[i];
			}
		}
		return profit;
	}
}
