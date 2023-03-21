package figure;

public class Rectangle extends Shape
{
	
	double width,height,result;
	
	public double getResult()
	{
		return result;
	}
	
	public Rectangle(double Width, double Height)
	{
		this.width=Width;
		this.height=Height;
	}
	
	@Override
	public void area()
	{
		result=(width*height);
	}
	
}
