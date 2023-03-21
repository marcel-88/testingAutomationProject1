package drawFigure;

public class Circle implements Drawable
{
	
	private double radius;
	static final double PR=1.77777777778;
	//Pixel rate 16/9
	
	public Circle(double Radius)
	{
		this.radius=Radius;
	}
	
	public void draw()
	{
		
		for(double i=-radius; i<=radius; i++)
		{
			for(double j=-radius; j<=radius; j++)
			{
				double res=((i*PR)/radius)*((i*PR)/radius) + (j/radius)*(j/radius);
				
				if(res>0.95&&res<1.08)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("\r\n");
		}
	}
	
}
