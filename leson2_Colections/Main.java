import java.util.*;

public class Main
{
	
	public  static void main(String[] args)
	{
		Scanner imput=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("enter number of exercise: ");
			int exercise=imput.nextInt();
			imput.nextLine();
			
			switch(exercise)
			{
				case 1:
				{
					HashMap<Integer,String> fruits=new HashMap<Integer,String>();
					fruits.put(1,"Apple");
					fruits.put(2,"Banana");
					fruits.put(3,"Cherry");
					System.out.println("Enter value: ");
					String value = imput.nextLine();
					
					for(Map.Entry m:fruits.entrySet())
					{
						if(value.equals(m.getValue()))
						{
							System.out.println(m.getKey());
						}
						else
						{
							System.out.println("Value is not exits");
						}
					}
					
					break;
				}
				case 2:
				{
					List<String> list=new ArrayList<String>();
					list.add("char");
					list.add("go");
					list.add("Light");
					list.add("no");
					
					ListIterator<String> iterator=list.listIterator();
					
					while(iterator.hasNext())
					{
						System.out.println(iterator.nextIndex()+" "+iterator.next());
					}
					
					iterator=list.listIterator();
					while(iterator.hasNext())
					{
						if(iterator.next().length()<3)
						{
							iterator.remove();
						}
						else
						{
							System.out.println("Continue");
						}
					}
					
					iterator=list.listIterator();
					while(iterator.hasNext())
					{
						System.out.println(iterator.nextIndex()+" "+iterator.next());
					}
					
					break;
				}
				case 3:
				{
					List<Integer> numbers=new ArrayList<>();
					numbers.add(10);
					numbers.add(5);
					numbers.add(20);
					numbers.add(25);
					numbers.add(1);
					numbers.add(0);
					
					List<Integer> result=pow2(numbers);
					
					System.out.println(numbers+"\r\n"+result);
					break;
				}
				case 0:
				{
					java.lang.System.exit(0);
				}
				default:
				{
					System.out.println("Select a corect value: ");
				}
			}
		}
		
	}
	
	public static List<Integer> pow2(List<Integer> numbers)
	{
		List<Integer> pow=new ArrayList<>();
		
		for(int i:numbers)
		{
			pow.add((int)java.lang.Math.pow(i,2));
		}
		return pow;
	}
}
