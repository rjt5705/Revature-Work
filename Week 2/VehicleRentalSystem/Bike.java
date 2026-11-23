package week2.VehicleRentalSystem;

public class Bike extends Vehicle {
	
	protected final double DISCOUNT_RATE = 0.1;
	
	public Bike(String vehicleNumber, String model, double ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}
	

	@Override
	public double calculateRent() {
		return super.calculateRent() * 0.9;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " | $" + calculateRent();
	}
	
	@Override
	public void displayDetails() {
		System.out.println(this);
	}
}
