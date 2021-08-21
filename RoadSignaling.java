import java.util.Scanner;

public class RoadSignaling {

	public static void main(String[] args) {
		System.out.println("enter traffic light color");
		Scanner scan = new Scanner(System.in);
		String color = scan.nextLine();
		switch (color) {
		case "red":
			System.out.println("stop");
			break;
		case "green":
			System.out.println("go");
			break;
		case "yellow":
			System.out.println("proceed with caution");
			break;
		default:
			System.out.println("prepare to go");
		}
	}

}
