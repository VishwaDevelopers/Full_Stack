import javax.xml.stream.events.EndDocument;

class rec100to1even
{
    static int Start=100,Ends=1;
public static void main (String[]args){
    System.out.print("Start");
    rec();
    System.out.print("Ends");
}
public static void rec()
{
    if(Start>=Ends)
    {
        if(Start%2==0){
            System.out.println(Start); 
        }
        Start--;
        rec();
    }
    
    }
}