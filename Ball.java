import java.util.*;
class Ball 
{
	private double radius;

	public Ball(){}
	public Ball(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
}
class BasketBall extends Ball{
	static String game="BasketBall";
	BasketBall(){}
	BasketBall(double radius){
		super(radius);
	}
}
class TennisBall extends Ball{
	static String game="TennisBall";
	TennisBall(){}
	TennisBall(double radius){
		super(radius);
	}
}
