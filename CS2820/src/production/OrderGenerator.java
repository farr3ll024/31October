/**
 *
 * @author Ruben Chavez
 * @author Sam Barth
 */
package production;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class OrderGenerator {

    private ArrayList<String> items;

    public OrderGenerator() {
        try (BufferedReader br = new BufferedReader(new FileReader("../CS2820/src/production/StartingInventory.txt"))) {
            String line = br.readLine();
            while (line != null) {
                line = br.readLine();
                this.items.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Order getOrder() {
        Order o = new Order(randomAddress(), this.orderItems());
        return o;
    }

    private String randomAddress() {
        //this.R = R;
        String FirstName = randomFirstName();
        String LastName = randomLastName();
        String StreetNumber = new Integer(randomStreetNumber()).toString();
        String StreetName = randomStreetName();
        String City = randomCity();
        String State = randomState();
        String ZipCode = randomZip();
        String Address = FirstName + " "
                + LastName + "\n" + StreetNumber + " "
                + StreetName + "\n" + City + " " + State + ZipCode;
        return Address;
    }

    /**
     * @author Ruben Chavez modified from Ted Herman.MockOrders
     * @return a string containing a random street name
     */
    private String randomStreetName() {
        final String[] baseNames = {"Park Street",
            "Main Street", "Washington Boulevard",
            "Third Street", "Park Road",
            "Maple Street", "Hill Road"};

        //Random rand = null;
        Random ran = new Random();
        int x = ran.nextInt(baseNames.length);
        //int rn = rand.nextInt(baseNames.length);
        return baseNames[x];
    }

    /**
     * @author Ruben Chavez modified from Ted Herman.MockOrders
     * @return an integer in the range [1,999] for street address
     */
    private int randomStreetNumber() {
        Random ran = new Random();
        int x = ran.nextInt(998);
        return x;
    }

    /**
     * @author Ruben Chavez modified from Ted Herman.MockOrders
     * @return a random first name for an address
     */
    private String randomFirstName() {
        final String[] baseFirstNames = {"Dakota", "Emma",
            "Julian", "Nigella", "Will", "Asti", "Lee",
            "Pat", "Mavis", "Jerome", "Lilly", "Tess"};
        Random ran = new Random();
        int x = ran.nextInt(baseFirstNames.length);
        return baseFirstNames[x];
    }

    /**
     * @author Ruben Chavez modified from Ted Herman.MockOrders
     * @return a random last name for an address
     */
    private String randomLastName() {
        final String[] baseLastNames = {"Parker", "Mason",
            "Smith", "Wright", "Jefferson", "Iqbal",
            "Owens", "Lafleur", "Metselen", "Vinceroy",
            "Saville", "Troitski", "Andrews"};
        Random ran = new Random();
        int x = ran.nextInt(baseLastNames.length);
        return baseLastNames[x];
    }

    /**
     * @author Ruben Chavez modified from Ted Herman.MockOrders
     * @return a random city name
     */
    private String randomState() {
        final String[] baseState = {"IA", "NE", "MO",
            "IL", "KS", "MN", "SD", "AR", "OK", "TX"};
        Random ran = new Random();
        int x = ran.nextInt(baseState.length);
        return baseState[x];
    }

    /**
     * @author Ruben Chavez modified from Ted Herman.MockOrders
     * @return a random state code (two letters)
     */
    private String randomCity() {
        final String[] baseCity = {"Springfield", "Clinton",
            "Madison", "Franklin", "Chester", "Marion",
            "Greenville", "Salem", "Anytown", "Hope"};
        Random ran = new Random();
        int x = ran.nextInt(baseCity.length);
        return baseCity[x];
    }

    /**
     * @author Ruben Chavez modified from Ted Herman.MockOrders
     * @return a random state code (two letters)
     */
    private String randomZip() {
        String ZipCode = "";
        Random ran = new Random();
        int x = ran.nextInt(10);
        for (int i = 0; i < 6; i++) {
            ZipCode += "0123456789".charAt(x);
        }
        return ZipCode;
    }

    private ArrayList<String> orderItems() {
        ArrayList<String> orderItems = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Random ran = new Random();
            int x = ran.nextInt(this.items.size() - 1);
            orderItems.add(this.items.get(x));
            this.items.remove(x);
        }
        return orderItems;
    }
}
