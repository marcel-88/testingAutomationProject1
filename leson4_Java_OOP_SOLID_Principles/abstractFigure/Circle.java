package abstractFigure;

public class Circle extends Shape
{
	
	private double radius,diameter,resultArea,resultPerimeter;
	
	public double getResultArea()
	{
		return resultArea;
	}
	
	public double getResultPerimeter()
	{
		return resultPerimeter;
	}
	
	public Circle(double Radius)
	{
		this.radius=Radius;
		this.diameter=(radius*radius);
	}
	
	public void calculateArea()
	{
		resultArea=Math.PI*(radius*radius);
	}
	
	public void calculatePerimeter()
	{
		resultPerimeter=Math.PI*diameter;
	}
	
}
