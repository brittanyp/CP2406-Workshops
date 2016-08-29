// Makes String comparisons
public class FixedDebugSeven1
{
    public static void main(String[] args)
    {
        String name1 = "Roger";
        String name2 = "Roger";
        String name3 = "Stacy";

        if(name1.compareTo(name2)==0)
            System.out.println(name1 + " and " + name2 +
                    " are the same");
        if(name1.compareTo(name3)==0)
            System.out.println(name1 + " and " + name3 +
                    " are the same");
        if(name1.compareTo("roger")==0)
            System.out.println(name1 + " and 'roger' are the same");
        if(name1.compareTo("Roger")==0)
            System.out.println(name1 + " and 'Roger' are the same");
    }
}