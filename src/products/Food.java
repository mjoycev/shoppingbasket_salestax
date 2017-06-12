package products;

import java.math.BigDecimal;

import taxCalculator.LocalTaxes;

public class Food extends Product {

	public Food(Integer qty, Boolean isImported, String keyword, String name,
			BigDecimal unitPrice) {
		super(qty, isImported, keyword, name, unitPrice);
	}

	@Override
	public double getLocalTaxes() {
		return LocalTaxes.FOOD.getTaxRate();
	}
}
