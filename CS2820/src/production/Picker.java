/**
 *
 * @author Sam Barth
 * @author Ruben Chavez date last modified: 12/7/2016
 *
 */
package production;

public class Picker {
    
    Bin currentBin;
    Shelf currentShelf;
	boolean binFilled = false;
    
    /**
     * 
     */
    public Picker() {
    }

    /**
     *
     * @param i The String representation of the item to be picked and added to
     * the bin
     * @param s The Shelf object in which the item is contained
     * 
     * Postcondition: the item "item" has been added to bin and removed from
     * the shelf
	 *
	 *removes the item from the inventory
     */
    public void pick(String item) {
        if (currentShelf.containsItem(item)) {
            currentShelf.removeItem(item);
            this.currentBin.addItem(item);
			Inventory.removeItem(item,1);
        }
    }
	public Boolean binFilled() {
        if (currentBin.size() == OrderGenerator.orderItems.size()) {
            binFilled = true;
        } else {
            binFilled = false;
        }

        return binFilled;
    }
	
    /**
     * 
     * @param o Order corresponding to the order desired to bin
     */
    public void beginNewOrder(Order o){
        currentBin = new Bin(o);
    }/**
     * 
     */
    public void completeOrder(){
        //give the Belt the currentBin
    }
    public void deliverShelf(Shelf s){
        this.currentShelf = s;
    }
}