class binarysearch 
{
	public static void main(String[] args) 
	{
		int[]a={12,22,33,44,56,64,77,87,99};
		if(binarysearch(a)==true);{
		     System.out.println("Present");
		}
		else if
			System.out.println("Not Present");
		}
	public static boolean binarysearch(int[]a)
	{
		System.out.println(Arrays.toString(a));
		int l=1,h=a.length-1,key=64;
		int m;
		while(l<=h)
		{
			int m=l+h/2;
			if (key==a[m])
			{
				return true;
			}
			else if (key<a[m])
			{
				h=m-1;
			}
			else if (key>a[m])
			{
				h=m+1;
			}
		}
		return false;
	}
}



