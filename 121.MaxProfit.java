public static int maxProfit(int[] prices) {

		int currentMax = 0;
		int buy = 0;
		int sell = 1;

		while (sell < prices.length) {

			if (prices[sell] < prices[buy]) {

				buy = sell;
				sell++;

			} else {
				currentMax = Math.max(currentMax, (prices[sell] - prices[buy]));
				sell++;
			}
		}
		return currentMax;
	}
