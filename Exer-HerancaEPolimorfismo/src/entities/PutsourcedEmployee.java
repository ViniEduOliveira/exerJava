package entities;

public final class PutsourcedEmployee  extends Employee{
	private Double additionalCharge;

	public PutsourcedEmployee() {
		super();
	}
	
	public PutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double Payment() {
		return super.Payment() + additionalCharge * 1.1;
	}
	
	
}
