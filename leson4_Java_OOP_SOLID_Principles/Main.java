import figure.*;
import abstractFigure.*;
import drawFigure.*;
import transport.*;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		
		while(true)
		{
			System.out.println("Select: ");
			Scanner scanner=new Scanner(System.in);
			int chose=scanner.nextInt();
			scanner.nextLine();
			
			switch(chose)
			{
				case 1:
				{
					Square square=new Square(4);
					Triangle triangle=new Triangle(2,5);
					figure.Circle circle=new figure.Circle(8);
					figure.Rectangle rectangle=new figure.Rectangle(8,6);
					
					square.area();
					triangle.area();
					circle.area();
					rectangle.area();
					
					System.out.println("Area of square is: "+square.getResult()+"\r\nArea of circle is: "+circle.getResult()+"\r\nArea of rectangle is: "+rectangle.getResult()+"\r\nArea of triangle is: "+triangle.getResult());
					break;
				}
				case 2:
				{
					Vehicle vehicle=new Vehicle();
					vehicle.setLicensePlate("ABC123");
					Vehicle car=new Car("ABC123",8);
					
					System.out.println(vehicle.toString()+"\r\n"+car.toString());
					break;
				}
				case 3:
				{
					abstractFigure.Circle circle=new abstractFigure.Circle(8);
					abstractFigure.Rectangle rectangle=new abstractFigure.Rectangle(8,6);
					
					circle.calculateArea();
					circle.calculatePerimeter();
					
					rectangle.calculateArea();
					rectangle.calculatePerimeter();
					
					System.out.println("Circle's area is: "+circle.getResultArea()+"\r\nCircle's perimeter is: "+circle.getResultPerimeter());
					System.out.println("Rectangle's area is: "+rectangle.getResultArea()+"\r\nRectangle's perimeter is: "+rectangle.getResultPerimeter());
					
				}
				case 4:
				{
					drawFigure.Circle circle=new drawFigure.Circle(2);
					drawFigure.Rectangle rectangle=new drawFigure.Rectangle(4,2);
					
					System.out.println("Circle: ");
					circle.draw();
					System.out.println("rectangle: ");
					rectangle.draw();
				}
				case 0:
				{
					java.lang.System.exit(0);
				}
				default:
				{
					System.out.println("Error! Select a valid method");
				}
			}
		}
	}
}
