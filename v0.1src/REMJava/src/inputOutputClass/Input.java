package inputOutputClass;

import java.io.*;


/**
 *
 * @author onigiri
 */
public final class Input {
    public static String gets() {
        InputStreamReader stdout = new InputStreamReader(System.in);
        BufferedReader main = new BufferedReader(stdout);
        String myString;
        try {
            myString = main.readLine();
        } catch (IOException ex) {
            myString = "Failed to retrieve input.";
        }
        
        return myString;
    }
}
