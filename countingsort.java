import java.util.*;
class  countingsort
{
	public static void main(String[] args) 
	{
		int[]a={7,3,1,1,7,2,1,2,7};
		System.out.println(Arrays.toString(a));
		solve(a);
		System.out.println(Arrays.toString(a));
	}
	int max=Integer.MIN_VALUE;
	for (int i=0;i<a.length;i++ )
	{
      if (a[i]>max)
      {
		  max=a[i];
      }
	}
	int[]b=new int[max+1];

	  for (int i=i+1;i<a.lenght ;i++ )
	  {
		  b[a[i]]++
	  }
		  int m=0;
		  
		  for (int i=0;i<a.length ;i++ )
		  {
			  if (b[i]==0)
			  {
				  continue;
			  }
			  else
				  a[m++]=i;
			  b[i]--;
			  i--;
		  }
	  
	}
}
