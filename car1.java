class car1 
{
	String car_name;
	String color;
	double price;
	Engine e;
	car1(){}

	 car(String name,String color,double price,Engine e)
	{
		this.name=name;
		this.color=color;
		this.price=price;
		this.e=e;
	}

	public void detailsofcar(){
		System.out.println("Name:"+name);
		System.out.println("Color:"+color);
		System.out.println("Price:"+price);
	}

}
