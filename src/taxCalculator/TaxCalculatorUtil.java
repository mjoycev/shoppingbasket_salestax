package taxCalculator;

import java.math.BigDecimal;

import products.Product;

public class TaxCalculatorUtil {
	
	public static BigDecimal computeSalesTax(Product product) {
		double taxRate = product.getApplicableTaxes();
		BigDecimal salesTax = (new BigDecimal(taxRate).multiply(product.getUnitPrice())).divide(new BigDecimal("100"));
		return roundToNearest5Cents(salesTax);
	}
	
	public static BigDecimal roundToNearest5Cents(BigDecimal salesTax) {
		BigDecimal increment = new BigDecimal("0.05");
		BigDecimal roundUpSalesTax = salesTax.divide(increment, 0, BigDecimal.ROUND_UP).multiply(increment);
		return roundUpSalesTax;
	}
}
