import java.util.*;
public class containsdup {
    public static boolean containsdup(int[]a)
    {
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            return true;
        }
        return false ;
    }
public static void main(String[]args)
{
    int[]a={8,4,1,7,6};
    System.out.println(Arrays.toString(a));
    System.out.println(containsdup(a));
}
}