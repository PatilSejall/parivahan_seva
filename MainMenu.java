import java.util.*;
import java.lang.*;
import java.io.*;
import Files.*;
import Mock.*;
import Linfo.*;
import RenewalPackage.RenewalClass;
public class MainMenu
{
	public static void main(String args[])
	{
		//Code of Login
		
		Scanner sc= new Scanner(System.in);
		System.out.println("----------------------------------------Welcome to Parivahan Sewa----------------------------------------");
		System.out.println("\t\t\t\t\t\tLogin");
		
		System.out.println("Welcome to Citizen Login");
		System.out.println("Enter username");
		String UserName=sc.next();
		System.out.println("Enter password");
		String Pass=sc.next();
		String s1="gpp";
		if(Pass.equalsIgnoreCase(s1))
		{
		int ch=0;
		do{
			System.out.println("1.Liscence related services");
			System.out.println("2.Vehicle related services");
			System.out.println("3.Applet implementation");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: MenuTwo obj= new MenuTwo();
				obj.LiscenceMenu();
				break;

			case 2: VehicleMenu vm= new VehicleMenu();
				vm.Vone();
				break;

			
			}
		}while(ch<3);		
	
		}		
		
		else
		{
			System.out.println("Bad Credentials");
		}
	}

}

class Learning
{
	void caseOneInfo()
	{
		char ans=0,y=0,n=0;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.New Learning liscence");
		System.out.println("2.Take mock test for learning liscence");
		System.out.println("3.Main Menu ");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
			switch(choice)
			{
				case 1: 
					Display o=new Display();
					o.meth();
					o.putInfo();
					o.dis();
					break;
					
				case 2: DriverExam de=new DriverExam();
					de.Exam();
					break;
				case 3: MenuTwo mt=new MenuTwo();
					mt.LiscenceMenu();
					break;
			}
			System.out.println("Do you want to continue?(y/n)");
					ans=sc.next().charAt(0);
		
		}while(ans=='y');
	}
}

class Renewal
{
	void renew()
	{
	String message="";
	RenewalClass rn = new RenewalClass(message);
	rn.rnmethod();
	}
}
// Menu of Liscence 
class MenuTwo extends Learning
{
	public void LiscenceMenu()
	{
		int ch=0;
		char ans=0,y=0;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("\n\n1.Learning Liscence\n2.Driving Liscence\n3.Renewal\n4.Report\n5.Main Menu.\n6.Exit");
			ch= sc.nextInt();
		switch(ch)
		{
			case 1: // learning liscence using packages
				Learning learn= new Learning();
				learn.caseOneInfo();
				break;

			case 2:// driving liscence
				Info obj=new Info();
				obj.eligible();
				obj.other();
				obj.putInfo();
				obj.dis();
				break;

			case 3://Renewal
		
				Renewal rn= new Renewal();
				rn.renew();
				break;
				
			case 4://Report
				ReportLiscence rl=new ReportLiscence();
				rl.rep();
				break;
			case 6:break;

			
		}
			System.out.println("Do you want to continue?(y/n)");
					ans=sc.next().charAt(0);
						
		}while(ans=='y');
	      
	}
}

class VehicleMenu
{
	void Vone()
	{
		int ch;
		char ans;
		do
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("1.Apply for fitness renewal/Re-apply after fitness being failed");
			System.out.println("2.Pay your tax/fine\n3.Report/Feedback\n4.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: Fit ft=new Fit();
					ft.application();
					break;

				case 2:Threading th=new Threading();
					th.taxable();
					break;
				case 3:ReportMenu rpm= new ReportMenu();
					rpm.repmen();
					break;
			}

			System.out.println("Do you want to continue?(y/n)");
			ans=sc.next().charAt(0);
			
		}while(ans=='y');	
	}
}

class Fit
{
	void application()
	{
		System.out.println("The Condition Of Tyres Should Be Compliant With The Provisions Of Central Motor Vehicles Rules, 1989.\n1.Fitment of Bald Tyres In Vehicle Will Be Rejected.\n2.Wind Screen Must Be In Good And Unbroken Condition. Vehicle With Broken Wind Screen Will Be Made Unfit.\n3.Vehicle Must Have Retro Reflective Tapes Affixed At Specified Places As Per Provisions Of Central Motor Vehicles Rules, 1989\n4.Vehicle Must Comply The Emission Norms Provided In The Central Motor Vehicles Rules, 1989\n5.Reflectors Shall Be In Good and Working Condition.\n6.Stop Light, Direction Indicator, Other Necessary Lights And Bulbs Fitted In The Vehicle Shall Be In Good And Working Condition\n7.Ensure Proper And Working Fitment Of Vehicle Head Light. Fuse/Missing Or Non Working Head Light In The Vehicle Shall Be Made Unfit.\n8.There Should Not Be Any Water Entry In Head Lamp.\n9.The Dip And High Beam Function Of Headlight Should Be In Proper Operation; Otherwise Vehicle Shall Be Made Unfit.\n10.Both Side Rear View Mirrors Should Not Be Broken Or Lose Fitted Or Missing, Otherwise Vehicle Shall Be Made Unfit.\n11.Wipers Should Not Be Broken Or Lose Fitted Or Non- Functional Or Missing, Otherwise Vehicle Shall Be Made Unfit.\n12.Horn Should Be Good Functional Condition And There Should Not Be Any Pressure Horn Or Multi Tone Horn Fitted In The Vehicle.\n13.Speedometer Shall Be In Proper Working Condition.\n14.Vehicle Should Be Fitted With Speed Governor And Should Have Valid Calibration Certificate.\nNote:\n1. Vehicle Owners Are Also Informed That No Persons Including Driver Shall Be Allowed To Enter The Test Lane At Automated Fitness Center.");

	Scanner sc=new Scanner(System.in);
	System.out.println("Please agree to the terms and condition(y/n)");
	char choice=sc.next().charAt(0);
	
	System.out.println("Enter your name");
	String name=sc.next();

	System.out.println("Enter the vehicle number");
	String vnum=sc.next();

	System.out.println("Enter chasis number(last 5 characters)");
	String chasis=sc.next();
	
	}
}

class Tax extends Thread
{
	public void run()
	{	for(int i=0;i<3;i++)
		{
		  System.out.println("The amount of remaining tax as per your login credentials is:");
		  System.out.println("Year 202"+i+" Tax=Rs"+(i*3000)+"Fine="+(i*250));

			try
			{
				Thread.sleep(500);
				//Thread.onSpinWait();
			}
			catch(Exception e)
			{
			}
		}
	}
}

class Threading
{
	void taxable()
	{
	Tax tx=new Tax();
	tx.start();
	}
}


class ReportMenu
{
	void repmen()
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Report\n2.Feedback\n3.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: Report rp=new Report();
					rp.rep();
					break;
				case 2: Feedback fd= new Feedback();
					fd.feed();
					break;
			}
			
		}while(ch!=3);
	}
}

class Report
{
	String repo;
	FileOutputStream fw;
	FileInputStream fr;
	void rep()
	{
		Scanner sc= new Scanner(System.in);
		try{
		fw=new FileOutputStream("Report.doc");
		System.out.println("Please file the report below");
		repo=sc.next();
		byte b[]=repo.getBytes();
		fw.write(b);
		fw.close();
		/*System.out.println("The report to be filed is as follows");
		fr= new FileInputStream("Report.doc");
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}*/
		fr.close();
		}//try closed
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class ReportLiscence
{
	String repo;
	FileOutputStream fw;
	FileInputStream fr;
	void rep()
	{
		Scanner sc= new Scanner(System.in);
		try{
		fw=new FileOutputStream("Report_Liscence.doc");
		System.out.println("Please file the report below");
		repo=sc.next();
		byte b[]=repo.getBytes();
		fw.write(b);
		fw.close();
		/*System.out.println("The report to be filed is as follows");
		fr= new FileInputStream("Report.doc");
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}*/
		fr.close();
		}//try closed
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class Feedback
{
	String repo;
	FileOutputStream fw;
	FileInputStream fr;
	void feed()
	{
		Scanner sc= new Scanner(System.in);
		try{
		fw=new FileOutputStream("Feedback.doc");
		System.out.println("Please file the Feedback below");
		repo=sc.next();
		byte b[]=repo.getBytes();
		fw.write(b);
		fw.close();
		/*System.out.println("The report to be filed is as follows");
		fr= new FileInputStream("Feedback.doc");
		int ch;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}*/
		fr.close();
		}//try closed
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}