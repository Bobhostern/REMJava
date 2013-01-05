package fileClass;

import java.io.IOException;

/**
 *
 * @author onigiri
 */
public class Interfaces {
    interface WriteFileInterface {
        public void writeToFile(String textLine) throws IOException;
    }
    interface ReadFileInterface {
        public String[] OpenFile() throws IOException;
    }
}
