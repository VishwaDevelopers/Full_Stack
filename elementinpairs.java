class elementinpairs
{
	public static void main(String[] args) 
	{
		int[]a={8,3,2,6,1};
        elementinpairs(a);
	}
	public static void elementinpairs(int[]a)
	{
		for (int i=0;i<a.length-1 ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
				System.out.print(a[i]+","+a[j]+"\t");
			}
			System.out.println();
		}
	}
}
