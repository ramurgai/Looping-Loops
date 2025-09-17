import java.util.Scanner;

public class RightStairs {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    String userBlock = input.nextLine();
    System.out.print("Enter the desired size of your staircase: ");
    int userNum = input.nextInt();
    for (int i = userNum; i > 0; i--){
        System.out.println(" ".repeat(i - 1) + userBlock.repeat(userNum - i + 1));
    }
  }
}
