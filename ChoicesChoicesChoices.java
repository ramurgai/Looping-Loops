import java.util.Scanner;


public class ChoicesChoicesChoices {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userChoice = 0;
    do{
        System.out.print("Choose one of the options, 1: Print a random number 1-10, 2: do nothing, 3: exit:  ");
        userChoice = input.nextInt();
        switch (userChoice){
            case 1:
                System.out.println((int) ((Math.random() * 10) + 1));
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("You have successfully exited.");
                break;
        }
    } while(userChoice != 3);
  }
}
