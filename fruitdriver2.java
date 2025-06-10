//case2: with using up casting and down casting
class fruitdriver2 
{
	public static void main(String[] args) 
	{
		fruit f1=new Apple();
		System.out.println(f1.a);
		//System.out.println(f1.b); CTE

		if(f1 instanceof Apple){
			Apple a1=(Apple)f1;
			System.out.println(a1.a);
			System.out.println(a1.b);
		}
	}
}
