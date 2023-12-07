package mazda_assignment;

import java.util.Date;

public class product {

	public int id;
	public String category;

}

class cloth extends product {
	private String Name;
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public double getQuantity() {
		return Quantity;
	}

	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

	private double Cost;
	private double Quantity;
	
	public cloth(String Name,double Cost,double quantity,int id,String category) {
		super.id = id;
		super.category = category;
		this.Name = Name;
		this.Cost = Cost;
		this.Quantity = quantity;
	}
	
}

class gadget extends product {
	private String Name;
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getCost() {
		return Cost;
	}

	public void setCost(double cost) {
		Cost = cost;
	}

	public double getQuantity() {
		return Quantity;
	}

	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

	public int getWarranty_period() {
		return warranty_period;
	}

	public void setWarranty_period(int warranty_period) {
		this.warranty_period = warranty_period;
	}

	private double Cost;
	private double Quantity;
	private int warranty_period;
	
	//public gadget(String Name,double Cost,double quantity,Date warranty_period,int id,String category) {
		public gadget(String Name,double Cost,double quantity,int warranty_period,int id,String category) {
		super.id = id;
		super.category = category;
		this.Name = Name;
		this.Cost = Cost;
		this.Quantity = quantity;
		this.warranty_period = warranty_period;
	}
}


