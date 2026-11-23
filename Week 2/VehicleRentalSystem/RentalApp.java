package week2.VehicleRentalSystem;

import java.util.ArrayList;
import java.util.Scanner;



public class RentalApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numVehicles = getIntAnswer("Enter number of vehicles: ", "Invalid Answer, Please enter an Integer", sc);
			Vehicle [] Vehicles = new Vehicle[numVehicles];
			for(int i = 0 ; i < numVehicles ; i++) {
				int type = getIntAnswer("Enter Type (1-Car, 2-Bike): ", "Invalid Answer, Please enter an Integer", sc);
				String vehicleNumber, model;
				int rate, days;
				double insurance;
				sc.nextLine();
				switch(type) {
					case 1:
						vehicleNumber = getStrAnswer("Enter Vehicle Number: ", sc);
						model = getStrAnswer("Enter Model: ", sc);
						rate = getIntAnswer("Enter Rate: ", "Invalid Answer, Please enter an Integer", sc);
						days = getIntAnswer("Enter Days: ", "Invalid Answer, Please enter an Integer", sc);
						insurance = getDoubleAnswer("Enter Insurance per day: ", "Invalid Answer, Please enter an Integer", sc);
						Car car = new Car(vehicleNumber, model, rate, days, insurance);
						Vehicles[i] = car;
						break;
					case 2:
					    vehicleNumber = getStrAnswer("Enter Vehicle Number: ", sc);
					    model = getStrAnswer("Enter Model: ", sc);
					    rate = getIntAnswer("Enter Rate: ", "Invalid Answer, Please enter an Integer", sc);
					    days = getIntAnswer("Enter Days: ", "Invalid Answer, Please enter an Integer", sc);

					    Bike bike = new Bike(vehicleNumber, model, rate, days);
					    Vehicles[i] = bike;
					    break;

					default:
						System.out.println("Error");
				}
			}
			
			for(int i = 0 ; i < numVehicles ; i++) {
				System.out.println(Vehicles[i]);
			}
			
			sc.close();
				
		}
	
	
	public static int getIntAnswer(String str, String str2, Scanner sc) {
		int n = -1;
		while(true) {
			try {
				System.out.println(str);
				n = sc.nextInt();
				break;
			} catch (Exception E) {
				System.out.println(str2);
			}
		}
		return n;
		
	}
	
	public static String getStrAnswer(String str, Scanner sc) {
		String ret;
		System.out.println(str);
		ret = sc.nextLine();
		return ret;
	}
	
	public static double getDoubleAnswer(String str, String str2, Scanner sc) {
		double n = -1;
		while(true) {
			try {
				System.out.println(str);
				n = sc.nextDouble();
				break;
			} catch (Exception E) {
				System.out.println(str2);
			}
		}
		return n;
		
	}
	
	

}
