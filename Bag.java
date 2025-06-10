import java.util.*;
class Bag
{
	Ball bag;
	public Bag(){
		
}
public void addBall(Ball ball){
	if(bag==null){
	bag=ball;
	System.out.println("\t\t\tBall Added Successfully");
	}else{
		System.out.println("\t\t\tAlready Bag is Having Ball");
		}
	}
public void removeBall(){
	if(bag!=null){
	bag=null;
	System.out.println("\t\t\tBall Removed From Bag");
	}else{
		System.out.println("\t\t\tBag is Already Empty");
		}
}
public boolean IsBagEmpty(){
	return bag==null;
	}
	public String showGame(){
	 if (bag instanceof TennisBall)
		{
			TennisBall tb=(TennisBall)bag;
			return "Tennis Ball";
		}
		else if (bag instanceof BasketBall)
		{
			BasketBall bb=(BasketBall)bag;
			return "Basket Ball";
		}
		return "No Game Can Be Played Because Bag is Empty";
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args){
		TennisBall tb=new TennisBall(5);
		BasketBall bb=new BasketBall(15);
		Bag wild_craft=new Bag();
		boolean flag=true;
		do
		{
		System.out.println("create object of bag");
		System.out.println("create object of bag");
		System.out.println("1.AddBall\n2.RemoveBall\n3.IsBagEmpty\n4.ShowGame");
		System.out.println("Exit");
		int input=sc.nextInt();
		switch(input)
			{
				case 1:
					if (wild_craft.IsBagEmpty()){
						System.out.println("\t\t\tselect the Ball");
						System.out.println("\t\t\t1.Tennis Ball");
						System.out.println("\t\t\t2.Basket Ball");
						int select=sc.nextInt();
						if(select==1){
							wild_craft.addBall(tb);
						}
						else if(select==2){
							wild_craft.addBall(bb);
						}
				}
						break;
				case 2:
						wild_craft.removeBall();
						break;
				case 3:
						System.out.println((wild_craft.IsBagEmpty())?"yes":"no");
						break;
				case 4:
						System.out.println(wild_craft.showGame());
						break;
				case 5:
						flag=false;
						break;
			}
		}while(flag);
		System.out.println("Thank you...");
}
}
