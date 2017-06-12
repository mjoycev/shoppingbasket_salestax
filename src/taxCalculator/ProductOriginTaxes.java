package taxCalculator;

public enum ProductOriginTaxes {

	LOCAL(" ", 0), 
	IMPORTED(" imported ", 5);
	
	private String description;
	private double taxRate;
	
	ProductOriginTaxes(String description, double taxRate) {
		this.description = description;
		this.taxRate = taxRate;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getTaxRate() {
		return this.taxRate;
	}
}
