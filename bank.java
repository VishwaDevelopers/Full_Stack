class bank 
{
	private String account_holder_name;
	private long account_number;
	private double balance;

	public bank (String account_holder_name,long account_number,double balance )
	{
		this.account_holder_name=account_holder_name;
		this.account_number=account_number;
		this.balance=balance;
	}
	public String getaccountholdername()
	{
		return account_holder_name;
	}
	public void setaccountholdername(String account_holder_name)
	{
		this.account_holder_name=account_holder_name;
	}
	public long getaccountnumber()
	{
		return account_number;
	}
	public double getbalance()
	{
		return balance;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public void accountdetails()
	{
		System.out.println(account_holder_name);
		System.out.println(account_number);
		System.out.println(balance);
	}
}
