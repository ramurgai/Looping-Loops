import java.util.Scanner;

public class SentinelSum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userNum = 1;
    int total = 0;
    while (userNum != 0){
        System.out.print("Enter your the number you want to add (type 0 to exit): ");
        userNum = input.nextInt();
        total += userNum;
    }
    System.out.println("Your total is: " + total);
    input.close();
  }
}
