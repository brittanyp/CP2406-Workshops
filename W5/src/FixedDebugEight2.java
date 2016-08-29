// Sum and average an array of integers
public class FixedDebugEight2
{
    public static void main(String args[])
    {
        int[] someNums = {1, 2, 3, 4};
        int total = 0;
        int x;
        for(x = 0; x < someNums.length; ++x)
            total = someNums[x] + total;
        System.out.println("Sum is " + total);
        System.out.println("Average is " + total * 1.0 /someNums.length);
    }
}