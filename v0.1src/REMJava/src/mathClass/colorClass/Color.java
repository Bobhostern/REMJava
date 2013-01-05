package mathClass.colorClass;

import mathClass.colorClass.Interfaces.ColorInterface;

/**
 *
 * @author onigiri
 */
public class Color implements ColorInterface {

    int red;
    int blue;
    int green;
    
    public Color(int redVal, int greenVal, int blueVal) {
        red = redVal;
        checkRed();
        blue = blueVal;
        checkBlue();
        green = greenVal;
        checkGreen();
    }
    
    public Color() {
        red = 0;
        green = 0;
        blue = 0;
    }

    final boolean checkRed() {
        if (red > 255) {
            red = 255;
        } else if (red < 0) {
            red = 0;
        }
        return true;
    }

    final boolean checkBlue() {
        if (blue > 255) {
            blue = 255;
        } else if (blue < 0) {
            blue = 0;
        }
        return true;
    }

    final boolean checkGreen() {
        if (green > 255) {
            green = 255;
        } else if (green < 0) {
            green = 0;
        }
        return true;
    }

    boolean checkColors() {
        if (checkRed() && checkGreen() && checkBlue()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void changeRed(int value) {
        red = value;
        checkRed();
    }
    
    public void changeBlue(int value) {
        blue = value;
        checkBlue();
    }
    
    public void changeGreen(int value) {
        green = value;
        checkGreen();
    }
    
    /**
     *
     * @param value
     * @param colorString
     * @deprecated Due to the fact you can use either the individual
     * changing commands or change all of them.
     */
    @Deprecated
    public void changeOneValue(int value, String colorString) {
        switch (colorString) {
            case "red":
            case "Red":
            case "r":
            case "R":
                changeRed(value);
                break;
            case "green":
            case "Green":
            case "g":
            case "G":
                changeGreen(value);
                break;
            case "blue":
            case "Blue":
            case "b":
            case "B":
                changeBlue(value);
                break;
            default:
        }
    }
    
    public void changeAllValues (int redValue, int greenValue, int blueValue) {
        changeRed(redValue);
        changeGreen(greenValue);
        changeBlue(blueValue);
    }
    
    public int returnRedInt() {
        return red;
    }
    
    public String returnRedString() {
        return Integer.toString(red);
    }
    
    public int returnBlueInt() {
        return blue;
    }
    
    public String returnBlueString() {
        return Integer.toString(blue);
    }
    
    public int returnGreenInt() {
        return green;
    }
    
    public String returnGreenString() {
        return Integer.toString(green);
    }
    
    public String returnAllString() {
        String prefix = ", ";
        return red + prefix + green + prefix + blue;
    }
    
    public int returnAllInt() {
        String putItTogether = "" + red + green + blue;
        int putIt = Integer.parseInt(putItTogether);
        return putIt;
    }
}
