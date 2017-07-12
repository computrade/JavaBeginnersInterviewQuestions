package computrade.puzzels;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class StockMaximumProfitTest {
	
	@Test
	public void testStockMaximumProfit2num() {
		
		double stockPricesYesterday[] = { 100, 100.2 };	
		assertEquals(0.2,StockMaximumProfit.findBestProfit(stockPricesYesterday),0.001);
	
	}
	
	@Test
	public void testStockMaximumProfit3num() {
		
		double stockPricesYesterday[] = { 100, 100.2, 101 };
		assertEquals(1,StockMaximumProfit.findBestProfit(stockPricesYesterday),0.001);
	
	}
	
	@Test
	public void testStockMaximumProfit4num() {
		
		double stockPricesYesterday[] = { 100, 100.2, 99, 98 };
		assertEquals(0.2,StockMaximumProfit.findBestProfit(stockPricesYesterday),0.001);
	
	}
	
	@Test
	public void testStockMaximumProfit5Num() {
		
		double stockPricesYesterday[] = { 100, 100.2, 99, 98, 103 };
		assertEquals(5,StockMaximumProfit.findBestProfit(stockPricesYesterday),0.001);
	
	}

	@Test
	public void testStockMaximumProfitRandomNum() {
		
		double stockPricesYesterday[] = { 100, 100.2, 99, 98, 97.1, 99, 96,
				101.2, 102.3, 104.1, 103.2 };
		
		
		assertEquals(8.1,StockMaximumProfit.findBestProfit(stockPricesYesterday),0.001);
	
	}
	
	
	@Test
	public void testStockMaximumProfitInteger() {
		
		double stockPricesYesterday[] = { 100, 99, 101, 98, 102 };
		assertEquals(4,StockMaximumProfit.findBestProfit(stockPricesYesterday),0.001);
	
	}
	
	
}
