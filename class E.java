class E 
{
	int x=10;
}
class F extends E
{
	int y=20;
}
class H extends E
{
	int z=30;
}
class wbt2
{
	public static void main(String[]args){
		E ref1=new F();
		G ref2=(G)ref1;
	}
}
