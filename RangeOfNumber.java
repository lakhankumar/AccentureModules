import java.util.Scanner;

public class RangeOfNumber {

	public static void main(String[] args) {
		System.out.println("enter your number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num>=0 && num<=100) {
			System.out.println("Range of the number " + num + " is 0 to 100");
		}
		else if (num >= 101 && num <= 200) {
			System.out.println("Range of the number " + num + " is 101 to 200");
		}
		else if (num >= 201 && num <= 300) {
			System.out.println("Range of the number " + num + " is 201 to 300");
		}
		else
			System.out.println("Entered number" + num+ " is not in the expected range");
	}

}
