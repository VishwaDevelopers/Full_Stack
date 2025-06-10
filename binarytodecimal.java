import java.util.Scanner;
class binarytodecimal
{
	public static void main(String[] args) 
	{
		int binary=1101;
		int sum=0,x=1;
		while(binary>0)
		{
			sum+=binary%10*x;
			binary/=10;
			x*=2;
		}
		System.out.println(sum);
	}
}
