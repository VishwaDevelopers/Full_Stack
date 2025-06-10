class A5 
{
	static int x=10;
	public static void dance(){
		System.out.println("Ravi and Praveen is dancing");
	}
}
class B5 extends A5
{
	static int y=20;
	public static void singing(){
		System.out.println("Tabrex and Sakthisri gopal is Singing");
	}
}
class C5 extends B5
{
	static int z=30;
	public static void swimming(){
		System.out.println("Vishwa and his friends are Swimming");
	}
	public static void main(String[]arge){
		dance();
		B5.dance();
		singing();
		swimming();
		System.out.println(x+":"+y+":"+z);
	}
}
/*
Ravi and Praveen is dancing
Ravi and Praveen is dancing
Tabrex and Sakthisri gopal is Singing
Vishwa and his friends are Swimming
10:20:30
*/
