class A
{
	static void x=10;

	class B extends A
	{
		static void x=20;
	}
	class C extends B
	{
		static int x=30;
		public static void main(String[]args){
			A ref1=new B();
			B ref2=new A();
			C ref3=new C();
			System.out.println(x);
			System.out.println(ref1.x);
			System.out.println(ref2.x);
			System.out.println(ref3.x);
			System.out.println(B.x);
			System.out.println(C.x);
		}
	}
}