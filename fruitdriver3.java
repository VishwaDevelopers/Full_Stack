//case3: without up-casting only down-casting
class fruitdriver3 
{
	public static void main(String[] args) 
	{
		fruit f1=new fruit();
		System.out.println(f1.a);
		//System.out.println(f1.a);CTE

		if(f1 instanceof Apple){
			Apple a1=(Apple)f1;
			System.out.println(a1.a);
			System.out.println(a1.b);
		}
	}
}
