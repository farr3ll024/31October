package Production;

/**
 * @author: Michael Gibler
 *
 * Date last modified: 11/14/2016
 *
 * The belt class creates an array of size 14, which is the java representation
 * of a conveyor belt. Item's can then be placed on the belt through the addItem
 * method. The belt is then moved by the beltButton method. Each time the
 * "button" is pressed, all items are moved right by one space, i.e. one spot
 * further in the array. There are a couple boolean variables to tell methods
 * when the belt is moving vs when it isn't. This helps to prevent items from
 * being lost or deleted during the running of the code.
 */
public class Belt implements Clock, Document {

    static String[] belt;
    static boolean movingBelt = false;
    /*This will prevent an error where an item is placed on the belt, and is nullified by beltButton()*/
    static boolean fullBelt = false;
    /*Alerts if belt is full, preventing from items getting lost by the code*/
    static String item;
    static int x = 14;
    /*Used for moving*/
    static int y = 0;

    /*used for constructing*/
    public static void beltConstructor() {
        /*This will build the belt by using a one dimensional array*/
        belt = new String[14];
        for (y = 0; y < 14; y++) {
            belt[y] = null;
        }
    }

    public static void beltButton() {
        /*Represents the packer pressing the belt button to move it one unit*/
        movingBelt = true;/*Alerts that the belt is moving*/
        for (x = 13; x >= 0; x--) {
            belt[x] = belt[x - 1];
            belt[x - 1] = null;
        }
        movingBelt = false;/*Alerts that belt has stopped*/
    }

    public static void addItem(String item) {/*This method will take a String item, and place that string at the start of
											the belt array.*/
        if (belt[0] != null) {
            System.out.println("The belt is full, wait to place item.");
            fullBelt = true;/*Alerts the picker that the belt is full, preventing item from being placed*/
        } else if (movingBelt = true) {
            System.out.println("The belt is moving, wait to place item.");
        } else {
            belt[0] = item;
        }
    }

    public static void printBelt() {/*This prints out the contents of the belt array space by space, effectively showing
									where items currently are on the belt.*/
        for (y = 0; y < 14; y++) {
            System.out.println("At spot" + y + "on the belt is the item" + belt[y]);
        }
    }

    public static void main() {
        beltConstructor();
        printBelt();
    }

    public static void test() {/*Test code*/
        beltConstructor();
        addItem("Doll");
        addItem("Ball");
        beltButton();
        addItem("Ball");
        beltButton();
        printBelt();
    }

    @Override
    public void tick(int iteration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
