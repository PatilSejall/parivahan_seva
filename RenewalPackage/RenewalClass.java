package RenewalPackage;

import java.util.*;
import java.lang.*;

public class RenewalClass extends Exception
{
	public RenewalClass(String message)
	{
		super(message);
	}


	public void rnmethod()
	{
		Scanner sc= new Scanner(System.in);
		char y=0,n=0;

		System.out.println("Following are the stages for application submission in Service on driving liscence in the following order");
		System.out.println("1] Fill Applicant/Request datails\n2] Upload documents(if required)\n3] Upload Phot and signature if required(applicable only in certain states)\n4] Driving Liscence Test slot Booking\n5] Payment of fees\n6]Verify Pay status\n7] Print the Receipt");
			RenewalClass e1= new RenewalClass("Invalid Driving Liscence details. Driving liscence number should be atleast 15 digit");
			System.out.println("Please agree to the terms(y/n)");
			char ch=sc.next().charAt(0);
			try
			{	
				if(ch=='y')
				{
					System.out.println("Enter your Driving liscence number");
					String num=sc.next();
					if(num.length()<15)
						{
							throw e1;
						}
					else
					{
					System.out.println("You are eligible for Renewal of the liscnce!!!");
					System.out.println("Contact your nearest RTO for futher information");
					}
				}
				else
				{
					System.out.println("You have to agree the terms first to proceed further");
				}
	
			}
			
			catch(RenewalClass e)
			{
				System.out.println(e.getMessage());
			}
	}
}
