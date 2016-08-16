/**
 * Created by jc319715 on 8/08/16.
 */
public class NauticalMiles {
    public static void main(String[] args) {

        final double KILOMETERS = 1.852;
        final double MILES = 1.150779;
        double numNauticalMiles = 5;
        double conversion = numNauticalMiles * KILOMETERS;
        System.out.print("5 nautical miles are " + conversion + "km");
    }
}