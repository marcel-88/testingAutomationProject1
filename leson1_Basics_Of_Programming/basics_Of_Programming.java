import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	
	public static void main(String[] args)
	{
		Scanner imput=new Scanner(System.in);
		
		
		while(true)
		{
			
			System.out.println("Select one exercise from 6: ");
			
			int exercise=imput.nextInt();
			
			switch(exercise)
			{
				case 1:
				{
				int x,y,z;
			
			System.out.println("Enter 3 numbers separated by enter: ");
			x=imput.nextInt();
			y=imput.nextInt();
			z=imput.nextInt();
			boolean result=((x!=y)&&(y!=z)&&(x!=z))?true:false;
			
			System.out.println("Result for exercise 1: "+result);
			break;
				}
				case 2:
				{
					System.out.println("Enter 3 ints: ");
					int x,y,z;
				x=imput.nextInt();
				y=imput.nextInt();
				z=imput.nextInt();
				
				boolean result=((x>0)!=(y>0)!=(z>0))&&!(x>0&&y>0&&z>0)?true:false;
				
				System.out.println("Result for exercise 2: "+result);
				break;
				}
				case 3:
				{
					System.out.println("Enter 3 ints for exercise 3: \r\n(Note: first 2 ints X and Y are coordonates for chocolate rectangle and 3th Z is for segments).");
					int x,y,z;
					x=imput.nextInt();
					y=imput.nextInt();
					z=imput.nextInt();
					int[][] chocolate_Bar=new int[x][y];
					
					if(((z%x==0)&&(z/x<y))||((z%y==0)&&(z/x<y)))
					{
						System.out.println("Yes");
					}
					else
					{
						System.out.println("No");
					}
					break;
				}
				case 4:
				{
					System.out.println("Enter number of rows to drow a right triangle");
					
					int rows=imput.nextInt();
					
			for(int i=1; i<=rows; i++)
			{
				for(int j=1; j<=i; j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
			break;
				}
			case 5:
			{
			System.out.println("Enter colors of matrix:\r\nw(wait), b(black), r(red), g(green), y(yellow)");
			
			char[][] matrix_Pretty=new char[4][4];
			
			for(int i=0; i<4; i++)
			{
				matrix_Pretty[i]=imput.next().toCharArray();
			}
			
			char letter;
			boolean is_Pretty=true;
			
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					letter=matrix_Pretty[i][j];
					
					if(matrix_Pretty[i+1][j]==letter&&matrix_Pretty[i][j+1]==letter&&matrix_Pretty[i+1][j+1]==letter)
					{
						is_Pretty=false;
					}
				}
			}
			
			if(is_Pretty)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			break;
			}
			case 6:
			{
				System.out.println("Enter a int number not greater than 100: ");
				int n=imput.nextInt();
				if(n<100)
				{
					int[][] array=new int[n][n];
					
					for(int i=0; i<n; i++)
					{
						for(int j=0; j<n; j++)
						{
							array[i][j]=Math.abs(i-j);
						}
					}
					
					for(int i=0; i<n; i++)
					{
						System.out.println(Arrays.toString(array[i]));
					}
				}
				else
				{
					System.out.println("Error! Please enter a number under 100");
				}
				break;
			}
			case 0:
			{
				java.lang.System.exit(0);
			}
			default:
			{
				System.out.println("Error! Choose a correct option from above");
			}
			}
		}
		
	}
}
