package taxCalculator;

public enum LocalTaxes {

	BOOK("book", 0), 
	MEDICINE("medicine", 0), 
	FOOD("food", 0), 
	DEFAULT("",10);
	
	private String description;
	private double taxRate;
	
	LocalTaxes(String description, double taxRate) {
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
