import java.util.*;
class aba 
{
    public static void main(String[] args) 
	{
		String s="aba";
		char[]a=s.toCharArray();
		String res="";
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i;j<a.length ;j++ )
			{
				for (int k=i;k<=j ;k++ )
				{
					[b[a]-'a']++;
				}
			}
		}
		for (char i='a';i<='z';i++ )
		{
           if (b[i-'a']!=0)
           {
			   System.out.println(i+":"+b[i-'a']+"\n");
           }
		}
	}
}
