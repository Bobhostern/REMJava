package mathClass.colorClass;

import mathClass.colorClass.Interfaces.ColorWithAlphaInterface;

/**
 *
 * @author onigiri
 */
public class ColorWithAlpha extends Color implements ColorWithAlphaInterface {
    
    int alpha;
    
    public ColorWithAlpha (int redVal, int greenVal, int blueVal, int alphaVal) {
        super(redVal, greenVal, blueVal);
        alpha = alphaVal;
        checkAlpha();
    }
    
    public ColorWithAlpha () {
        super();
        alpha = 0;
    }
    
    final boolean checkAlpha() {
        if (alpha > 100) {
            alpha = 100;
        } else if (alpha < 0) {
            alpha = 0;
        }
        return true;
    }
    
    public void changeAlpha(int value) {
        alpha = value;
        checkAlpha();
    }
    
    @Override
    boolean checkColors() {
        if (checkRed() && checkGreen() && checkBlue() && checkAlpha()) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void changeAllValues (int redValue, int greenValue, int blueValue) {
        System.out.println("Use \"changeAllValues\" with 4 values instead.");
    }
    
    public void changeAllValues (int redValue, int greenValue, int blueValue, int alphaValue) {
        changeRed(redValue);
        changeGreen(greenValue);
        changeBlue(blueValue);
        changeAlpha(alphaValue);
    }
    
    @Override
    public String returnAllString() {
        String prefix = ", ";
        return red + prefix + green + prefix + blue + prefix + alpha;
    }
    
     /**
     *
     * @param value
     * @param colorString
     * @deprecated Due to the fact you can use either the individual
     * changing commands or change all of them.
     */
    @Override
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
            case "alpha":
            case "Alpha":
            case "a":
            case "A":
                changeAlpha(value);
            default:
        }
    }
    
    @Override
    public int returnAllInt() {
        String putItTogether = "" + red + green + blue + alpha;
        int putIt = Integer.parseInt(putItTogether);
        return putIt;
    }
    
    public int returnAlphaInt() {
        return alpha;
    }
    
    public String returnAlphaString() {
        return Integer.toString(alpha);
    }
}
