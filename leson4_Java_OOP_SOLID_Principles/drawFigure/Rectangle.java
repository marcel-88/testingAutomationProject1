package drawFigure;

public class Rectangle implements Drawable
{
	
	private int length,width;
	
	public Rectangle(int Length, int Width)
	{
		this.width=Width;
		this.length=Length;
	}
	
	public void draw()
	{
		
		for(int i=0; i<width; i++)
		{
			System.out.print("\t");
			for(int j=0; j<length; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
