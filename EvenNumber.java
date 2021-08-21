import java.util.Scanner;

public class EvenNumber{
    
    public static void main(String[] args){
        System.out.println("Enter your Number");
       Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 == 0) {
            System.out.println(num+ " is an even number");
        }
       
    }
    
}