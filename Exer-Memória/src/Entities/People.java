package Entities;

public class People {
	private String name;
	private int years;
	private double height;
	
	public People(String name, int years, double height) {
		super();
		this.name = name;
		this.years = years;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	
	
}
