class car  
{
	String name;
	String colour;
	double price;
	static String owner="VishwaNa";
	public void run(){
		System.out.println(name+"is running");
	}
	public void stop(){
		System.out.println(name+"is stops");
	}
	public void detailsofthecar(){
		System.out.println("car name:"+name);
		System.out.println("car colour:"+colour);
		System.out.println("car price:"+price);
		System.out.println("car owner:"+owner);
		System.out.println("------------------------");
	}
}

