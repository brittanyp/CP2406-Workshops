/**
 * Created by jc319715 on 29/08/16.
 */
public class ArrayMethodDemo {
    public static void main(String[] args){
        int arrayofNum[] = {1,2,3,4};
        integerDisplay(arrayofNum);
        integerDisplayReverse(arrayofNum);
        integerAboveLimit(arrayofNum, 5);
        arraySum(arrayofNum);
        integerDisplayAboveAverage(arrayofNum);


    }
    public static void integerDisplay(int array[]){
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void integerDisplayReverse(int array[]){
        for (int i = array.length - 1; i>=0;i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void integerAboveLimit(int array[], int limit) {
        for (int i = 0; i < array.length; i++)
            if(array[i] < limit)
                System.out.print(array[i] + " ");
        System.out.println();
    }
    public static void arraySum(int array[]){
        int total = 0;
        for (int i = 0; i < array.length; i++)
            total = array[i] + total;
        System.out.println(total);
    }
    public static void integerDisplayAboveAverage(int array[]){
        int total = 0;
        for (int i = 0; i < array.length; i++)
            total = array[i] + total;
        int average = total / array.length;
        //System.out.println(average);
        for (int i = 0; i < array.length; i++)
            if (array[i] > average)
                System.out.print(array[i] + " ");
    }
}
