package products;

import java.math.BigDecimal;

import taxCalculator.LocalTaxes;

public class OtherProducts extends Product {

	public OtherProducts(Integer qty, Boolean isImported, String keyword,
			String name, BigDecimal unitPrice) {
		super(qty, isImported, keyword, name, unitPrice);
	}

	@Override
	public double getLocalTaxes() {
		return LocalTaxes.DEFAULT.getTaxRate();
	}

}
