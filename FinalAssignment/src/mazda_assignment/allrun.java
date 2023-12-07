package mazda_assignment;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class allrun {

	static LinkedList<employee> emps = new LinkedList<employee>();
	static ArrayList<gadget> gadgets = new ArrayList<gadget>();
	static LinkedList<cloth> clothes = new LinkedList<cloth>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		employee emp = new employee (1,"Gunjan",gender.female,3000,department.IT,5.5,60);
		
		employee emp1 = new employee (2,"Narendra",gender.male,9999,department.HR,5.6,70);
		employee emp2 = new employee (3,"NRathore",gender.male,8888,department.Account,5.7,80);
		employee emp3 = new employee (4,"RathoreN",gender.male,2000,department.IT,5.9,89);
		employee emp4 = new employee (5,"GSharma",gender.female,99999,department.IT,5.4,55);
		
		emps.add(emp);
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		gadget gget1 = new gadget("Tablate",11000,1,2,1,"Electronics");
		gadget gget2 = new gadget("Mobile",10200,1,3,1,"Electronics");
		gadget gget3 = new gadget("bulb",1000,1,4,1,"Electrical");
		gadget gget4 = new gadget("cubicsquar",10000,1,1,1,"machenical");
		gadget gget5 = new gadget("glucomter",10022,1,5,1,"Bialogical");
		
		gadgets.add(gget1);
		gadgets.add(gget2);
		gadgets.add(gget3);
		gadgets.add(gget4);
		gadgets.add(gget5);
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		cloth cloth1 = new cloth("Silk",100,1,1,"Sari");
		cloth cloth2 = new cloth("cotton",1000,1,2,"jacket");
		cloth cloth3 = new cloth("net",500,1,3,"suite");
		cloth cloth4 = new cloth("ambrowdies",600,1,4,"shirt");
		cloth cloth5 = new cloth("khadi",3000,1,5,"coat");
		
		clothes.add(cloth1);
		clothes.add(cloth2);
		clothes.add(cloth3);
		clothes.add(cloth4);
		clothes.add(cloth5);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("Assignment Starts");
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("a) Run the methods exercise(), work() Start");
		methodA();
		System.out.println("a) Run the methods exercise(), work() End");
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("b) Print the details of male employee, call all the method and show the result on the console. Start");
		methodB();
		System.out.println("b) Print the details of male employee, call all the method and show the result on the console. End");
		
		System.out.println(" ");
		System.out.println(" ");
		
		
		System.out.println("d) Print the details of female employees. Start");
		methodD();
		System.out.println("d) Print the details of female employees. End");
		
		System.out.println("c)	Print the no of employees whose salary is greater than 4000. Start");
		methodC();
		System.out.println("c)	Print the no of employees whose salary is greater than 4000. End");
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("3. Show the details(id,category,name,quantity,cost) of clothes which are greater than 500. start");
		methodcloth();
		System.out.println("3. Show the details(id,category,name,quantity,cost) of clothes which are greater than 500.. End");
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("4. Show the id, cost and quantity of gadgets which have warranty_period less than 2 years. start");
		methodgadget();
		System.out.println("4. Show the id, cost and quantity of gadgets which have warranty_period less than 2 years. End");
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("Assignment Ends");
	}
	
	
	public static void methodgadget()
	{
		List<gadget> gadgetWarr = gadgets.stream().filter(e-> e.getWarranty_period()<2).collect(Collectors.toList());
		System.out.println("4. Show the id, cost and quantity of gadgets which have warranty_period less than 2 years.");
		for (gadget Igadget : gadgetWarr) {

			System.out.println(" ");
	
			System.out.println("gadget's id is " + Igadget.id);
			System.out.println("gadget's warranty period is " + Igadget.id);
			System.out.println("gadget's category is " + Igadget.category);
			System.out.println("gadget's name is " + Igadget.getName());
			System.out.println("gadget's qunatity is " + Igadget.getQuantity());
			System.out.println("gadget's cost is " + Igadget.getCost());
			System.out.println(" ");			
		}
	}
	
	public static void methodcloth()
	{
		List<cloth> clothCost = clothes.stream().filter(e->e.getCost()>500).collect(Collectors.toList());
		System.out.println("3. Show the details(id,category,name,quantity,cost) of clothes which are greater than 500.");
		for (cloth Icloth : clothCost) {

			System.out.println(" ");
	
			System.out.println("Cloth's id is " + Icloth.id);
			System.out.println("Cloth's category is " + Icloth.category);
			System.out.println("Cloth's name is " + Icloth.getName());
			System.out.println("Cloth's qunatity is " + Icloth.getQuantity());
			System.out.println("Cloth's cost is " + Icloth.getCost());
			System.out.println(" ");			
		}
	}
		
	public static void methodD()
	{
		List<employee> maleEmp = emps.stream().filter(e->e.getEmpgender().equals(gender.female)).collect(Collectors.toList());
	
		for (employee Iemp : maleEmp) {
			System.out.println(" ");

			Iemp.work();
			Iemp.exercise();
			System.out.println("My name is " + Iemp.getName());
			System.out.println("I am " + Iemp.getEmpgender());
			System.out.println("My salary is " + Iemp.getSalary());
			System.out.println("I am working in department " + Iemp.getDep());
			System.out.println(" ");			
		}
	}
	
	public static void methodC()
	{
		List<employee> maleEmp = emps.stream().filter(e->e.getSalary()>4000).collect(Collectors.toList());
		System.out.println("Number of Employees whose salary greater than " + maleEmp.size());
		for (employee Iemp : maleEmp) {
			System.out.println(" ");

			Iemp.work();
			Iemp.exercise();
			System.out.println("My name is " + Iemp.getName());
			System.out.println("I am " + Iemp.getEmpgender());
			System.out.println("My salary is " + Iemp.getSalary());
			System.out.println("I am working in department " + Iemp.getDep());
			System.out.println(" ");			
		}
	}
	
	public static void methodB()
	{
		List<employee> maleEmp = emps.stream().filter(e->e.getEmpgender().equals(gender.male)).collect(Collectors.toList());
	
		for (employee Iemp : maleEmp) {
			System.out.println(" ");
			System.out.println("Employee's name "+ Iemp.getName());
			System.out.println("Employee's gender "+ Iemp.getEmpgender());
			System.out.println("Employee's salary "+ Iemp.getSalary());
			System.out.println("Employee's department "+ Iemp.getDep());
			System.out.println("Employee's height "+ Iemp.getHeight());
			System.out.println("Employee's weight "+ Iemp.getWeight());
			Iemp.work();
			Iemp.exercise();
			System.out.println(" ");
		}
	}
	
	public static void methodA()
	{
		for (human Iemp : emps) {
			System.out.println(" ");
			Iemp.work();
			Iemp.exercise();
			System.out.println(" ");
		}
	}
}
