import java.util.Scanner;

public class CheckingBudgetOfMobile {

	public static void main(String[] args) {
		System.out.println("enter your mobile budget");
		Scanner scan = new Scanner(System.in);
		int budget = scan.nextInt();
		if (budget <= 13000) {
			System.out.println("Mobile chosen is within the budget");
		} 
		else {
			System.out.println("Mobile chosen is beyond the budget");
		}
	}

}
