package week2.VehicleRentalSystem;

public class Car extends Vehicle {
	protected double insuranceCharge;
	
	public Car(String vehicleNumber, String model, double ratePerDay, int days, double insuranceCharge) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insuranceCharge = insuranceCharge;
	}
	
	@Override
	public double calculateRent() {
		return super.calculateRent() + insuranceCharge * super.days;
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
