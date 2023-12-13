import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AllApplet" width=400 height=500>
</applet>
*/


public class AllApplet extends Applet implements ItemListener,ActionListener
{

	String msg="";
	Checkbox LL,DL,two,three,four,heavy;
	CheckboxGroup details;
	Choice rto,city;
	TextField name;

	public void init()
	{
		Label lab1 = new Label("Welcome to Parivahan Sewa");
		add(lab1);
		
		//TextField
		Label lab=new Label("\n\n\nEnter your name as per Adhar Card : ",Label.LEFT);
		name=new TextField(15);
		add(lab);
		add(name);
		//register to receive action events
		name.addActionListener(this);


		//Checkbox
		Label lab2 = new Label("\nSelect which type of Liscence you want",Label.RIGHT);
		add(lab2);
		LL=new Checkbox("\nLearning Liscence");
		DL=new Checkbox("Driving Liscence");
		add(LL);
		add(DL);
		LL.addItemListener(this);
		DL.addItemListener(this);

		//CheckboxGroup
		Label lab3 = new Label("\nSelect your choice of liscence");
		add(lab3);
		details = new CheckboxGroup();
		two= new Checkbox("\nTwo wheeler Liscence",details,false);
		three= new Checkbox("Three wheeler Liscence",details,false);
		four= new Checkbox("Four wheeler Liscence",details,false);
		heavy= new Checkbox("Heavy Vehicle Liscence",details,false);
		add(two);
		add(three);
		add(four);
		add(heavy);
		two.addItemListener(this);
		three.addItemListener(this);
		four.addItemListener(this);
		heavy.addItemListener(this);

		//Dropdown list
		rto= new Choice();
		city= new Choice();
		//Adding new items in list;
		Label lab4 = new Label("\nSelect your City");
		add(lab4);
		city.add("Pune");
		city.add("Mumbai");
		city.add("Nashik");
		city.add("Kolhapur");
		city.add("Solapur");
		Label lab5 = new Label("\nSelect your RTO according to City");
		add(lab5);
		rto.add("Shivaji Nagar RTO,Pune");
		rto.add("Andheri RTO,Mumbai");
		rto.add("Vaishnav Road RTO,Nashik");
		rto.add("Bawda RTO,Kolhapur");
		rto.add("Saat Rasta,Solapur");

		//adding choice list window
		add(city);
		add(rto);

		//register to receive item event
		city.addItemListener(this);
		rto.addItemListener(this);

		//TextArea
		Label lab6 = new Label("\nAny identification marks/scar/birthmarks");
		add(lab6);
		TextArea text = new TextArea(2,8);
		add(text);

	}

	public void actionPerformed(ActionEvent ae)
	{
	repaint();
	}

	public void itemStateChanged(ItemEvent ie)
	{
		repaint();

	}

	public void paint(Graphics g)
	{
		g.drawString("Name: "+name.getText(),6,300);

		// message of checkbox;
		msg="You have selected : ";
		g.drawString(msg,6,350);

		msg="Learning Liscence : "+LL.getState();
		g.drawString(msg,6,370);
		
		msg="Driving Liscence : "+DL.getState();
		g.drawString(msg,6,390);


		//message of radio button;
		msg="As per choice You want ";
	//msg+=details.getSelectedCheckbox().getLabel();
		g.drawString(msg,6,430);

		
		//message of dropdown list
		msg="The City is : ";
		msg+=city.getSelectedItem();
		g.drawString(msg,6,450);

		msg="RTO nearest to you is : ";
		msg+=rto.getSelectedItem();
		g.drawString(msg,6,480);


	}
}