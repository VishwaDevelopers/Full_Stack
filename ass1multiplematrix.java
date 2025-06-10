class ass1multiplematrix 
{
	public static void main(String[] args) 
	{
		int[][]a={{1,3,4},{2,4,3},{3,4,5}};
		int[][]b={{1,3,4},{2,4,3},{1,2,4}};
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(a[i][j]*b[i][j]+" ");
			}
			System.out.println();			
		}
	}
}

///*
1 9 16
4 16 9
3 8 20
///*
