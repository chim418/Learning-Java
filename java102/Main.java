package java102;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + " y: " + point.y);

        Point xTranslation = point.translateX(3); // should be (7, 3)
        Point yTranslation = point.translateY(-7); // should be (4, -4)
        Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)

        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);

        System.out.println("point: " + point);

        // Practice: Center of Mass
        Point[] points = {
            new Point(2, 3),
            new Point(4, 5),
            new Point(6, 7)
        };

        Point center = Point.centerOfMass(points);
        System.out.println("Center of mass: x = " + center.x + ", y = " + center.y);
    }
}
    
    
