package mathClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mathClass.Interfaces.PolygonInterface;

/**
 *
 * @author onigiri
 */
public class Polygon implements PolygonInterface {
    private int numberOfSides = 0;
    private List<Point> pointList = new ArrayList<>();
    
    public Polygon (List<Point> points) {
        numberOfSides = points.toArray().length;
        pointList = points;
    }
    
    public Polygon (Point[] points) {
        numberOfSides = points.length;
        pointList.addAll(Arrays.asList(points));
    }
    
    public Polygon (Polygon polygon) {
        numberOfSides = polygon.returnNumberOfSides();
        pointList = polygon.returnPoints();
    }
    
    public int returnNumberOfSides () {
        if (checkIfPolygon() == 1) {
          return numberOfSides;  
        } else {
            return 0;
        }
    }
    
    public List<Point> returnPoints () {
        if (checkIfPolygon() == 1) {
           return pointList; 
        } else {
            return new ArrayList<>();
        }
    }
    
    /**
     * 
     * @return - returns 1 if it is a polygon, and 0 if it isn't.
     */
    public int checkIfPolygon() {
        if (numberOfSides >= 3) {
            return 1;
        } else {
            return 0;
        }
    }
    
    /**
     *
     * @return - returns a String representation of the object
     */
    @Override
    public String toString() {
       String myString = "";
       if (checkIfPolygon() == 1) {
         for (Point myPoint : pointList) {
           myString += myPoint.toFormattedString();
         }  
       } else {
           myString = "This is not a polygon.";
       }
       
       return myString;
    }
    
    /**
     *
     * @return - uses to deprecated toString to create a string
     */
    @Override
    @SuppressWarnings("deprecation")
    public String toPureString() {
        String myString = "";
        if (checkIfPolygon() == 1) {
            for (Point myPoint : pointList) {
                myString += myPoint.toString();
            }
        } else {
            myString = "This is not a polygon.";
        }
        
        return myString;
    }
    
    public String toInternalString() {
       String myString = "";
       if (checkIfPolygon() == 1) {
         for (Point myPoint : pointList) {
           myString += myPoint.toFormattedInternalString();
         }  
       } else {
           myString = "This is not a polygon.";
       }
       
       return myString;
    }
    
    public List<String> parseToString() {
        List<String> retVal = new ArrayList<>();
        if (checkIfPolygon() == 1) {
            for (Point point : pointList) {
                String[] retX = Point.parseFull(point);
                retVal.addAll(Arrays.asList(retX));
            }
        } else {
            retVal.add("This is not a string.");
        }
        
        return retVal;
    }
    
    public String[] parseToStringArray() {
        List<String> retVal = this.parseToString();
        return retVal.toArray(new String[retVal.size()]);
    }
    
    public List<String> parseToStringAndFormat() {
        List<String> retVal = new ArrayList<>();
        if (checkIfPolygon() == 1) {
            for (Point point : pointList) {
                String[] retX = Point.parseFullAndFormat(point);
                retVal.addAll(Arrays.asList(retX));
            }
        } else {
            retVal.add("This is not a string.");
        }
        
        return retVal;
    }
    
    public String[] parseToStringArrayAndFormat() {
        List<String> retVal = this.parseToStringAndFormat();
        return retVal.toArray(new String[retVal.size()]);
    }
}
