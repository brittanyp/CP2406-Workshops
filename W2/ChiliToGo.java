import javax.swing.*;

/**
 * Created by jc319715 on 8/08/16.
 */
public class ChiliToGo {
    public static void main(String[] args) {
        final double ADULTMEAL = 7;
        final double CHILDMEAL = 4;
        String strAdultAmt = JOptionPane.showInputDialog(null, "Enter Adult meal amt", "Adult Meal",
                JOptionPane.INFORMATION_MESSAGE);
        String strChildAmt = JOptionPane.showInputDialog(null, "Enter Child meal amt", "Child Meal",
                JOptionPane.INFORMATION_MESSAGE);
        double adultAmt = Double.parseDouble(strAdultAmt);
        double childAmt = Double.parseDouble(strChildAmt);
        double total = adultAmt * ADULTMEAL + childAmt * CHILDMEAL;
        System.out.print("Your total is " + total + ".\n For " + adultAmt + " adult meals and " + childAmt + " chilren meals.");

    }
}
