import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class Quizzer
{
	static ArrayList userArray = new ArrayList();
	 static int number;
	public static void main(String[] args)
		{
		userNumber();
		
		}
		public static void userNumber()
			{
			do
				{
				System.out.println("Enter any number you wish, to end type -1 ");
				Scanner userInput1=new Scanner(System.in);
				userArray.add(number);
				
			if(number<=20)
				{
				Collections.sort(userArray);
				}
			if(number>0)
				{
				Collections.sort(userArray);
				}
			if(number==-1)
				{
				
				}
			else
			{
			System.out.println("Error");
			System.exit(0);
			}
				}
			while();
				
			}


	}
