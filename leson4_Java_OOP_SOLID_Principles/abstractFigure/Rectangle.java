package abstractFigure;

public class Rectangle extends Shape
{
	
	private double length,width,resultArea,resultPerimeter;
	
	public double getResultArea()
	{
		return resultArea;
	}
	
	public double getResultPerimeter()
	{
		return resultPerimeter;
	}
	
	public Rectangle(double Length, double Width)
	{
		this.length=Length;
		this.width=Width;
	}
	
	public void calculateArea()
	{
		resultArea=(length*width);
	}
	
	public void calculatePerimeter()
	{
		resultPerimeter=(2*length+2*width);
	}
	
}
