import java.util.*;
class  bubblesort
{
	public static void main(String[] args) 
	{
		int[]a={7,3,8,2,9,4,1,5};
		System.out.println(Arrays.toString(a));
		bubblesort(a);
	}
	public static void bubblesort(int[]a)
	{
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=0;j<a.length-1 ;j++ )
			{
				if (a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
