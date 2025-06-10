class gowthamSwap 
{
	public static void main(String[] args) 
	{
		String s="i am gowtham";
		char a[]=s.toCharArray();
		int l=0,r=a.length-1;
		for (int i=0;i<=a.length ;i++ )
		{
			if (a[l]==' ')
			{
				l++;
			}
			else if (a[r]==' ')
			{
				r--;
			}
			else if(l<r)
			{
				char temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				i--;

		}
		String res=new String(a);
		
	}
	String res=new String(a);
	System.out.println(res);
}
}
