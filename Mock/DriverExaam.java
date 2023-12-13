package Mock;
import java.util.*;
import java.lang.*;


public class DriverExaam
{
	public void Exam()
	{
		char[] anskey={'C','A','B','A','D','C','B'};
		char[] studans=new char[anskey.length];
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		for(int i=0;i<anskey.length;i++)
		{
			try{
			System.out.println("What is the answer of Question no ("+(i+1)+")");
			studans[i]=sc.next().charAt(0);	
			}
			catch(InputMismatchException e)
			{
				System.out.println(e);
			}
		}

		int right=0,wrong=0;
		for(int i=0;i<anskey.length;i++)
		{
			if(anskey[i]==studans[i])
			{
				right++;
			}
			
			else
			{
				wrong++;
			}
		}

		System.out.println("The correct answers are "+right+" and incorrect answers are "+wrong);
		if(right>5)
		{
			System.out.println("Congratulations!!You have passed exam successfully!!");
		}
		else
		{
			System.out.println("Failed!!Your score is less than 75%. Better luck next time!!");
		}
	}
}