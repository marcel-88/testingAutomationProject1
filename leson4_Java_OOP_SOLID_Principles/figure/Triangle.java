package figure;

public class Triangle extends Shape
{
	
	double base,height,result;
	
	public double getResult()
	{
		return result;
	}
	
	public Triangle(double Base,double Height)
	{
		this.base=Base;
		this.height=Height;
	}
	
	@Override
	public void area()
	{
		result=(base*height)/2;
	}
	
}
