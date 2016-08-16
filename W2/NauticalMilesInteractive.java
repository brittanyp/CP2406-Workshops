import javax.swing.JOptionPane;

/**
 * Created by jc319715 on 8/08/16.
 */
public class NauticalMilesInteractive {
    public static void main(String[] args) {

        final double KILOMETERS = 1.852;
        final double MILES = 1.150779;
        double numNauticalMiles;
        String stringNauticalMiles = JOptionPane.showInputDialog(null, "Enter Nautical Miles", "Conversion",
                JOptionPane.INFORMATION_MESSAGE);
        numNauticalMiles = Double.parseDouble(stringNauticalMiles);
        double conversion = numNauticalMiles * KILOMETERS;
        System.out.print("5 nautical miles are " + conversion + "km");
    }
}