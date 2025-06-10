class A4 
{
	static int m=10;
	static int n=20;
}
class B extends A4
{
	static int o=30;
	static int p=40;;
	public static void main(String[]args)
	{
		System.out.println(m);
		System.out.println(B.m);
		System.out.println(n);
		System.out.println(B.n);
		System.out.println(o+":"+p);
	}
}
/*
10
10
20
20
30:40
*/
