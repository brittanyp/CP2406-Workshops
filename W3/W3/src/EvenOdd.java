import java.util.Scanner;

/**
 * Created by Brit on 8/22/2016.
 */
public class EvenOdd {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();
        if ((num % 2) == 1){
            System.out.println("Integer is odd");
        }
        else{
            System.out.println("Integer is even");
        }
    }
}
