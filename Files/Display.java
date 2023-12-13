package Files;
import java.io.*;
import java.util.*;

class DisFilePro
{
	Scanner sc= new Scanner(System.in);
	FileOutputStream fw;
	FileInputStream fr;
	int id,age;
	String name,state,address,rto;
	public void meth()
	{

		try
		{
		fw=new FileOutputStream("Liscence_Info.doc");
		System.out.println("Enter the age of the Applicant");
		age=sc.nextInt();
		//byte b[]=age.getBytes();
		//fw.write(b);
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
			byte c[]=name.getBytes();
			fw.write(c);
			System.out.println("Enter the Adhaar Number of applicant");
			id= sc.nextInt();
			System.out.println("Enter the State applicant");
			state = sc.next();
			byte e[]=state.getBytes();
			fw.write(e);
			System.out.println("Enter the Address of the Applicant");
			 address= sc.next();
			byte f[]=address.getBytes();
			fw.write(f);
			System.out.println("Enter the preffered RTO");
			rto= sc.next();
			byte g[]=rto.getBytes();
			fw.write(g);

			
			
		
		}
		}//End of try
	

		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}

            }
}


public class Display extends DisFilePro
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