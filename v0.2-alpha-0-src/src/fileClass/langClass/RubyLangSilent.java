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
public class RubyLangSilent {
    String[] callAndArgs;
    String my_of_file;
    String path;
    String name;
    
    public RubyLangSilent(String path_, String name_) {
        path = path_;
        name = name_;
        my_of_file = path + "/" + name;
    }
    
    public void set_up(String[] args) {
        int args_total = args.length;
        List<String> argsForPython = new ArrayList<>();
        argsForPython.addAll(Arrays.asList(args));
        String[] argsList = argsForPython.toArray(new String[argsForPython.size()]);
        String[] params = {"ruby",my_of_file};
        String[] pythX = ArrayMethods.concat(params, argsList);
        callAndArgs = pythX;
    }
    
    public void set_up() {
        String[] params = {"ruby",my_of_file};
        String[] pythX = params;
        callAndArgs = pythX;
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
