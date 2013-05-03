package fileClass.langClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import utilClass.arrayClass.ArrayMethods;

/**
 *
 * @author onigiri
 */
public class RubyLang {
    String[] callAndArgs;
    String my_of_file;
    
    public void set_up(String[] args) {
        this.getFileName();
        int args_total = args.length;
        List<String> argsForPython = new ArrayList<>();
        argsForPython.addAll(Arrays.asList(args));
        String[] argsList = argsForPython.toArray(new String[argsForPython.size()]);
        String[] params = {"ruby",my_of_file};
        String[] pythX = ArrayMethods.concat(params, argsList);
        callAndArgs = pythX;
    }
    
    public void set_up() {
        this.getFileName();
        String[] params = {"ruby",my_of_file};
        String[] pythX = params;
        callAndArgs = pythX;
    }
    
    public void getFileName() {
        InputStreamReader stdin = new InputStreamReader(System.in);
        BufferedReader cache = new BufferedReader(stdin);
        String path = "";
        String name = "";
        
        try {
            System.out.println("What is the path of the file you wish to open? Type .\n"
                    + "for the current directory, and .. for the parent directory.\n"
                    + "Ex:/usr/bin or C://Users/inel/My Documents");
            path = cache.readLine();
            System.out.println("What is the name of the file?");
            name = cache.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        my_of_file = path + "/" + name;
    }
    
    public void runRuby() {
        String s;
        try {
            Process p = Runtime.getRuntime().exec(callAndArgs);
            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(p.getErrorStream()));
            
            // read the output
            while ((s = stdInput.readLine()) != null) {
                System.out.println(s);
            }

            // read any errors
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }
            
            System.exit(0);

        }

        catch (IOException e) {
            System.out.println("An exception occured.");
            e.printStackTrace();
            System.exit(-1);
        }
    }
    
    public void set_upAndRunRuby(String[] args) {
        this.set_up(args);
        this.runRuby();
    }
    
    public void set_upAndRunRuby() {
        this.set_up();
        this.runRuby();
    }
}
