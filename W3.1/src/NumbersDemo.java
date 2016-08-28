/**
 * Created by jc319715 on 15/08/16.
 */
public class NumbersDemo {
    public static void main (String arg[]){
        int one = 1;
        int two = 2;
        displayTwiceTheNumber(one);
        displayNumberPlusFive(one);
        displayNumberSquared(one);
        displayTwiceTheNumber(two);
        displayNumberPlusFive(two);
        displayNumberSquared(two);

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
}
