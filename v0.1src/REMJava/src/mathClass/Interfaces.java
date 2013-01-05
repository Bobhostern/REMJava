package mathClass;

import java.util.List;

/**
 *
 * @author onigiri
 */
public class Interfaces {
    interface PointInterface {
        public int returnX();
        public int returnY();
        public double returnInternalX();
        public double returnInternalY();
        @Override
        public String toString();
        public String toFormattedString();
        public void changeX(int x_);
        public void changeY(int y_);
    }
    
    interface PolygonInterface {
        public int returnNumberOfSides();
        public List<Point> returnPoints();
        public int checkIfPolygon();
        @Override
        public String toString();
        public String toPureString();
        public String toInternalString();
        public List<String> parseToString();
        public String[] parseToStringArray();
        public List<String> parseToStringAndFormat();
        public String[] parseToStringArrayAndFormat();
    }
    
    interface LineInterface {
        public Point returnFirstPoint();
        public Point returnSecondPoint();
        public Point[] returnPointList();
        @Override
        public String toString();
        public String toPureString();
        public String[] parseToString();
        public String toInternalString();
        public String[] parseToStringAndFormat();
    }
    
    interface DistanceFormulaInterface {
        public double calculateDistance();
    }
}
