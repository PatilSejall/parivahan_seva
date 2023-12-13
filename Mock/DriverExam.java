package Mock;
import java.util.*;
import java.lang.*;


public class DriverExam
{
	public void Exam()
	{
	System.out.println("Please answer the following questions with A,B,C,D");
	System.out.println("\nQ1. What is the minimum age for driving a motorcycle without gear?\nA.16 years\nB.21 year\nC. 18 years\nD.17 years");

	System.out.println("\nQ2. What should you do when you see a traffic sign of a school nearby?\nA.Stop the vehicle\nB.Slow down and proceed carefully\nC.Press the horn and proceed at the same speed\nD.Will not take that road for travelling");

	System.out.println("\nQ3. Before you overtake a vehicle, what should you keep in mind\nA.The road ahead should be clearly visible and overtaking should be safe\nB.The road is not safe\nC.There are no vehicles ahead\nD.You can overtake anytime");

	System.out.println("\nQ4. If a driver sees the sign for ‘slippery road ahead’, he/she must\nA.Drive faster\nB.Change gear and reduce speed\nC.Apply brake but proceed at the same speed\nD.Not drive at all");

	System.out.println("\nQ5. Overspeeding is\nA.Not an offence and can be neglected\nB.Talent.\nC.Is an offence but no charges are pressed against you\nD.An offence that could lead to your driving licence being cancelled or suspended");

	System.out.println("\nQ6. In case you see a vehicle that has met with an accident with injured passengers inside, you should\nA.Stop your vehicle and report the matter to the nearest police station\nB.Take the vehicle to the closest police station and report the accident\nC.Take measures to secure medical attention to those injured and report the accident to the closest police station within a period of 24 hours\nD.Take video instead of bringing help");


	System.out.println("\nQ7. Suppose you are driving on a road with two lanes. The vehicle to the front of you is driving slowly and the road ahead is clear and safe to overtake. What should you do?\nA.Overtake the vehicle from the left side of the vehicle ahead\nB.Overtake the vehicle from the right side of the vehicle ahead\nC.Overtake if the road is wide enough\nD.Overtake without looking ahead or behind");

		char[] anskey={'C','B','A','B','D','C','B'};
		char[] studans=new char[anskey.length];
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		for(i=0;i<anskey.length;i++)
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
		for(i=0;i<anskey.length;i++)
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