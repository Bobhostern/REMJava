package mathClass;

import mathClass.Interfaces.LineInterface;

/**
 *
 * @author onigiri
 */
public class Line implements LineInterface {
    private Point[] linePoints = new Point[2];
    
    public Line(Point firstPoint, Point secondPoint) {
        linePoints[0] = firstPoint;
        linePoints[1] = secondPoint;
    }
    
    public Line(Line myLine) {
        linePoints = myLine.returnPointList();
    }
    
    public Line(Point[] myPoints) {
        linePoints[0] = myPoints[0];
        linePoints[1] = myPoints[1];
    }
    
    public Line() {
        linePoints[0] = new Point();
        linePoints[1] = new Point();
    }
    
    public Point returnFirstPoint() {
        return linePoints[0];
    }
    
    public Point returnSecondPoint() {
        return linePoints[1];
    }
    
    public Point[] returnPointList() {
        return linePoints;
    }
    
    @Override
    public String toString() {
        String myString = "";
        for (Point myPoint : linePoints) {
            myString += myPoint.toFormattedString();
        }
        return myString;
    }
    
    @Override
    @SuppressWarnings("deprecation")
    public String toPureString() {
        String myString = "";
        for (Point myPoint : linePoints) {
            myString += myPoint.toString();
        }
        
        return myString;
    }
    
    public String[] parseToString() {
        String[] linePointsString = new String[4];
        int x_num = 0;
        for (Point x_ : linePoints) {
            String[] x_parsed = Point.parseFull(x_);
            for (String x_x : x_parsed) {
                linePointsString[x_num++] = x_x;
            }
        }
        return linePointsString;
    }
    
    public String toInternalString() {
        String myString = "";
        for (Point myPoint : linePoints) {
            myString += myPoint.toFormattedInternalString();
        }
        return myString;
    }
    
    public String[] parseToStringAndFormat() {
        String[] linePointsString = new String[4];
        int x_num = 0;
        for (Point x_ : linePoints) {
            String[] x_parsed = Point.parseFullAndFormat(x_);
            for (String x_x : x_parsed) {
                linePointsString[x_num++] = x_x;
            }
        }
        return linePointsString;
    }
}
