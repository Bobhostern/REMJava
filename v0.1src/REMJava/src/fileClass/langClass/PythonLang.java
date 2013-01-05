package fileClass.langClass;

import fileClass.langClass.Interfaces.PythonLangInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import utilClass.arrayClass.ArrayMethods;

/**
 * Requires that you already have python and/or python3.3 installed
 * Untested on Windows
 * @author onigiri
 */
public class PythonLang implements PythonLangInterface{
    String[] callAndArgs;
    int pythonver = 0;
    String python = "";
    String my_of_file;
    
    public void set_up(String[] args) {
        this.getFileName();
        int args_total = args.length;
        List<String> argsForPython = new ArrayList<>();
        argsForPython.addAll(Arrays.asList(args));
        this.determinePython();
        String[] argsList = argsForPython.toArray(new String[argsForPython.size()]);
        String[] params = {python,my_of_file};
        String[] pythX = ArrayMethods.concat(params, argsList);
        callAndArgs = pythX;
    }
    
    public void set_up() {
        this.getFileName();
        this.determinePython();
        String[] params = {python,my_of_file};
        String[] pythX = params;
        callAndArgs = pythX;
    }
    
    public void setPython33Version(boolean yes) {
        if (yes == true) {
            pythonver = 1;
        } else if (yes == false) {
            pythonver = 0;
        }
    }
    
    public void determinePython() {
        if (pythonver == 0) {
            python = "python";
        } else if (pythonver == 1) {
            python = "python3.3";
        }
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
    
    public void runPython() {
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
    
    public void set_upAndRunPython(String[] args) {
        this.set_up(args);
        this.runPython();
    }
    
    public void set_upAndRunPython() {
        this.set_up();
        this.runPython();
    }
}
