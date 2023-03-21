import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class Main
{
	
	public static void main(String[] args)
	{
		File file1=new File("file1.txt");
		File file2=new File("file2.txt");
		Scanner scanner=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("select an exercise: ");
			int exercise=scanner.nextInt();
			scanner.nextLine();
			
			switch(exercise)
			{
				case 1:
				{
					
					try
					{
						
						if((file1.createNewFile())||(file1.exists()))
						{
							System.out.println(file1.getName()+" created succesfully\r\nEnter text in file: ");
							
							String user_Data=scanner.nextLine();
							Writer file_Writer=new FileWriter(file1);
							file_Writer.write(user_Data);
							file_Writer.close();
						}
						else
						{
							System.out.println("Error! File can not be created. Try again");
						}
					}
					catch(IOException e)
					{
						System.out.println("An error occurred. See the stacktrace below for details");
						e.printStackTrace();
					}
					break;
				}
				case 2:
				{
					
					try
					{
						if((file2.createNewFile()&&file2.exists()&&file1.exists())||(file1.exists()&&file2.exists()))
						{
							Reader file1_Reader=new FileReader(file1);
							Writer file2_Writer=new FileWriter(file2);
							
							int c;
							
							while((c=file1_Reader.read())!=-1)
							{
								file2_Writer.write(c);
							}
							file1_Reader.close();
							file2_Writer.close();
							System.out.println("File 1 has been copied into file2 succesfully");
						}
					}
					catch(IOException e)
					{
						System.out.println("An error occurred! See the stacktrace below");
						e.printStackTrace();
					}
					break;
				}
				case 3:
				{
					System.out.println("Enter a word for find howmany times apear in file: ");
					String word=scanner.nextLine();
					int counter=count_Words(word);
					System.out.println("Word "+word+" apears "+counter+" times in file.");
					break;
				}
				case 4:
				{
					System.out.println("Enter what word do you want to replace: ");
					String old_Word=scanner.nextLine();
					System.out.println("Enter new word");
					String new_Word=scanner.nextLine();
					
					replace_Text_File(old_Word,new_Word);
					break;
				}
				case 0:
				{
					java.lang.System.exit(0);
				}
				default:
				{
					System.out.println("Error! Select a correct option: ");
				}
			}
		}
	}
	
	
	/*Old code
	public static int count_Words(String word)
	{
		int counter=0;
		
		try
		{
			File file3=new File("file3.txt");
			if(file3.exists())
			{
				FileReader file3_Reader=new FileReader(file3);
				int c;
				String temp="";
				
				while((c=file3_Reader.read())!=-1)
				{
					
					if(c==' '||c==','||c=='.'||c==':'||c=='!'||c=='?'||c==';'||c=='\t'||c=='\n')
					{
						if(word.equalsIgnoreCase(temp))
						{
							counter++;
						}
						temp="";
						continue;
					}
					else
					{
					temp+=(char)c;
					}
				}
				file3_Reader.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred! See the stacktrace below");
			e.printStackTrace();
		}
		return counter;
	}
	Ending old code*/
	
	
	//New code
	public static int count_Words(String word)
	{
		int counter = 0;
		
		try
		{
			File file3 = new File("file3.txt");
			
			if (file3.exists())
			{
				FileReader file3_Reader = new FileReader(file3, StandardCharsets.UTF_8);
				String temp = "";
				char c;
				
				while ((c = (char)file3_Reader.read()) != '\uffff')
				{
					if (!Character.isLetterOrDigit(c))
					{
						if (word.equalsIgnoreCase(temp))
						{
							counter++;
						}
						
						temp = "";
						continue;
					}
					temp += c;
				}
				
				if (word.equalsIgnoreCase(temp))
				{
					counter++;
				}
			}
		}
		catch (IOException e)
		{
			System.out.println("An error occurred! See the stacktrace below");
			e.printStackTrace();
		}
		
		return counter;
	}
	
	public static void replace_Text_File(String old_Word, String new_Word)
	{
		
		try
		{
			
			File file3=new File("file3.txt");
			if(file3.exists())
			{
				String content=Files.readString(file3.toPath(),StandardCharsets.UTF_8);
				String new_Content=content.replace(old_Word,new_Word);
				Files.writeString(file3.toPath(),new_Content,StandardCharsets.UTF_8);
				content=Files.readString(file3.toPath(),StandardCharsets.UTF_8);
			}
			
		}
		catch(IOException e)
		{
			System.out.println("An error occurred! See stacktrace below");
			e.printStackTrace();
		}
	}
}
