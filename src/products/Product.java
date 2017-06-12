package products;

import java.math.BigDecimal;

import taxCalculator.ProductOriginTaxes;

public abstract class Product {

	protected String name;
	protected Integer qty;
	protected BigDecimal unitPrice;
	protected Boolean isImported;
	protected String keyword;

	public Product() {
	}

	public Product(Integer qty, Boolean isImported, String keyword,
			String name, BigDecimal unitPrice) {
		this.name = name;
		this.qty = qty;
		this.unitPrice = unitPrice;
		this.isImported = isImported;
		this.keyword = keyword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Boolean getIsImported() {
		return isImported;
	}

	public void setIsImported(Boolean isImported) {
		this.isImported = isImported;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public double getApplicableTaxes() {
		double taxes = 0.0;
		if (isImported) {
			taxes += ProductOriginTaxes.IMPORTED.getTaxRate();
		}
		taxes += getLocalTaxes();

		return taxes;
	}

	public abstract double getLocalTaxes();
}
