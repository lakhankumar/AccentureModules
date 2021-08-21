import java.util.Scanner;

public class ElectricityBillCalculation {

	public static void main(String[] args) {
		float charge = 0, chargePerUnit = 0;
		System.out.println("enter units");
		Scanner scan = new Scanner(System.in);
		int units = scan.nextInt();
		if (units <= 20) {
			System.out.println("No charge");
		} 
		else if (units>20 && units<100) {
			chargePerUnit=(float) 3.50;
			charge=chargePerUnit*units;
			System.out.println(charge);
		}
		else if (units>=100) {
			chargePerUnit=(float) 5.00;
			charge=chargePerUnit*units;
			System.out.println(charge);
		}
		}
	}


