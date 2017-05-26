package computrade.puzzels;

/* 
 * I have an array stockPricesYesterday where:

 The indices are the time, as a number of minutes past trade opening time, which was 9:30am local time.
 The values are the price of Apple stock at that time, in dollars.
 For example, the stock cost $500 at 10:30am, so stockPricesYesterday[60] = 500.


 The brute force approach would be to try every pair of times 
 (treating the earlier time as the buy time and the later time as the sell time) and see which one is best.
 There are n2 such combinations, so this will take O(n2) time. We can do better.

 If we're going to do better than O(n2), we're probably going to do it in either O(nlg(n)) or O(n).
 O(nlg(n)) comes up in sorting and searching algorithms where we're recursively cutting the set in half. 
 It's not obvious that we can save time by cutting the set in half here.
 Let's first see how well we can do by looping through the set only once (this costs only O(n) time).

 Since we're going to loop through the set only once, let's use a greedy approach, where we keep a running max_profit 
 until we reach the end.
 We'll start our max profit at $0. As we're iterating, how do we know if we've found a new max profit?

 At each iteration, our max_profit is either:

 the same as the max_profit at the last time step, or
 the best profit we can get by selling at the current_price
 How do we know when we have case (2)?

 The best profit we can get by selling at the current_price is simply the difference between
 the current_price and the min_price to the left of it.
 If this difference is greater than the current max_profit, we have a new max_profit.

 */
public class CopyOfStockMaximumProfit {

	public static void main(String args[]) {

		System.out.println("Beft Profit is " + findBestProfit());

	}

	public static double findBestProfit() {

		double stockPricesYesterday[] = { 110, 90, 99, 98, 97.1, 99, 96,
				101.2, 102.3, 104.1, 103.2 };

		double minPrice =  stockPricesYesterday[0];
		double maxProfit = 0.00;

		for (int i = 0; i < stockPricesYesterday.length; i++) {

			minPrice = Math.min(minPrice, stockPricesYesterday[i]);
			maxProfit = Math.max(maxProfit, stockPricesYesterday[i] - minPrice);

		}

		return maxProfit;

	}

}
