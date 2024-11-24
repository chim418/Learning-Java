package java102;

import java.util.ArrayList;

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

        // Practice: Angle
        Point point1 = new Point(1, 1); 
        Point point2 = new Point(-1, 1);
        Point point3 = new Point(-1, -1);
        Point point4 = new Point(1, -1);

        System.out.println("Point 1 Angle: " + point1.angle());
        System.out.println("Point 2 Angle: " + point2.angle());
        System.out.println("Point 3 Angle: " + point3.angle());
        System.out.println("Point 4 Angle: " + point4.angle());

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Hello");
        arr.add("World");
        System.out.println(arr);
        arr.set(0, "Goodbye");
        System.out.println(arr);

        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(arr.get(0) == "Hello");
        conditions.add(conditions.get(0) || conditions.get(1));

        ArrayList<Integer> intArr = new ArrayList<>();
            for (int i = 0; i < 50; i++) {
	    intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));

        
    }
}
    
