abstract  public class Account {
    protected int accountNumber;
    protected Customer customerObj;
    protected double balance;
    
    //Uncomment the getters and setters after writing the attributes
    
    
    public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomerObj() {
		return customerObj;
	}

	public void setCustomerObj(Customer customerObj) {
		this.customerObj = customerObj;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
    
    public Account(int accountNumber,Customer customerObj,double balance) {
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    	this.customerObj=customerObj;
    }
    
    public abstract boolean withdraw(double amount);
}   