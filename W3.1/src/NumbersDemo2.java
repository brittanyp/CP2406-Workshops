import java.util.Scanner;

/**
 * Created by jc319715 on 15/08/16.
 */
public class NumbersDemo2 {
    public static void main (String arg[]){
        int one, two;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        one = input.nextInt();
        System.out.print("Enter number: ");
        two = input.nextInt();
        displayTwiceTheNumber(one, two);
        displayNumberPlusFive(one, two);
        displayNumberSquared(one, two);

    }
    public static void displayTwiceTheNumber(int a){
        System.out.println("2 * " + a + " = " + (a*2));
    }

    public static void displayNumberPlusFive(int a){
        System.out.println("5 + " + a + " = " + (a+5));
    }

    public static void displayNumberSquared(int a){
        System.out.println(a + "^2 = " + (a^2));
    }

    public static void displayTwiceTheNumber(int a, int b){
        System.out.println("2 * " + a + " = " + (a*2));
        System.out.println("2 * " + b + " = " + (b*2));
    }

    public static void displayNumberPlusFive(int a, int b){
        System.out.println("5 + " + a + " = " + (a+5));
        System.out.println("5 + " + b + " = " + (b+5));
    }

    public static void displayNumberSquared(int a, int b){
        System.out.println(a + "^2 = " + Math.pow(a, 2));
        System.out.println(b + "^2 = " + (b^2));
    }
}
