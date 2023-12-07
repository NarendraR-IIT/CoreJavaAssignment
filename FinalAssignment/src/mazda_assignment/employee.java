package mazda_assignment;

enum gender
{
	male,
	female,
	other
}

enum department
{
	IT,
	Account,
	HR
}

public class employee implements human {
	
	
	public employee(int id, String name, gender gen,double sal,department dep,double height,double weight){
		this.id = id;
		this.name = name;
		this.empgender = gen;
		this.salary = sal;
		this.dep = dep;
		this.height = height;
		this.weight = weight;
	}

	
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am eating! " + getName());
	}
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("I am working! " + getName());
		System.out.println("My height is! " + getHeight());
		System.out.println("My weight is! " + getWeight());
		
	}
	@Override
	public void exercise() {
		// TODO Auto-generated method stub
		System.out.println("I am doing exercise! " + getName());
	}
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public gender getEmpgender() {
		return empgender;
	}
	public void setEmpgender(gender empgender) {
		this.empgender = empgender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public department getDep() {
		return dep;
	}
	public void setDep(department dep) {
		this.dep = dep;
	}
	private String name;
	private gender empgender;
	private double salary;
	private department dep;
	
	private double height;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}
	private double weight;
	
	
}
