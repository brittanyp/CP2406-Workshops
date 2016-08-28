import java.util.Scanner;

/**
 * Created by Brit on 8/22/2016.
 */
public class AnD {
    public static void main(String arg[]){
        int maxNum, minNum, midNum;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1 ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 ");
        int num2 = input.nextInt();
        System.out.print("Enter number 3 ");
        int num3 = input.nextInt();

        // Incase numbers are the same but like thats debugging and I cbf
        minNum = 102;
        midNum = 102;
        maxNum = 102;

        if ((num1 > num2)&&(num1 > num3)){
            maxNum = num1;
            if (num2 > num3){
                midNum = num2;
                minNum = num3;}
            else
                if (num2 < num3){
                    midNum = num3;
                    minNum = num2;
                }
        }
        else {
            if ((num1 < num2) && (num1 < num3)){
                if (num2 > num3){
                    midNum = num3;
                    minNum = num2;
                }
                else{
                    if (num3 > num3){
                        midNum = num2;
                        minNum = num3;
                    }
                }
            }
        }
        System.out.println("Min: " + minNum + " Mid: " + midNum + " Max: " + maxNum );
    }
}