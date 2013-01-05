package fileClass;

import fileClass.Interfaces.WriteFileInterface;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author onigiri
 */
public class WriteFile implements WriteFileInterface {
    
    private String path;
    private boolean append_to_file = false;
    
    public WriteFile(String file_path) {
        path = file_path;
    }
    
    public WriteFile( String file_path , boolean append_value ) {
        path = file_path;
        append_to_file = append_value;
    }
    
    public void writeToFile( String textLine ) throws IOException {
        FileWriter write = new FileWriter( path, append_to_file );
        try (PrintWriter print_line = new PrintWriter( write )) {
            print_line.printf("%s" + "%n", textLine);
        }
    }
}
