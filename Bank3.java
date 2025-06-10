interface Bank3
{
	String GOVERNER="RBI";

	void deposite(double amount);
	void withDraw(double amount);
	double checkBalance();
}
class Account implements Bank3
{
	String bname,type,ifsc,acc_holder;
	long acc_no;
	double bal=0;
	Account(String bname,String type,String ifsc,String acc_holder,long acc_no)
	{
		super();

		this.bname=bname;
		this.type=type;
		this.ifsc=ifsc;
		this.acc_holder=acc_holder;
		this.acc_no=acc_no;

	}
	public void deposite(double amount){
		bal+=amount;
		System.out.println("Amount deposite from "+bname);
	}
	public void withDraw(double amount){
		if (bal>=amount)
		{
			bal-=amount;
			System.out.println("Amount withdraw from"+bname);
		}
	}
	public double checkBalance(){
		return bal;
	}
	public void detailsofAcc(){
		System.out.println("Bank name:"+bname);
		System.out.println("Bank ifsc:"+ifsc);
		System.out.println("Account Holder:"+acc_holder);
		System.out.println("Account number:"+acc_no);
		System.out.println("Balance:" +bal);
	}
	
}
class User2
	{
		public static void main(String[] args){
			Bank3 ref=new Account("sbi","saving","sbi9029","saran",123);
			ref.deposite(1000);
			ref.withDraw(500);
			((Account)ref).detailsofAcc();
	}}