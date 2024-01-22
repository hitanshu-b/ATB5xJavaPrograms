package src.oops_5;

public class Bank {
	
	private String currency;
	
	private Integer amount;
	
	public Bank(String currency, Integer amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public Integer addValue(Bank bankName) throws CustomException{
		if(!(bankName.currency.equalsIgnoreCase("INR"))) {
			throw new CustomException("USD to INR Not Supported");
		}
		Integer sum = this.amount + bankName.amount;
		return sum;
	}

}
