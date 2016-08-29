/**
 * Created by Brit on 8/29/2016.
 */
public class CountWords {
    public static void main(String[] args){
        //Counts words seperated by ' ', '.', ':', '?', '!', '-'
        int x;
        int count = 0;
        //char[] specialCharArray = {' ', '.', ':', '?', '!', '-'};
        String str = "Hello this is a sentance with words. ";
        boolean lastCharSeperator = false;
        int length = str.length();
        length = str.length();
        for(x = 0; x < length; x++)
        {
            if(str.charAt(x) == ' ' || str.charAt(x) == '.' || str.charAt(x) == ';' || str.charAt(x) == ',' ||
                    str.charAt(x) == '!' || str.charAt(x) == '-')
            {
                count = count + 1;
                if(lastCharSeperator)
                    count = count - 1;
                lastCharSeperator = true;
            }
            else
                lastCharSeperator = false;
        }
        if(!lastCharSeperator)
            count = count + 1;

        System.out.println("There are " + count + " words in the string");
    }
}