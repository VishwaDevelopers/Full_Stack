class Engine 
{
	String type,cc,power;
	Engine(){}

	Engine(String type,String cc,String power){
		this.type=type;
		this.cc=cc;
		this.power=power;
	}
	public void detailsofengine(){
		System.out.println("Type:"+type);
		System.out.println("Cc:"+cc);
		System.out.println("Power:"+power);
		System.out.println("----------------------");
	}
}
