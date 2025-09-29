import java.util.Scanner;
import java.time.LocalTime;

public class ChoicesChoicesChoices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoice = 0;
        do{
            System.out.print("Choose one of the options, 1: Say hello, 2: display current local time, 3: exit: ");
            userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println(LocalTime.now());
                    break;
                case 3:
                    System.out.println("You have successfully exited.");
                    break;
            }
        } while(userChoice != 3);
    }
}
