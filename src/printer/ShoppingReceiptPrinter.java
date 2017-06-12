package printer;

import java.math.BigDecimal;
import java.util.List;

import products.Product;
import taxCalculator.ProductOriginTaxes;
import taxCalculator.TaxCalculatorUtil;

public class ShoppingReceiptPrinter {
	
	public ShoppingReceiptPrinter() {}

	public void printReceipt(List<Product> list) {
		System.out.println(" ===== RECEIPT ===== ");
		BigDecimal totalSalesTax = BigDecimal.ZERO;
		BigDecimal totalAmount = BigDecimal.ZERO;
		
		for (Product product : list) {
			String imported = product.getIsImported() ? ProductOriginTaxes.IMPORTED.getDescription() 
					: ProductOriginTaxes.LOCAL.getDescription();
			BigDecimal productSalesTax = TaxCalculatorUtil.computeSalesTax(product);
			BigDecimal totalSellingPrice = product.getUnitPrice().add(productSalesTax);
			
			System.out.println(product.getQty() + imported + product.getName() + " : " + totalSellingPrice);
			totalSalesTax = totalSalesTax.add(productSalesTax);
			totalAmount = totalAmount.add(totalSellingPrice);
		}
		
		System.out.println("Total Sales Tax : " + totalSalesTax);
		System.out.println("Total Amount : " + totalAmount);
		System.out.println(" ======= END ======= ");
	}
	
}
