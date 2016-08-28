import java.util.Scanner;

/**
 * Created by jc319715 on 22/08/16.
 */
public class Inbetween {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Integer 1:");
        int num1 = input.nextInt();
        System.out.println("Integer 2:");
        int num2 = input.nextInt();

        if (num1 > num2) {
            for (int val = num2 + 1; val < num1; val++) {
                System.out.println(val);
            }
        } else if (num2 > num1) {
                for (int val = num1 + 1; val < num2; val++) {
                    System.out.println(val);
                }
            } else {
                if (num2 == num1) {
                    System.out.println("No integers inbetween");
                }
            }
        }
    }
