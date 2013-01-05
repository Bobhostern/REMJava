package mathClass;

import mathClass.Interfaces.PointInterface;



/**
 *
 * @author onigiri
 */
public class Point implements PointInterface {
    private double x = 0;
    private double y = 0;
    
    /**
     * 
     * @param setVar = What do you want to set this to?
     * @param setXOrY = X or Y. An Either/Or Question.
     */
    public Point (double setVar, String setXOrY) {
        setXOrY = setXOrY.toLowerCase();
        switch (setXOrY) {
            case "x":
                x = setVar;
                break;
            case "y":
                y = setVar;
                break;
            default:
        }
    }
    
    public Point() {
        x = 0;
        y = 0;
    }
    
    public Point (int setVar, String setXOrY) {
        setXOrY = setXOrY.toLowerCase();
        switch (setXOrY) {
            case "x":
                x = setVar;
                break;
            case "y":
                y = setVar;
                break;
            default:
        }
    }
    
    public Point (int setX, int setY) {
        x = setX;
        y = setY;
    }
    
    public Point (double setX, double setY) {
        x = setX;
        y = setY;
    }
    
    public Point (Point point) {
        x = point.returnInternalX();
        y = point.returnInternalY();
    }
    
    public int returnX () {
        return (int) x;
    }
    
    public int returnY () {
        return (int) y;
    }
    
    public double returnInternalX() {
        return x;
    }
    
    public double returnInternalY() {
        return y;
    }
    
    /**
     *
     * @return - returns a String representation in the form of x?y;.
     * @deprecated - use toFormattedString() instead.
     */
    @Override
    @Deprecated
    public String toString() {
        String myString;
        myString = Double.toString(returnInternalX()) + "?" + Double.toString(returnInternalY());
        return myString + ";";
    }
    
    public String toFormattedString() {
        String myString;
        myString = "(" + returnX() + ", " + returnY() + ")";
        return myString;
    }
    
    public String toFormattedInternalString() {
        String myString;
        myString = "(" + returnInternalX() + ", " + returnInternalY() + ")";
        return myString;
    }
    
    /** 
     * Parses the string "toString" method.
     * Quite weird. To get Strings from this method,
     * you must "double-parse" it. Use "parseToUseString"
     * to get a usable String array.
     */
    @SuppressWarnings("deprecation")
    public static String[][] parseToString(Point x) {
        String parseX = x.toString();
        String[] midWay = parseX.split(";");
        String[][] finals = new String[1][1];
        int x_num = 0;
        for (String finalist : midWay) {
            String[] rex = finalist.split("\\?");
            finals[x_num] = rex;
            x_num++;
        }
        return finals;
    }
    
    /**
     * Returns a more friendly String array, instead of an array of String arrays.
     * Use "parseFull" to use both methods at once.
     * @param parsed - Parsed array of arrays from "parseToString"
     * @return 
     */
    public static String[] parseToUseString(String[][] parsed) {
        String[] finals = new String[2];
        int x_num = 0;
        for (String[] parse : parsed) {
            for (String toParse : parse) {
                finals[x_num++] = toParse;
            }
        }
        return finals;
    }
    
    /**
     * Legacy name for "parseToUseString".
     * @param parsed
     * @return 
     */
    public static String[] parseXN(String[][] parsed) {
        String[] argigion = Point.parseToUseString(parsed);
        return argigion;
    }
    
    public static String[] parseFull(Point x) {
        String[][] visavis = Point.parseToString(x);
        String[] visaCard = Point.parseToUseString(visavis);
        return visaCard;
    }
    
    public static String[] parseFullAndFormat(Point x) {
        String[] toFormat = Point.parseFull(x);
        boolean palabra = false;
        String prefix = "";
        int x_num = 0;
        for (String cat : toFormat) {
            if (!palabra) {
               prefix = "X: " ;
            } else if (palabra) {
                prefix = "Y: ";
            }
            
            cat = prefix + cat;
            
            if (!palabra) {
                palabra = true;
            } else if (palabra) {
                palabra = false;
            }
            
            toFormat[x_num++] = cat;
        }
        
        return toFormat;
    }
    
    public void changeX(int x_) {
        x = x_;
    }
    
    public void changeY(int y_) {
        y = y_;
    }
}
