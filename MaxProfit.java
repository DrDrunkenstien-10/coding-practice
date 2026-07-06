import java.lang.Math;

public class MaxProfit {
	public static String getMaxProfit(double[] stockPrices, double budget) {
		double maxProfit = 0;

		for(int i = 0; i < (stockPrices.length - 1); i++) {
			double shares = Math.floor(budget / stockPrices[i]);

			for(int j = (i + 1); j < stockPrices.length; j++) {
				double profit = shares * (stockPrices[j] - stockPrices[i]);

				if(profit > maxProfit) {
					maxProfit = profit;
				}
			}
		}

		String maxProfitString = String.format("%.2f", maxProfit);
		return maxProfitString;
	}

	public static void test(double[] stockPrices, double budget, String expected) {
		String actual = getMaxProfit(stockPrices, budget);

		if(actual.equals(expected)) {
			System.out.println("PASS" + " " + "Expected:" + " " + expected + " " + "Actual:" + " " + actual);
		}

		else {
			System.out.println("FAIL" + " " + "Expected:" + " " + expected + " " + "Actual:" + " " + actual);
		}
	}

	public static void main(String[] args) {
		test(new double[]{5, 6}, 50, "10.00");
		test(new double[]{8, 2, 5, 10}, 20, "80.00");
		test(new double[]{4, 5, 3, 6}, 20, "18.00");
		test(new double[]{54.40, 51.22, 53.99, 50.28, 53.01, 52.84}, 200, "8.31");
		test(new double[]{15.38, 15.01, 14.99, 14.62, 14.28}, 80, "0.00");
		test(new double[]{121.45, 126.82, 122.91, 124.65, 128.83, 128.83, 127.33}, 1230.25, "73.80");
	}
}	
