package Linfo;

import java.util.*;

interface check
{
	void eligible();
}

class Display implements check
{
	Scanner sc= new Scanner(System.in);
	int id,age;
	String name,state,address,rto;
	public void eligible()
	{
		System.out.println("Enter the learning liscence number of the Applicant");
		age=sc.nextInt();
		
		if(age<=18)
		{
			System.out.println("The applicant is not eligible for Driving Liscence");
			
		}
		
		else
		{
			System.out.println("The applicant is eligible for Driving Liscence");
			System.out.println("Enter the Information of the applicant");
			System.out.println("Enter the name of the Applicant");
			name = sc.next();
			System.out.println("Enter the Adhaar Number of applicant");
			id= sc.nextInt();
		}
		
	}

	public void other()
	{
		if(age>=18)
		{
		System.out.println("Other information of applicant for Driving Liscence");
			System.out.println("Enter the State applicant");
			state = sc.next();
			System.out.println("Enter the Address of the Applicant");
			 address= sc.next();
			System.out.println("Enter the preffered RTO");
			rto= sc.next();
	
		}
	}

		
}

public class Info extends Display
{

	public void putInfo()
	{
		System.out.println("---------------------------THE INFORMATION OF APLLICANT---------------------------");
		System.out.println("Name of the applicant :"+name);
		System.out.println("Age of the applicant :"+age);
		System.out.println("Adhaar of the applicant :"+id);
		
	}

	public void dis()
	{
		System.out.println("/n/n------------------------------OTHER OF APLLICANT-----------------------------------");
		System.out.println("State of the applicant :"+state);
		System.out.println("Address of the applicant :"+address);
		System.out.println("Preffered RTO :"+rto);
		
	}

}