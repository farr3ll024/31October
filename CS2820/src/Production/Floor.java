package Production;

import java.awt.Point;

/**
 *
 * @author TrevorFinley
 * @version 0.3
 *
 * The Floor class is designed to construct relative x/y coordinates of type
 * Point for all static locations such as charger, shelves, docks, etc.
 *
 */
public class Floor {

    final static Point charger = new Point(0, 0);
    final static Point recdock = new Point(0, 15);
    final static Point picker = new Point(14, 2);
    final static Point packer = new Point(14, 14);
    final static Point shipdock = new Point(15, 15);
    public static Point[] shelf = new Point[81];
    public static Point[] belt = new Point[15];

    //for loop that constructs shelves and their respective coordinates
    public static void constructBelt() {
        for (int i = 0; i < belt.length; i++) {
            belt[i] = new Point();
        }

        for (int b = 1; b < belt.length; b++) {
            belt[b] = new Point(15, b);
        }
    }

    public static void constructShelf() {
        //initializes shelf array
        for (int i = 0; i < shelf.length; i++) {
            shelf[i] = new Point();
        }

        for (int s = 1, x = 3; x <= 13; x++) {
            //catches highway gaps
            if (x == 7) {
                x++;
                continue;
            }

            for (int y = 2; y <= 12; y++) {
                //catches highway gaps
                if (y == 5 || y == 8 || y == 11) {
                    y++;
                    continue;
                } else {
                    shelf[s] = new Point(x, y);
                    s++;

                }
            }

        }
    }

    public int getShelfLimit() {
        return shelf.length;
    }

    public Point getShelf(int n) {
        if (n > shelf.length || n < 1) {
            System.out.println("ERROR: must specify a valid shelf number between 1 and " + shelf.length);
            System.out.println("Please change the code to match.");
            return null;
        }

        return shelf[n];
    }

    public static void printMap() {
        constructShelf();
        System.out.println("-------------------------------------------------");
        for (int x = 0; x < 16; x++) {
            for (int y = 0; y < 16; y++) {
                //charging station
                if (x == charger.getX() && y == charger.getY()) {
                    System.out.print("|CH");
                    continue;
                } //receiving dock
                else if (x == recdock.getX() && y == recdock.getY()) {
                    System.out.print("|RD");
                    continue;
                } //picker station
                else if (x == picker.getX() && y == picker.getY()) {
                    System.out.print("|PI");
                    continue;
                } //packer station
                else if (x == packer.getX() && y == packer.getY()) {
                    System.out.print("|PA");
                    continue;
                } //shipping dock
                else if (x == shipdock.getX() && y == shipdock.getY()) {
                    System.out.print("|SD");
                    continue;
                } //belt
                else if (x == 15 && (y != 0 && y != 15)) {
                    System.out.print("|BL");
                    continue;
                }
                //for loop scans through shelf array and prints for each shelf point matched with current coordinate
                for (int i = 1; i < shelf.length; i++) {
                    if ((int) shelf[i].getX() == x && (int) shelf[i].getY() == y) {
                        System.out.print("|SH");
                        y++;
                        break;
                    }
                }

                //blank cell
                System.out.print("|  ");
            }
            System.out.println("|");
            System.out.println("-------------------------------------------------");
        }
    }

//    public static void main (String[] args)
//    {
//    	constructShelf();
//        printMap();
//    }
}
