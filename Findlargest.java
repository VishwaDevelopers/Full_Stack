import java.util.*;
class  Findlargest
{
	public static void main(String[] args) 
	{
		int[]a={4,1,2,16,7,-9};
		System.out.println(Arrays.toString(a));
		int res=findlargest(a);
		System.out.println(res);
	}
	public static int findlargest(int[]a)
	{
		int max=Integer.MIN_VALUE;
		for (int i=0;i<a.length ;i++ )
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
		}
}
