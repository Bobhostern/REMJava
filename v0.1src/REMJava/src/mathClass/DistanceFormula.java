package mathClass;

import java.util.List;

/**
 *
 * @author onigiri
 */
public class DistanceFormula {
    private Point point0;
    private Point point1;
    
    public DistanceFormula (Point _0, Point _1) {
        point0 = _0;
        point1 = _1;
    }
    
    public DistanceFormula(double x1, double y1, double x2, double y2) {
        point0 = new Point(x1, y1);
        point1 = new Point(x2, y2);
    }
    
    public DistanceFormula(int x1, int y1, int x2, int y2) {
        point0 = new Point(x1, y1);
        point1 = new Point(x2, y2);
    }
    
    public DistanceFormula(Point[] points) {
        point0 = new Point(points[0]);
        point1 = new Point(points[1]);
    }
    
    public DistanceFormula(List<Point> points) {
        Point[] pointList;
        pointList = points.toArray(new Point[2]);
        point0 = new Point(pointList[0]);
        point1 = new Point(pointList[1]);
    }
    
    public double calculateDistance() {
        double point0_x = point0.returnInternalX();
        double point0_y = point0.returnInternalY();
        double point1_x = point1.returnInternalX();
        double point1_y = point1.returnInternalY();
        double solution;
        double problem = ((point1_x - point0_x) * (point1_x - point0_x)) + ((point1_y - point0_y) * (point1_y - point0_y));
        solution = Math.sqrt(problem);
        return solution;
    }
}
