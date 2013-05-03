package fileClass.langClass;

/**
 *
 * @author onigiri
 */
public class Interfaces {
    interface PythonLangInterface {
        public void set_up(String[] args);
        public void set_up();
        public void setPython33Version(boolean yes);
        public void determinePython();
        public void getFileName();
        public void runPython();
        public void set_upAndRunPython(String[] args);
        public void set_upAndRunPython();
    }
}
