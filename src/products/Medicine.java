package products;

import java.math.BigDecimal;

import taxCalculator.LocalTaxes;

public class Medicine extends Product {

	public Medicine(Integer qty, Boolean isImported, String keyword,
			String name, BigDecimal unitPrice) {
		super(qty, isImported, keyword, name, unitPrice);
	}

	@Override
	public double getLocalTaxes() {
		return LocalTaxes.MEDICINE.getTaxRate();
	}
}
