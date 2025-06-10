class abcd 
{
	public static void main(String[] args) 
	{
		String s="abcd";
		char[]a=s.toCharArray();
	    for (int i=0;i<a.length;i++ )
		{
			for (int j=i;j<a.length;j++ )
			{
				for (int k=i;k<=j;k++ )
				{
					System.out.print(a[k]);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
		
	}


