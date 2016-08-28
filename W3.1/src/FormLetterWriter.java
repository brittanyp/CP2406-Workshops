/**
 * Created by jc319715 on 15/08/16.
 */
public class FormLetterWriter {
    public static void main (String arg[]){
        displaySalutation("Dat Boi");
        displaySalutation("Pretty ", "Cool");
    }
    public static void displaySalutation(String lastName){
        System.out.println("Dear Ms. Or Ms. " + lastName + " ");
    }

    public static void displaySalutation(String firstName, String lastName){
        System.out.print("Dear " + firstName + lastName + " ");
    }

}
