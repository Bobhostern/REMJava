package fileClass;

import fileClass.Interfaces.FileType;
import fileClass.Interfaces.ReadFileInterface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author onigiri
 */
public class ReadFile implements ReadFileInterface, FileType {
     
    private String path;
    
    public ReadFile(String sys_path) {
        path = sys_path;
    }
    
    public String[] OpenFile() throws IOException {
        FileReader jame = new FileReader(path);
        String[] txt;
        try (BufferedReader james = new BufferedReader(jame)) {
            int numberOfLines = readLines();
            txt = new String[numberOfLines];
            for (int i = 0; i < numberOfLines; i++) {
                txt[i] = james.readLine();
            }
        }
        return txt;
    }
    
    private int readLines() throws IOException {
        
        FileReader file = new FileReader(path);
        int numberOfLines;
        try (BufferedReader calcm = new BufferedReader(file)) {
            String line = "";
            numberOfLines = 0;
            while ((line = calcm.readLine()) != null) {
                numberOfLines++;
            }
        }
        
        return numberOfLines;
    }
}
