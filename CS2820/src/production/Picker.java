/**
 *
 * @author Sam Barth
 * @author Ruben Chavez
 * date last modified: 12/7/2016
 *
 */
package production;

public class Picker {
    
    Order currentOrder;
    Bin currentBin;
    Shelf currentShelf;
    Orders orders;
    Belt belt;
    Inventory inventory;
    
    /**
     * 
     */
    public Picker(Orders o, Belt b, Inventory i) {
        this.orders = o;
        this.belt = b;
        this.inventory = i;
    }

    /**
     *
     *@param i The String representation of the item to be picked and added to
     *the bin
     * 
     * Postcondition: the item "item" has been added to bin and removed from
     * the shelf removes the item from the inventory
     */
    public void pick(String item) {
        if (this.currentShelf.containsItem(item)) {
            this.currentShelf.removeItem(item);
            this.inventory.remove(item);
            this.currentBin.addItem(item);
        }
        if (this.currentOrder.orderStackEmpty()){
            this.completeOrder();
        }
    }
    /**
     * 
     */
    public void completeOrder(){
        belt.deliverBin(this.currentBin);
        this.currentOrder = this.orders.getNextOrder();
        this.currentBin = new Bin(this.currentOrder);
    }
    public void deliverShelf(Shelf s){
        this.currentShelf = s;
    }
}
