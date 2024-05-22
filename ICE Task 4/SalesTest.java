import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SalesTest {

	@Test
	public void testAverageSales() {
		int[] sales = {100, 200, 300};
		int SALESPEOPLE = sales.length;
		int expectedAverageSales = 200;
		int actualAverageSales = Sales.avgSales(sales, SALESPEOPLE);
		Assertions.assertEquals(expectedAverageSales, actualAverageSales);
	}

}
