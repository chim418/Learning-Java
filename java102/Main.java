package java102;

import java.util.ArrayList;

public class Main {

    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> available = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!item.isCheckedOut()) {
                available.add(item);
            }
        }
        return available;
    }
    public static void main(String[] args) {
        Point point = new Point(4, 3);
        System.out.println("x: " + point.x + " y: " + point.y);

        // Create an array of LibraryItem objects
        LibraryItem[] items = new LibraryItem[3];
        for (int i = 0; i < items.length; i++) {
            items[i] = new LibraryItem();
        }

        // Check out some items
        items[0].checkOut();
        items[2].checkOut();

        // Print the state of the items before returning
        System.out.println("Before returning items:");
        for (LibraryItem item : items) {
            System.out.println(item);
        }

        // Call the returnAll method
        returnAll(items);

        // Print the state of the items after returning
        System.out.println("\nAfter returning items:");
        for (LibraryItem item : items) {
            System.out.println(item);
        }

        items[1].checkOut();
        items[3].checkOut();

        // Get the available items
        ArrayList<LibraryItem> available = availableItems(items);

        // Print the available items
        System.out.println("Available items:");
        for (LibraryItem item : available) {
            System.out.println(item);
        }
        
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
        conditions.add("Hello".equals(arr.get(0)));
        conditions.add(conditions.get(0) || conditions.get(1));

        ArrayList<Integer> intArr = new ArrayList<>();
            for (int i = 0; i < 50; i++) {
	    intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(32));

        Grid<Integer> grid = new Grid<>(5, 0);
        grid.set(2, 2, 4);
        System.out.println(grid);
    }
    
    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";
    }

        public static void returnAll(LibraryItem[] items) {
            for (LibraryItem item : items) {
                if (item.isCheckedOut()) {
                    item.returnItem();
                }
            }
        }
}