package figure;

public class Square extends Shape
{
	
	double lenngth,result;
	
	public double getResult()
	{
		return result;
	}
	
	public Square(double Length)
	{
		this.lenngth=Length;
	}
	
	@Override
	public void area()
	{
		result=(lenngth*lenngth);
	}
	
}
