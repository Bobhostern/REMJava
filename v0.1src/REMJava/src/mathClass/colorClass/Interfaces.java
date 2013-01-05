package mathClass.colorClass;

/**
 *
 * @author onigiri
 */
public class Interfaces {
    interface ColorInterface {
        public void changeRed(int value);
        public void changeBlue(int value);
        public void changeGreen(int value);
        public void changeOneValue(int value, String colorString);
        public void changeAllValues (int redValue, int greenValue, int blueValue);
        public int returnRedInt();
        public String returnRedString();
        public int returnBlueInt();
        public String returnBlueString();
        public int returnGreenInt();
        public String returnGreenString();
        public String returnAllString();
        public int returnAllInt();
    }
    
    interface ColorWithAlphaInterface extends ColorInterface {
        public int returnAlphaInt();
        public String returnAlphaString();
        public void changeAlpha(int value);
        public void changeAllValues (int redValue, int greenValue, int blueValue, int alphaValue);
    }
}
