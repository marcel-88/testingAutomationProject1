package figure;
	
public class Circle extends Shape
{
	
	private double radius,result;
	
	//for question
public double getResult()
	{
		return result;
	}
	
	public Circle(double Radius)
	{
		this.radius=Radius;
	}
	
	@Override
	public void area()
	{
		result=Math.PI*(radius*radius);
	}
}
