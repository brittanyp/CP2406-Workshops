import java.util.Scanner;

/**
 * Created by jc319715 on 22/08/16.
 */
public class EvenEntryLoop {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter even number, or sentinel value 999 to stop");
        int userInt = input.nextInt();
        while (userInt != 999) {
            if (userInt % 2 == 0) {
                System.out.println("Good job!");
                System.out.println("Enter even number, or sentinel value 999 to stop");
                userInt = input.nextInt();
            } else {
                while (userInt % 2 == 1) {
                    if (userInt == 999){
                        break;
                    }
                    System.out.println("Nope try again");
                    System.out.println("Enter even number, or sentinel value 999 to stop");
                    userInt = input.nextInt();
                }
            }
        }

        System.out.println("Good, go.");
    }
}

