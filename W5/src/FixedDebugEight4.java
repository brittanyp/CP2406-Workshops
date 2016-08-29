// Allows user to enter a series of words
// and displays them in reverse order
import javax.swing.*;
public class FixedDebugEight4
{
    public static void main(String[] args)
    {
        int x = 0, y;
        String array[] = new String[100];
        String entry;
        final String STOP = "XXX";
        StringBuffer message = new
                StringBuffer("The words in reverse order are\n");
        entry = JOptionPane.showInputDialog(null, "Enter any word\n" + "Enter " + STOP + " when you want to stop");
        while(!(entry.equals(STOP)))
        {
            array[x] = entry;
            ++x;
            entry = JOptionPane.showInputDialog(null,
                    "Enter another word\n" + "Enter " + STOP + " when you want to stop");
        }
        System.out.println(x);
        y = x - 1;
        System.out.println(y);
        for(y = x - 1; y >= 0; --y)
        {
            System.out.println(x + " " + y);
            message.append(array[y]);
            message.append("\n");
        }
        JOptionPane.showMessageDialog(null, message);
    }
}